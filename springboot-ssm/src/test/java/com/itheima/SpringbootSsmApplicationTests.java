package com.itheima;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.domain.Book;
import com.itheima.domain.QueryBook;
import com.itheima.mapper.BookMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@SpringBootTest
class SpringbootSsmApplicationTests {
    @Autowired
    private BookMapper bookMapper;
    //测试批量删除，查询同理
    @Test
    public void testDelete(){
        List<Integer> bookList = new ArrayList<>();
        bookList.add(7);
        bookList.add(8);
        bookList.add(9);
        bookMapper.deleteBatchIds(bookList);

    }
}
