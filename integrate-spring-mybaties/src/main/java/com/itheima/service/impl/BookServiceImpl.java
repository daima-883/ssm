package com.itheima.service.impl;

import com.itheima.dao.BookDao;
import com.itheima.pojo.Book;
import com.itheima.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;

    @Override
    public List<Book> findAll() {
        return bookDao.findAll();
    }

    @Override
    public int save(Book book) {
        int num=bookDao.save(book);
        return num;
    }

    @Override
    public int update(Book book) {
        int num = bookDao.update(book);
        return num;
    }

    @Override
    public int delete(Integer id) {
        int num = bookDao.delete(id);
        return num;
    }

    @Override
    public Book getById(Integer id) {
        Book book = bookDao.getById(id);
        return book;
    }
}
