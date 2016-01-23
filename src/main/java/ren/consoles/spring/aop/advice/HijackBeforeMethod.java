package ren.consoles.spring.aop.advice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

/**
 * Spring 前置通知
 * @author gaopengfei
 *
 */
public class HijackBeforeMethod implements MethodBeforeAdvice {

	@Override
	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		 System.out.println("HijackBeforeMethod : Before method hijacked!");
	}

}
