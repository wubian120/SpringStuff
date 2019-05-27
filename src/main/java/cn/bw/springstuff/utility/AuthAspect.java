package cn.bw.springstuff.utility;

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.javassist.NotFoundException;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.MethodParameter;
import org.springframework.stereotype.Component;

import java.util.Map;

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



        MethodSignature methodSignature = (MethodSignature) pjp.getSignature();

        String[] paraNames = methodSignature.getParameterNames();



        log.info(" ------ 方法执行之前 ---------");

//        for(String name : paraNames){
//            log.warn("ParaName: " + name);
//        }

        Object[] objs = pjp.getArgs();
//        for(Object obj : objs){
//            String s =  String.valueOf(obj);
//            log.warn(" hahaha: " + s);
//        }

        for(int i=0;i<paraNames.length;i++){
            if(paraNames[i].equals("name")){
                log.warn("get you: name-value " + String.valueOf(objs[i]));

            }
        }
        Object proceed = pjp.proceed();
        log.info(" ------ 方法执行之后 ---------");
        return proceed;
    }




}
