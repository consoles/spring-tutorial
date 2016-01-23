package ren.consoles.spring.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 基于注解的属性注入
 * @author gaopengfei
 *
 */
@Component("item2")
public class Item2 {
	
	@Value("item2 name")
	private String name;
	
	@Value("100")
	private int total;
	
	public Item2() {

	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "Item [name=" + name + ", total=" + total + "]";
	}
	
}
