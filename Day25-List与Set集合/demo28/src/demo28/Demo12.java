package demo28;

import java.util.TreeSet;

/**
 * @author 一一哥Sun
 */
public class Demo12 {

	public static void main(String[] args) {
		//TreeSet的去重原理
        TreeSet<Person> set = new TreeSet<Person>();
        set.add(new Person("admin","123"));
        set.add(new Person("yyg","bb"));
        set.add(new Person("jack","123"));
        set.add(new Person("rose123","123"));
        set.add(new Person("admin","123")); 
        set.add(new Person("xksss6","abc"));

        //如果两个对象的用户名和密码都相等，则认为是两个相同的对象，且按照名字长度升序存放
        for (Person person : set) {
            System.out.println(person);
        }
	}
}
