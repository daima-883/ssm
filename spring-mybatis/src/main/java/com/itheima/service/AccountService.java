package com.itheima.service;

import com.itheima.pojo.Account;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface AccountService {
    void save(Account account);

    void delete(Integer id);

    void update(Account account);

    List<Account> findAll();

    Account findById(Integer id);
}
