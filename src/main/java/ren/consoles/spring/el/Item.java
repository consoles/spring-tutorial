package ren.consoles.spring.el;

public class Item {

	private String name;
	private int total;
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
