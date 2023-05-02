package demo11;

/**
 * @author 一一哥Sun QQ：2312119590 CSDN、掘金、知乎找我哦
 */
public class Demo05 {

	public static void main(String[] args) {
		// 调用方法--挨个传递参数
		printName("一一哥","张三","三德子","猪八戒");
		
		//可变参数，也可以传递数组
		String [] names= {"孙玉昌","孙悟空","孙明明"};
		printName(names);
		
		//可以传递0个参数
		//printName();
		
		//不要给可变参数传递null值
		//printName(null);
	}

	// 输出参与活动的学生人数和姓名
	public static void printName(String... names) {
		// 获取总个数
		int count = names.length;
		System.out.println("本次参加活动的有" + count + "人，名单如下：");
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
	}
	
	//尽量不要对带有可变参数的方法进行重载
	//public static void printName(String logo,String... names) {
		
	//}

}
