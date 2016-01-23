package ren.consoles.spring.attrInject;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Spring Bean的嵌套
 * @author gaopengfei
 *
 */
public class CustomerTest {

	static ApplicationContext context;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		context = new ClassPathXmlApplicationContext("AttrInject.xml");
	}

	@Test
	public void test() {
		Customer customer1 = (Customer) context.getBean("customer1");
		Customer customer2 = (Customer) context.getBean("customer2");
		Customer customer3 = (Customer) context.getBean("customer3");
		Customer customer4 = (Customer) context.getBean("customer4"); // 复杂属性的注入
		
		System.out.println(customer1.toString());
		System.out.println(customer2.toString());
		System.out.println(customer3.toString());
		System.out.println(customer4.toString());
		
	}

}
