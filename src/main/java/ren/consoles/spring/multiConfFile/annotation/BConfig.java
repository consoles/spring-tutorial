package ren.consoles.spring.multiConfFile.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BConfig {

	@Bean(name="b")
	public B getB() {
		return new B();
	}
}
