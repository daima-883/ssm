package com.itheima.advice;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//通知类必须配置成Spring管理的bean
@Component
//设置当前类为切面类类
@Aspect
public class Myadvice {
    //设置切入点，@Pointcut注解要求配置在方法上方
    //我要增强com.itheima.dao下面BookDao接口中的save开头的没有返回值的空参方法
    @Pointcut("execution(void com.itheima.dao.BookDao.save*())")
    private void pt(){}//根本没有发挥方法的功能，只能算是一个“方法变量”
    //设置在切入点pt()的前面运行当前操作(前置通知)
    @After("pt()")//@After是后置通知（在切入点后执行）@Before是前置通知 （在切入点前执行）
    public void method(){
        System.out.println(System.currentTimeMillis());
    }
    @Before("pt()")
    public void method2(){
        System.out.println("@Before是前置通知");
    }
}
