package com.itheima.config;

import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
//设置SpringMvc高级功能
public class SpringMvcSupport extends WebMvcConfigurationSupport {
    //静态资源放行设置
    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        //如果你的访问路径符合/html/**，我对/html文件夹放行
        registry.addResourceHandler("/html/**").addResourceLocations("/html");
    }
}
