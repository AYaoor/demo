package com.demo.ledger.controller;

import java.util.Arrays;
import java.util.Map;

import com.demo.common.to.RecordTo;
import com.demo.ledger.feign.ExtraFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.ledger.entity.ContentEntity;
import com.demo.ledger.service.ContentService;
import com.demo.common.utils.PageUtils;
import com.demo.common.utils.R;



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
