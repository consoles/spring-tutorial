package ren.consoles.spring.aop.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * 环绕通知
 * 综合了前置通知，返回通知和异常通知
 * @author gaopengfei
 *
 */
public class HijackAroundMethod implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		
		System.out.println("Method name:" + invocation.getMethod().getName());
		System.out.println("Method arguments:" + invocation.getArguments());
		
		// 前置通知
		System.out.println("这部分代码相当于前置通知MethodBeforeAdvice");
		
		try{
			Object result = invocation.proceed();
			// 返回通知
			System.out.println("这部分代码相当于后置通知AfterReturnAdvice");
			return result;
		} catch(IllegalArgumentException e){
			// 异常通知
			System.out.println("这部分代码相当于异常通知");
			throw e;
		}
		
	}

}
