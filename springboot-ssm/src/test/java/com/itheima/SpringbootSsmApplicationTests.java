package com.itheima;

import com.itheima.mapper.BookMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootSsmApplicationTests {
    @Autowired
    private BookMapper bookMapper;
    //逻辑删除，数据库实际没有删除，只是加了标记
    @Test
    public void testDelete(){
        bookMapper.deleteById(14);
    }
}
