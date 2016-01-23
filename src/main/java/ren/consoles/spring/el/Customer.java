
package ren.consoles.spring.el;

public class Customer {

	private Item item;
	private String itemName;
	private double amount;
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
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
		return "Customer [item=" + item + ", itemName=" + itemName + ", amount=" + amount + "]";
	}

}
