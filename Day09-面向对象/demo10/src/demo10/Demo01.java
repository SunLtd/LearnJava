package demo10;

/**
 * 
 * @author 一一哥Sun
 * QQ：2312119590
 * CSDN、掘金、知乎找我哦
 */
public class Demo01 {

	public static void main(String[] args) {
		// new关键字
		Person p1=new Person();
		
		//newInstance()方法创建对象
		try {
			Class<?> clazz = Class.forName("demo10.Person");
			Person p2 = (Person) clazz.newInstance();
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		
	}

}
