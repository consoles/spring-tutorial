package ren.consoles.spring.el;

import org.springframework.stereotype.Component;

@Component("price")
public class Price {
	
	public double getSpecialPrice(){
		return 11.28;
	}
}