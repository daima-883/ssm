package com.itheima.config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

//启动tomcat自动执行这个类去初始化Spring和SpringMvc的配置文件
//这个类才是项目开头位置
public class ServletContainersInitConfig extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{SpringConfig.class};//Spring初始化
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringMvcConfig.class};//SpringMvc初始化
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};//所有路径都交给SpringMvc管理
    }
}
