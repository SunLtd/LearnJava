package demo14;

/**
 * 
 * @author 一一哥Sun
 * QQ：2312119590
 * CSDN、掘金、知乎找我哦
 * 
 * 定义子类
 */
public class Son extends Father{

	//子类自己的私有属性
	private String hobby;
	private int height;
	private String job;
	
	//如果在父类中存在有参的构造方法，但没有重载无参的构造方法，那么子类中必须显式地调用父类有参的构造方法。否则会产生如下异常：
	//Implicit super constructor Father() is undefined. Must explicitly invoke another constructor
	public Son() {
		//不用显式调用super();方法
        //super();

        //父类中存在有参构造方法，但没有重载无参构造方法，需要显式调用如下方法。
		//super("",11);
		
		//这里会自动调用父类的无参数构造方法
		System.out.println("Son子类的无参构造方法");
	}

	public Son(String name,int age,String job) {
		//super();
		//子类调用父类中带有参数的构造方法
		super(name, age);
		this.job = job;
		System.out.println("Son子类的有参构造方法"+job);
	}
	
}
