package demo04;

/**
 * @author 一一哥Sun QQ：2312119590 CSDN、掘金、知乎找我哦
 */
public class OperatorDemo06 {

	public static void main(String[] args) {
		// 条件表达式，三目运算符

		/*
		 * boolean类型表达式 ? 结果1 : 结果2;
		 */
		// 判断年龄，如果大于18岁，输出成年人，否则输出未成年人
		int age = 70;
		String s = age > 18 ? "成年人" : "未成年人";
		System.out.println(s);

		// a和b比较，输出较大的数字
		int a = 10;
		int b = 20;
		int num = a > b ? a : b;
		System.out.println(num);

		// 三目运算符嵌套使用
		// 判断年龄。如果大于18岁，输出成年人；但如果大于60岁，输出老年人，否则输出未成年人
		String s1 = age > 18 ? age > 60 ? "老年人" : "成年人" : "未成年人";
		System.out.println(s1);
	}

}
