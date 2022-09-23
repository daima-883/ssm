package com.itheima.config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;
//web容器配置类，加载SpringMVC配置，并设置SpringMVC请求拦截的路径
public class ServletContainersInitConfig extends AbstractDispatcherServletInitializer {
    //加载springmvc配置类，产生springmvc容器（本质还是spring容器）
    @Override
    protected WebApplicationContext createServletApplicationContext() {
        //初始化WebApplicationContext对象
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        //加载指定配置类
        ctx.register(SpringMvcConfig.class);
        return ctx;
    }
    //设置由springmvc控制器处理的请求映射路径
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};//所有请求都会由springmvc来处理
    }
    //加载spring配置：当前我们的项目是springmvc的入门，内部没有写spring响应的内容，因此此时不用写这个方法
    @Override
    protected WebApplicationContext createRootApplicationContext() {
        return null;
    }
}
