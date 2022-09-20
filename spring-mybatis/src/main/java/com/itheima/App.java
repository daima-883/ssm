package com.itheima;

import com.itheima.dao.AccountDao;
import com.itheima.pojo.Account;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        AccountDao accountDao = applicationContext.getBean(AccountDao.class);
        List<Account> all = accountDao.findAll();
        System.out.println(all);
    }
}
