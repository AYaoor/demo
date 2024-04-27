package com.demo.extra;

import com.demo.extra.dao.RecordDao;
import com.demo.extra.entity.RecordEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class DemoExtraApplicationTests {

    @Autowired
    private RecordDao recordDao;

    @Test
    void contextLoads() {
        RecordEntity entity = new RecordEntity();
        entity.setMsgIn("测试");
        entity.setCreateTime(new Date());
        recordDao.insert(entity);
    }

}
