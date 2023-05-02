package demo14;

/**
 * @author 一一哥Sun 
 * QQ：2312119590 
 * CSDN、掘金、知乎找我哦
 * 父类
 */
public class Father {

	//受保护的，可以被子类访问
	protected String name;
	protected int age;
	
	
	//私有属性不能被继承
	private String secret;
	
	//公开的属性--姓氏。公开属性可以被继承
	public String familyname;

	public Father() {
		System.out.println("Father父类的无参构造方法");
	}

	public Father(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("Father父类的有参构造方法");
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

	public String getSecret() {
		return secret;
	}

	public void setSecret(String secret) {
		this.secret = secret;
	}

	public String getFamilyname() {
		return familyname;
	}

	public void setFamilyname(String familyname) {
		this.familyname = familyname;
	}

}
