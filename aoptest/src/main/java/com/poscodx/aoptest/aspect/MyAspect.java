package com.poscodx.aoptest.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class MyAspect {
	
	@Before("execution(public com.poscodx.aoptest.vo.ProductVo com.poscodx.aoptest.service.ProductService.find(String))")
	public void adviceBefore() {
		System.out.println("---- Before Advice ----");
	}
	
	@After("execution(com.poscodx.aoptest.vo.ProductVo com.poscodx.aoptest.service.ProductService.find(String))")
	public void adviceAfter() {
		System.out.println("---- After Advice ----");
	}

	@AfterReturning("execution(* com.poscodx.aoptest.service.ProductService.find(String))")
	public void adviceAfterReturning() {
		System.out.println("---- AfterReturning Advice ----");
	}

	@AfterThrowing(value="execution(* *..*.*.*(..))", throwing="ex")
	public void adviceAfterThrowing(Throwable ex) {
		System.out.println("---- AfterThrowing Advice:" + ex + " ----");
	}

	@Around("execution(* *..*.ProductService.*(..))")
	public Object adviceAround(ProceedingJoinPoint pjp) throws Throwable {
		/* before */
		System.out.println("---- Around(before) Advice ----");
		
		/* Point Cut Method 실행 */
		
		// Object[] params = {"Camera"};
		// Object result = pjp.proceed(params);
		
		Object result = pjp.proceed();
		
		/* after */
		System.out.println("---- Around(after) Advice ----");
		
		return result;
	}
	
}
