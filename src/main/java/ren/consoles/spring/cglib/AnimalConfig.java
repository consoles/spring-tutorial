package ren.consoles.spring.cglib;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 基于注解的bean配置
 * @author gaopengfei
 * 类似于：
 * <bean id="animal" class="ren.consoles.spring.cglib.Dog"></bean>
 */
@Configuration
public class AnimalConfig {

	@Bean(name = "animal")
	public Animal getAnimal() {
		return new Dog();
	}
}
