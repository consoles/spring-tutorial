/**
 * 
 */
package ren.consoles.spring.multiConfFile;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ren.consoles.spring.multiConfFile.annotation.A;
import ren.consoles.spring.multiConfFile.annotation.AppConfig;
import ren.consoles.spring.multiConfFile.annotation.B;

/**
 * @author gaopengfei
 *
 * 测试读取多个Spring Bean的配置（基于注解）
 */
public class MultiBeansAnnotation {

	private static ApplicationContext context; 
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		context = new AnnotationConfigApplicationContext(AppConfig.class);
	}

	@Test
	public void testReadMultiConfFile() {

		A a = (A) context.getBean("a");
		B b = (B) context.getBean("b");
		
		a.a();
		b.b();
	}

}
