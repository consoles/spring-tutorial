package ren.consoles.spring.aop.advice;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ren.consoles.spring.aop.advice.CustomerService;
/**
 * Spring前置通知：在方法前面加了一个拦截器
 * Spring返回通知：在方法正常结束后执行
 * Spring异常通知：捕获方法的特定异常
 * Spring绕环通知：综合以上的3种通知
 */
public class CustomerServiceTest {

	private static ApplicationContext context; 
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		context = new ClassPathXmlApplicationContext("AOP-advice.xml");
	}

	@Test
	public void test() {
		CustomerService cust = (CustomerService) context.getBean("customerServiceProxy");

        cust.printName();
        cust.printURL();
        cust.printThrowException();
	}

}
