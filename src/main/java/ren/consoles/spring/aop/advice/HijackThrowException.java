package ren.consoles.spring.aop.advice;

import org.springframework.aop.ThrowsAdvice;

/**
 * Spring异常通知
 * @author gaopengfei
 *
 */
public class HijackThrowException implements ThrowsAdvice {
	
	/**
	 * 捕获方法中的IllegalArgumentException异常，交给这个方法处理
	 */
	public void afterThrowing(IllegalArgumentException e) throws Throwable {
        System.out.println("HijackThrowException : Throw exception hijacked!");
	}
}
