package com.itheima.test;

import com.itheima.config.SpringConfig;
import com.itheima.dao.AccountDao;
import com.itheima.pojo.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
//配置类用
@ContextConfiguration(classes = {SpringConfig.class})
//配置文件用
//@ContextConfiguration(locations = {contextApplication.xml})
public class TestAccountDao {
    @Autowired
    private AccountDao accountDao;
    @Test
    public void textFindAll(){
        List<Account> all = accountDao.findAll();
        System.out.println(all);
    }
}
