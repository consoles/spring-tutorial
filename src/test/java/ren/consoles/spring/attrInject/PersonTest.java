package ren.consoles.spring.attrInject;

import org.junit.BeforeClass;
import org.junit.Test;
/**
 * 属性注入（setter注入）
 * @author gaopengfei
 *
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class PersonTest {

	static ApplicationContext context;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		context = new ClassPathXmlApplicationContext("AttrInject.xml"); 
	}

	@Test
	public void test() {
		Person p1 = (Person) context.getBean("person1");
		System.out.println(p1.toString());
	}

}
