package com.demo.ledger.feign;

import com.demo.common.to.RecordTo;
import com.demo.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("demo-extra")
public interface ExtraFeignService {

    @RequestMapping("/extra/record/noticeServe")
    public R noticeServe(@RequestBody RecordTo vo);

}
