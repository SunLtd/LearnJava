package demo06;

//引入Scanner类
import java.util.Scanner;

public class Demo05 {

	public static void main(String[] args) {
		// switch结构
		Scanner sc=new Scanner(System.in);
		
		//根据输入的数字，选择每天要做的事情
		System.out.println("请输入日期序号，代表今天是星期几");
		int day = sc.nextInt();
		switch (day) {
		case 0:
	        System.out.println("星期天，休息休息");
	        break;
	    case 1:
	    	System.out.println("星期一，开始搬砖");
	        break;
	    case 2:
	        System.out.println("星期二，搬砖好累");
	        break;
	    case 3:
	        System.out.println("星期三，离周末还有3天");
	        break;
	    case 4:
	        System.out.println("星期四，明天就是周五啦");
	        break;
	    case 5:
	        System.out.println("星期五，明天就是周六啦");
	        break;
	    case 6:
	        System.out.println("星期六，开心.....");
	        break;
	    default: 
	        System.out.println("希望天天都是周末...");
	        break;
		}
	}

}
