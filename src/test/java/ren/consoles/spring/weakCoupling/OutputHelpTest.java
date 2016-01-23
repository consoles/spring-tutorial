package ren.consoles.spring.weakCoupling;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OutputHelpTest {

	private static ApplicationContext context;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		context = new ClassPathXmlApplicationContext("WeakCoupling.xml");
	}

	@Test
	public void testGetOutput() {
		OutputHelp outputHelp = (OutputHelp) context.getBean("outputHelp");
		String output = outputHelp.getOutput();
		assertEquals("failure - strings are not equal", "JSON data", output);
	}

}
