package com.demo.ledger.demoledger;

import com.demo.ledger.dao.ContentDao;
import com.demo.ledger.entity.ContentEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoLedgerApplicationTests {

    @Autowired
    private ContentDao dao;

    @Test
    void contextLoads() {
        ContentEntity entity = new ContentEntity();
        entity.setPayName("测试");
        dao.insert(entity);
        System.out.println("保存成功！");
    }

}
