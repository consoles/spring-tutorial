package ren.consoles.spring.el;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerTest {

	private static ApplicationContext context; 
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		context = new ClassPathXmlApplicationContext("Spring-el.xml");
	}

	@Test
	public void test() {
		Customer customer = (Customer) context.getBean("customerBean");
		System.out.println(customer);
	}
	
}
