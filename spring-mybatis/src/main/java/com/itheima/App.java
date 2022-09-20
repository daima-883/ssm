package com.itheima;

import com.itheima.config.SpringConfig;
import com.itheima.dao.AccountDao;
import com.itheima.pojo.Account;
import com.itheima.service.AccountService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;

import java.util.List;
@Controller
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
//        AccountDao accountDao = applicationContext.getBean(AccountDao.class);
//        List<Account> all = accountDao.findAll();
        AccountService applicationContextBean = applicationContext.getBean(AccountService.class);
        List<Account> all = applicationContextBean.findAll();
        System.out.println(all);
    }
}
