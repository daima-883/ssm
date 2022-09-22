package com.itheima.test;

import com.itheima.config.SpringConfig;
import com.itheima.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringConfig.class})
public class TransactionTest {
    @Autowired
    private AccountService accountService;
    @Test
    public void test1(){
        accountService.transfer("Tom","Jerry",500.00);
    }
}
