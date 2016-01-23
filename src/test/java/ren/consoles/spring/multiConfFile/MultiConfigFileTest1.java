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
public class MultiConfigFileTest1 {

	private static ApplicationContext context; 
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		/**
		 * 以数组的方式读取
		 */
		context = new ClassPathXmlApplicationContext(new String[]{"common/Spring-Common.xml","connection/Spring-Connection.xml","moduleA/Spring-ModuleA.xml"});
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
