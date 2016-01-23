package ren.consoles.spring.attrInject;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * 顾客类，内部聚合了人这个类
 * @author gaopengfei
 *
 */
public class Customer {

	private Person person;
	
	private List<Object> lists;
	
	private Set<Object> sets;
	
	private Map<Object, Object> maps;
	
	private Properties properties;
	
	private Object[] arr;
	
	
	@Override
	public String toString() {
		return "Customer [person=" + person + ", lists=" + lists + ", sets=" + sets + ", maps=" + maps + ", properties="
				+ properties + ", arr=" + Arrays.toString(arr) + "]";
	}

	public Object[] getArr() {
		return arr;
	}

	public void setArr(Object[] arr) {
		this.arr = arr;
	}

	/**
	 * 注意保留无参构造
	 */
	public Customer() {
		
	}

	public Customer(Person person) {
		super();
		this.person = person;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public List<Object> getLists() {
		return lists;
	}

	public void setLists(List<Object> lists) {
		this.lists = lists;
	}

	public Set<Object> getSets() {
		return sets;
	}

	public void setSets(Set<Object> sets) {
		this.sets = sets;
	}

	public Map<Object, Object> getMaps() {
		return maps;
	}

	public void setMaps(Map<Object, Object> maps) {
		this.maps = maps;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

}
