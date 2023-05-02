package demo06;

//引入Scanner类
import java.util.Scanner;

public class Demo07 {

	public static void main(String[] args) {
		// JDK 12中switch的新特性,->标签

		System.out.println("请选择你的国家");

		Scanner sc = new Scanner(System.in);
		String country = sc.next();
		switch (country) {
		case "中国" -> System.out.println("我是中国人，我自豪！");
		case "日本" -> System.out.println("鬼子脚盆鸡");
		case "美国" -> {
			System.out.println("暂时还是老大");
			System.out.println("喜欢欺负人");
		}
		default -> System.out.println("未知国籍，黑户");
		}

	}

}
