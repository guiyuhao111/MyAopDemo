package cn.net.gxht.aop.util;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/12/2.
 */
@Component
@Aspect
public class Operator {
//    //    A:@Pointcut("execution(* com.aijava.springcode.service..*.*(..))")
////    第一个*表示匹配任意的方法返回值，..(两个点)表示零个或多个，
////    上面的第一个..表示service包及其子包,第二个*表示所有类,第三个*表示所有方法，第二个..表示
////     方法的任意参数个数
////    B:@Pointcut("within(com.aijava.springcode.service.*)")
////    within限定匹配方法的连接点,上面的就是表示匹配service包下的任意连接点
////    C:@Pointcut("this(com.aijava.springcode.service.UserService)")
////    this用来限定AOP代理必须是指定类型的实例，如上，指定了一个特定的实例，就是UserService
////    D:@Pointcut("bean(userService)")
//    @Pointcut("execution(* cn.net.gxht.aop.service..*.*(..))")
//    public void pointCut() {
//    };
//
//    //    (1)Before:在目标方法被调用之前做增强处理,@Before只需要指定切入点表达式即可
//    @Before("pointCut()")
//    public void doBefore(JoinPoint joinPoint) {
////        System.out.println("Operator.doBefore");
//    }
//
//    //    Around:环绕通知,在目标方法完成前后做增强处理,环绕通知是最重要的通知类型,像事务,
////   日志等都是环绕通知,注意编程中核心是一个ProceedingJoinPoint
//    @Around("pointCut()")
//    public void doAround(ProceedingJoinPoint proceedingJoinPoint) {
//        try {
//            proceedingJoinPoint.proceed();
//        } catch (Throwable throwable) {
//            throwable.printStackTrace();
//        }
////        System.out.println("Operator.doAround");
//    }
//
//    //    After:在目标方法完成之后做增强，无论目标方法时候成功完成。@After可以指定一个切入点表达式
//    @After("pointCut()")
//    public void doAfter(JoinPoint joinPoint) {
////        System.out.println("Operator.doAfter");
//    }
//
//    //    AfterReturning:在目标方法正常完成后做增强,@AfterReturning除了指定切入点表达式后，
////   还可以指定一个返回值形参名returning,代表目标方法的返回值
//    @AfterReturning(pointcut = "pointCut()", returning = "returnVal")
//    public void doAfterReturning(JoinPoint joinPoint, Object returnVal) {
////        System.out.println("Operator.doAfterReturning:" + returnVal);
//    }
//
//    //    AfterThrowing:主要用来处理程序中未处理的异常,@AfterThrowing除了指定切入点表达式后，
////    还可以指定一个throwing的返回值形参名,可以通过该形参名来访问目标方法中所抛出的异常对象
//    @AfterThrowing(value = "pointCut()", throwing = "error")
//    public void doAfterThrowing(JoinPoint joinPoint, Throwable error) {
////        System.out.println("Operator.doAfterThrowing:" + error);
//    }
}
