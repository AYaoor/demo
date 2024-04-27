package com.demo.notepad.controller;

import com.demo.common.to.RecordTo;
import com.demo.common.utils.PageUtils;
import com.demo.common.utils.R;
import com.demo.notepad.entity.ContentEntity;
import com.demo.notepad.feign.ExtraFeignService;
import com.demo.notepad.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;



/**
 * 
 *
 * @author tianyao
 * @email tianyao@email.com
 * @date 2024-02-22 11:55:48
 */
@RestController
@RequestMapping("content")
public class ContentController {
    @Autowired
    private ContentService contentService;

    @Autowired
    private ExtraFeignService extraFeignService;

    @RequestMapping("/noticeServeTest")
    public R noticeServeTest() {
        RecordTo vo = new RecordTo();
        vo.setInterfaceName("noticeServeTest");
        vo.setMsgIn("{\"username\":\"zhangsan\",\"age\":\"18\"}");
        R r = extraFeignService.noticeServe(vo);
        return r;
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = contentService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		ContentEntity content = contentService.getById(id);

        return R.ok().put("content", content);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ContentEntity content){
		contentService.save(content);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ContentEntity content){
		contentService.updateById(content);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		contentService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
