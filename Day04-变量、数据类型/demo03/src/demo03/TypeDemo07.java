package demo03;

/**
 * @author 一一哥Sun QQ：2312119590 CSDN、掘金、知乎找我哦
 */
public class TypeDemo07 {

	public static void main(String[] args) {
		// 其他类型转换
		// 1.基本类型转字符串
		// 变量+""，会自动转换String类型
		int x = 111;
		String s1 = x + "";
		System.out.println("s1=" + s1);

		// 2.包装类型转字符串
		Double d = 1000.0;
		String str = d.toString();
		System.out.println("str=" + str);

		// 3.字符串转包装类
		Double d2 = Double.parseDouble("11.1");
		Double d3 = Double.valueOf("11.1");
		System.out.println("d2=" + d2 + ",d3=" + d3);
		int i = Integer.parseInt("100");
		Integer j = Integer.valueOf("200");
		System.out.println("i=" + i + ",j=" + j);

	}

}
