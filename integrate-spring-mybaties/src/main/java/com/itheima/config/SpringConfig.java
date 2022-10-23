package com.itheima.config;

import org.springframework.context.annotation.*;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan("com.itheima.service")
@PropertySource("classpath:db.properties")
@Import({JDBCConfig.class,MybatiesConfig.class})
@EnableTransactionManagement //开启Spring事务管理
public class SpringConfig {
}
