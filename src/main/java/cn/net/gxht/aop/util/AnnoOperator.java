package cn.net.gxht.aop.util;

import cn.net.gxht.aop.entity.MyAnnotation;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/12/2.
 * 扫描自定义注解的切面
 */
@Aspect
@Component
public class AnnoOperator {
//    @Pointcut(value = "execution(* cn.net.gxht.aop.service..*.*(..))")
//    public void pointCut(){};
    @Around("@annotation(anon)")
    public Object advice(ProceedingJoinPoint joinPoint,MyAnnotation anon) throws Throwable {
        System.out.println("name:"+anon.name());
        System.out.println("value:"+anon.value());
        System.out.println("目标方法执行前");
        Object  o= joinPoint.proceed();
        System.out.println("目标方法执行结束:"+"返回值:"+o);
        return anon.name()+","+anon.value();
    };

}
