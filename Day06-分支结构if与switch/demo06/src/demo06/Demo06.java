package demo06;

//引入Scanner类
import java.util.Scanner;

public class Demo06 {

	public static void main(String[] args) {
		// switch结构--case穿透
		Scanner sc = new Scanner(System.in);

		// 根据输入的数字，选择每天要做的事情
		System.out.println("请输入成绩等级");
		String level = sc.next();
		switch (level) {
		case "a":
		case "A":
			System.out.println("优秀");
			break;
		case "b":
		case "B":
			System.out.println("良好");
			break;
		case "c":
		case "C":
			System.out.println("一般");
			break;
		case "d"://故意case穿透
		case "D":
		case "E":
		case "F":
			System.out.println("很差");
			break;
		default:
			System.out.println("成绩无效");
			break;
		}
	}

}
