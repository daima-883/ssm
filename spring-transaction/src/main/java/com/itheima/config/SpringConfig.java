package com.itheima.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/*
这是使用的纯注解开发，利用配置类来取代xml文件，所以applicationContext.xml配置是没有使用的，这里有是因为我懒得删，
后面我基本使用xml来配置不会使用配置类，这里使用是因为熟悉一下，避免看不懂别人的代码
 */
@Configuration//表明这是一个核心配置类
@ComponentScan("com.itheima")//注解扫描器
@PropertySource("classpath:db.properties")//加载配置文件
@Import({JDBCConfig.class,MybatisConfig.class})//导入相关配置类
@EnableTransactionManagement
public class SpringConfig {
}
