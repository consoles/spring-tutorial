package ren.consoles.spring.cglib;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 基于注解的Spring Bean的配置
 * @author gaopengfei
 * 注意：此处的ApplicationContext的实例化方式
 */
public class AnimalTest {

	private static ApplicationContext context;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		// 从注解中获取bean的配置信息
		context = new AnnotationConfigApplicationContext(AnimalConfig.class);
	}
	
	@Test
	public void testMakeSound() {
		Animal animal = (Animal) context.getBean("animal");
		animal.makeSound();
	}

}
