package demo37;

/**
 * @author 一一哥Sun
 * @company 千锋教育
 */
public class Person {

	public String name;
	// 私有的属性
	private int age;
	protected String address;
	
	public Person() {}

	public Person(String name, int age, String address) {
		this.name=name;
		this.age=age;
		this.address=address;
	}

	private Person(int age) {
		this.age=age;
	}

	protected Person(String name) {
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
}
