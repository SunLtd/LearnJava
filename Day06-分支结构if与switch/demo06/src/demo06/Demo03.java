package demo06;

//引入Scanner类
import java.util.Scanner;

public class Demo03 {

	public static void main(String[] args) {
		// if多分支语句
		
		Scanner sc=new Scanner(System.in);
		
		//请你根据手上的资金选择购买的手机品牌。如果你手里的钱大于10000，就买个苹果；
		//如果大于7000, 就买个华为；如果大于5000，就买个小米；如果大于3000，就买个诺基亚；
		//否则，乖乖地去打公共电话。
		System.out.println("请输入余额");
		int money = sc.nextInt();
		if(money > 10000){
		    System.out.println("苹果手机");
		}else if(money > 7000){ //money <= 10000
		    System.out.println("华为手机");
		}else if(money > 5000){
		    System.out.println("小米手机");
		}else if(money > 3000){
		    System.out.println("诺基亚手机");
		}else{
		    System.out.println("打公共电话");
		}

	}

}
