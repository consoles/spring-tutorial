package ren.consoles.spring.helloworld;

public class HelloWorld {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void pringHello() {
		System.out.println("Hello Spring 4," + name );
	}
}
