package ren.consoles.spring.multiConfFile.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AConfig {

	@Bean(name="a")
	public A getA() {
		return new A();
	}
}
