package com.itheima.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

//通知类必须配置成Spring管理的bean
@Component
//设置当前类为切面类类
@Aspect
public class MyadviceAround {
    @Pointcut("execution(void com.itheima.dao.BookDao.save*())")
    private void pt() {
    }//根本没有发挥方法的功能，只能算是一个“方法变量”

    @Around("pt()")//环绕通知必定执行，就算没有调用切入点，环绕通知与其他四种类型是对立关系，不共存（这样理解就行虽然不是这样说的）
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        Object ret = null;
        try {
            System.out.println("Before");
            ret = pjp.proceed();//此代码表示调用切入点方法（即原始方法调用）
            System.out.println("@AfterReturning");
        } catch (Throwable e) {
            System.out.println("@AfterThrowing");
        } finally {
            System.out.println("After");
        }
        return ret;
    }
}
