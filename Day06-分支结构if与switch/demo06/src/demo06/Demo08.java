package demo06;

//引入Scanner类
import java.util.Scanner;

public class Demo08 {

	public static void main(String[] args) {
		// JDK 12中switch的新特性,->标签
		System.out.println("请选择你的国家");

		Scanner sc = new Scanner(System.in);
		String country = sc.next();

		// 注意：这里的返回值类型，可以是任意类型。我们后面在学习方法时再细说返回值的问题
		String result = switch (country) {
		case "中国" -> "我是中国人，我自豪！";
		case "日本" -> "鬼子脚盆鸡";// 返回值只能有一个
		case "美国" -> {
			String str = "我们就喜欢以德服人";
			// 注意：这里需要返回一个变量！！！
			yield str;
		}
		default -> "未知国籍，黑户";
		};// 注意：这里需要有个“;”，表示语句的结束

		System.out.println("你的国家情况：" + result);
	}

}
