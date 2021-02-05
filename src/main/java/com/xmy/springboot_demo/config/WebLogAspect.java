package com.xmy.springboot_demo.config;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

@Aspect
@Component
@Slf4j
public class WebLogAspect {
    @Pointcut("execution(public * com.xmy.springboot_demo.controller..*(..))")
    public void controller() {
    }

    /**
     * controller parameter method print
     * @param joinPoint 切点
     */
    @Before("controller()")
    public void doBefore(JoinPoint joinPoint) {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        log.info("URL :{}", request.getRequestURI());
        log.info("Class Method :{}",
                joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
        StringBuilder method = this.getParameterString(((MethodSignature) joinPoint.getSignature()).getParameterNames(),
                joinPoint.getArgs());
        log.info("Parameter :\n{} ", method);
    }

    /**
     * return print
     * @param res 定义方法入参形参
     */
    @AfterReturning(returning = "res",pointcut = "controller()")
    public void doAfterReturning(Object res){
        log.info("Return :\n{}",JSON.toJSONString(res));
    }

    /**
     * 获取方法参数
     *
     * @param names 方法名
     * @param objects 方法参数
     * @return
     */
    private StringBuilder getParameterString(String[] names, Object[] objects) {
        StringBuilder parameterStr = new StringBuilder();
        try {
            for (int i = 0; i < names.length; i++) {
                parameterStr.append(names[i])
                        .append(" : " + JSON.toJSONString(objects[i]))
                        .append('\n');
            }
        }catch (Exception e){
            log.error("not support objects type");
        }

        return parameterStr;
    }




}
