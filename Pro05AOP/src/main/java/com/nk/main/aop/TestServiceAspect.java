package com.nk.main.aop;
/*
 * notee for nk:at a time only one choose if you go for
 * arround comment out before after ya viceversa
 */
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TestServiceAspect {

	@Before(value= "execution(* com.nk.main.service.TestService.*(..))")
	public void m1()
	{
		System.out.println("Authenticate done... and transition started............");
	}
	
	@After(value="execution(* com.nk.main.service.TestService.*(..))")
	public void m2()
	{
		System.out.println("Completed Transaction..........transaction closed..");
	}
	
	@Around(value="execution(* com.nk.main.service.TestService.*(..))")
	public void m3(ProceedingJoinPoint joinpoint) throws Throwable
	{
		System.out.println("before method around called......");
		joinpoint.proceed();
		System.out.println("after method around called......");
	}
	
	@AfterReturning(value="execution(* com.nk.main.service.TestService.deposit(..))")
	public void m4()
	{
		System.out.println("Completed Transaction..........transaction closed..");
	}
}
