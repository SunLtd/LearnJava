package demo14;

/**
 * @author 一一哥Sun
 * QQ：2312119590
 * CSDN、掘金、知乎找我哦
 * 
 * 测试继承
 */
public class ExtendTest {

	public static void main(String[] args) {
		Dog dog = new Dog();
        //使用父类继承下来的属性
        dog.name = "旺财";
        dog.type = "泰迪";
        dog.age = 3;
        //使用子类独有属性
        dog.color = "黄色";

        System.out.println("姓名为:"+dog.name+",品种为："+dog.type+",毛色为:"+dog.color);
        //使用父类继承下来的方法
        dog.eat();
        dog.sleep();
        //使用子类独有方法
        dog.lookHome();
	}

}
