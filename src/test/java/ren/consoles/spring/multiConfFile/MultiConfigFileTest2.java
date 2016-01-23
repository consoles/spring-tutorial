/**
 * 
 */
package ren.consoles.spring.multiConfFile;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author gaopengfei
 *
 * 测试读取多个Spring Bean的配置文件
 */
public class MultiConfigFileTest2 {

	private static ApplicationContext context; 
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		/**
		 * 将多个Spring的配置文件导入到总的配置文件中，读取这个文件即可
		 */
		context = new ClassPathXmlApplicationContext("Spring-All.xml");
	}

	@Test
	public void testReadMultiConfFile() {
		Common common = (Common) context.getBean("common");
		Connection connection = (Connection) context.getBean("connection");
		ModuleA moduleA = (ModuleA) context.getBean("moduleA");
		
		common.common();
		connection.connection();
		moduleA.modeleA();
	}

}
