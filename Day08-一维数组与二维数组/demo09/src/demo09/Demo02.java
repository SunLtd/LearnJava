package demo09;

/**
 * @author 一一哥Sun
 * QQ：2312119590
 * CSDN、掘金、知乎找我哦
 */
public class Demo02 {

	public static void main(String[] args) {
		//数组的静态初始化
		
		//写法1
		//引用类型的数组
		String[] names = {"张三","李四","王五","一一哥"};
		//写法2：
		//String names[] = {"张三","李四","王五","一一哥"};
		//写法3：
		//String names[] = new String[]{"张三","李四","王五","一一哥"};
		
		// [Ljava.lang.String;@15db9742      内存地址
		// System.out.println(names);

		//操作数组

		//存数据,新数据存入到原有的位置
		names[0] = "yyg";
		names[1] = "尼古拉斯";

		//取数据
		System.out.println("第二个元素："+names[1]);
		System.out.println("第四个元素："+names[3]);

		//获取数组的长度
		System.out.println("数组的长度："+names.length);
	}

}
