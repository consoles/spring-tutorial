
package ren.consoles.spring.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("customer2")
public class Customer2 {
	
	/**
	 * 基于注解的Spring EL
	 */
	@Value("#{item2}")
	private Item2 item;
	
	@Value("#{item2.name}")
	private String itemName;
	
	/**
	 * Spring EL method invocation
	 */
	@Value("#{price.getSpecialPrice()}")
	private double amount;
	
	public Customer2() {

	}
	
	public Item2 getItem() {
		return item;
	}
	public void setItem(Item2 item) {
		this.item = item;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Customer2 [item=" + item + ", itemName=" + itemName + ", amount=" + amount + "]";
	}
	
}
