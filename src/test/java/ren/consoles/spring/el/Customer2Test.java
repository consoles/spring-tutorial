package ren.consoles.spring.el;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Customer2Test {

	private static ApplicationContext context; 
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		context = new ClassPathXmlApplicationContext("Spring-el2.xml");
	}

	@Test
	public void test() {
		Customer2 customer2 = (Customer2) context.getBean("customer2");
		System.out.println(customer2.toString());
	}

}
