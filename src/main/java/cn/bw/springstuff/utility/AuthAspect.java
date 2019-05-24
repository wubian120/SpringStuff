package cn.bw.springstuff.utility;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @auther: bian.wu
 * @date: 2019/5/24 11:38
 */
@Slf4j
@Aspect
@Component
public class AuthAspect {

    @Pointcut("@annotation(auth)")
    public void doAuth(Auth auth){

    }

    @Around("doAuth(auth)")
    public Object doBefore(ProceedingJoinPoint pjp, Auth auth) throws Throwable{
        log.info(" ------ 方法执行之前 ---------");
        Object proceed = pjp.proceed();
        log.info(" ------ 方法执行之后 ---------");
        return proceed;
    }

}
