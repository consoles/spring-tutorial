package ren.consoles.spring.scope;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarTest {

	private static ApplicationContext context;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		context = new ClassPathXmlApplicationContext("BeanScope.xml");
	}

	@Test
	public void test() {
		// Spring中的Bean的Scope默认是单例（同一Bean的id）
		Car car1 = (Car) context.getBean("car1");
		Car car11 = (Car) context.getBean("car1");
		System.out.println(car1 == car11);
		
		// 通过设置其scope为prototype改变其单例模式
		Car car2 = (Car) context.getBean("car2");
		Car car22 = (Car) context.getBean("car2");
		System.out.println(car2 == car22);
	}

}
