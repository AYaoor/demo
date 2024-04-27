package com.demo.extra.controller;

import com.alibaba.fastjson.JSONObject;
import com.demo.common.to.RecordTo;
import com.demo.common.utils.PageUtils;
import com.demo.common.utils.R;
import com.demo.extra.entity.RecordEntity;
import com.demo.extra.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Map;

@RestController
@RequestMapping("record")
public class RecordController {

    @Autowired
    private RecordService recordService;

    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = recordService.queryPage(params);
        return R.ok().put("page", page);
    }

    @RequestMapping("/noticeServe")
    public R noticeServe(@RequestBody RecordTo vo) {
        R result = R.ok().put("msg", "保存成功！");

        RecordEntity entity = new RecordEntity();
        entity.setType("2");
        entity.setInterfaceName(vo.getInterfaceName());
        entity.setMsgIn(vo.getMsgIn());
        entity.setMsgOut(JSONObject.toJSONString(result));
        entity.setCreateTime(new Date());
        recordService.save(entity);
        return result;
    }

}
