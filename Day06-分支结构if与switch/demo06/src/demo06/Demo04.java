package demo06;

//引入Scanner类
import java.util.Scanner;

public class Demo04 {

	public static void main(String[] args) {
		// if多条件嵌套
		Scanner sc=new Scanner(System.in);
		
		//学校举行跑步比赛，如果成绩在15秒以内，可以进入决赛，男的进入男子组决赛，女的进入女子组决赛
		System.out.println("请输入你的比赛成绩");
		double score = sc.nextDouble();
		if(score < 15){
		    System.out.println("请输入你的性别");
		    String sex = sc.next();
		    if("男".equals(sex)){
		        System.out.println("恭喜进入男子组");
		    }else{
		        System.out.println("恭喜进入女子组");
		    }            
		}else{
		    System.out.println("很遗憾你被淘汰了！！！");
		}
		
	}

}
