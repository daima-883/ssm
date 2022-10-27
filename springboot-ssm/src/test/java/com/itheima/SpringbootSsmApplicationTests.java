package com.itheima;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.domain.Book;
import com.itheima.mapper.BookMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootSsmApplicationTests {
    @Autowired
    private BookMapper bookMapper;

    @Test
    public void testSelectAll(){
        System.out.println(bookMapper.selectList(null));
    }
//    分页查询
    @Test
    public void selectByPage(){
        IPage<Book> page = new Page(2,2);
        IPage<Book> bookIPage = bookMapper.selectPage(page, null);
        System.out.println(bookIPage.getRecords());

    }

}
