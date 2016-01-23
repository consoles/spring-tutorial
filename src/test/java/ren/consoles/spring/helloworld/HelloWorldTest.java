/**
 * 
 */
package ren.consoles.spring.helloworld;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author gaopengfei
 *
 */
public class HelloWorldTest {

	private static ApplicationContext context; 
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		context = new ClassPathXmlApplicationContext("SpringBeans.xml");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link ren.consoles.spring.helloworld.HelloWorld#pringHello()}.
	 */
	@Test
	public void testPringHello() {
		HelloWorld helloWorld = context.getBean(HelloWorld.class);
		helloWorld.pringHello();
	}

}
