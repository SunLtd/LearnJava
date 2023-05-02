package demo06;

//引入Scanner类
import java.util.Scanner;

public class Demo01 {

	public static void main(String[] args) {
		// if语句
		//案例1：如果年龄大于等于18岁，就可以看攒劲的节目了
		System.out.println("请输入你的年龄");
		
		//获取Scanner对象
		Scanner sc=new Scanner(System.in);
		//获取年龄
		int age = sc.nextInt();
		if(age >= 18){
		    System.out.println("本节目只对成年人开放，未成年人请在父母陪同下观看，节目正在缓冲......");
		}
		
		//案例2：如果身高大于180，且体重小于180，就可以当模特        
		System.out.println("请输入你的身高");
		int height = sc.nextInt();
		System.out.println("请输入你的体重");
		int weight = sc.nextInt();

		if(height > 180 && weight < 180){
		    System.out.println("恭喜你，可以当模特了");
		}
	}

}
