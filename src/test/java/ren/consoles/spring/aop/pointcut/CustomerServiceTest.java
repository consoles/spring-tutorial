package ren.consoles.spring.aop.pointcut;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerServiceTest {

	private static ApplicationContext context; 
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		context = new ClassPathXmlApplicationContext("AOP-pointcut.xml");
	}

	@Test
	public void test() {
		CustomerService cust = (CustomerService) context.getBean("customerServiceProxy");

        cust.printName();
        cust.printURL();
        cust.printThrowException();
	}

}
