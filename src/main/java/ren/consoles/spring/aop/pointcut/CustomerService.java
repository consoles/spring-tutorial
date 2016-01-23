package ren.consoles.spring.aop.pointcut;

public class CustomerService {
	private String name;
	private String url;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public void printName(){
		System.out.println("Customer name:" + name);
	}
	
	public void printURL() {
		System.out.println("Customer website:" + url);
	}
	
	public void printThrowException() {
		throw new IllegalArgumentException();
	}
}
