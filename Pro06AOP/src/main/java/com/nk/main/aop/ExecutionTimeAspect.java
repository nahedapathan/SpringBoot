package com.nk.main.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ExecutionTimeAspect {

	
	@Around(value="execution(* com.nk.main.service.CalculatorService.*(..))")
	public Object logExecutionTime(ProceedingJoinPoint joinpoint) throws Throwable
	{
		long startTime=System.currentTimeMillis();
		Object result=joinpoint.proceed();
		long endTime=System.currentTimeMillis();
		
		//print to console
		System.out.println(joinpoint.getSignature()+" executed in "+(endTime-startTime)+"* ms");
		
		return result;
	}
}
