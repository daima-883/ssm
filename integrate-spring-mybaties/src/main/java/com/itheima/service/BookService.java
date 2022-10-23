package com.itheima.service;

import com.itheima.pojo.Book;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface BookService {
    List<Book> findAll();
    public int save(Book book);  //返回值表示影响的行数
    public int update(Book book);
    public int delete(Integer id);
    public Book getById(Integer id);
}
