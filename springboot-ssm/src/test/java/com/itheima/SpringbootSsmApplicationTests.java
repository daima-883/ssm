package com.itheima;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.domain.Book;
import com.itheima.mapper.BookMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

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
    //按条件查询
    //方式一:常规模式
    @Test
    public void selectByQuery1(){
        QueryWrapper<Book> qw = new QueryWrapper<Book>();
        //下面2行写法不一样，但是结果，意思一样
        qw.lt("count",60);//查询count字段小于20
        qw.lambda().gt(Book::getCount,20);//查询count字段大于20，这种写法避免字段书写出错
        List<Book> bookList = bookMapper.selectList(qw);
        System.out.println(bookList);
    }
    //方式二：链式编程（并且关系的时候用）
    @Test
    public void selectByQuery2(){
        QueryWrapper<Book> qw = new QueryWrapper<Book>();
        qw.lt("count",60).gt("count",20);//并且关系可以用链式法
        List<Book> bookList = bookMapper.selectList(qw);
        System.out.println(bookList);
    }
    //方式3：lambda格式
    @Test
    public void selectByQuery3(){
        QueryWrapper<Book> qw = new QueryWrapper<Book>();
        qw.lambda().lt(Book::getCount,60);//查询count字段小于20
        qw.lambda().gt(Book::getCount,20);//查询count字段大于20，这种写法避免字段书写出错
        List<Book> bookList = bookMapper.selectList(qw);
        System.out.println(bookList);
    }
    //方式4：简化版lambda格式
    @Test
    public void selectByQuery4(){
        LambdaQueryWrapper<Book> lqw = new LambdaQueryWrapper<Book>();
//        //查询条件为20-60数量的图书
//        lqw.lt(Book::getCount,60).gt(Book::getCount,20);
        //查询条件为小于20或者大于60数量的图书
        lqw.lt(Book::getCount,20).or().gt(Book::getCount,60);
        List<Book> bookList = bookMapper.selectList(lqw);
        System.out.println(bookList);
    }
}
