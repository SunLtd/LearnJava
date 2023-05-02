package demo06;

//引入Scanner类
import java.util.Scanner;

public class Demo02 {

	public static void main(String[] args) {
		// if多分支语句
		
		Scanner sc=new Scanner(System.in);
		
		//案例：如果用户名为admin、密码为123456，就跳转到首页，否则跳转到登录页面
		System.out.println("请输入用户名");
		String username = sc.next();
		System.out.println("请输入密码");
		String password = sc.next();

		//equals()比较方法
		if("admin".equals(username) && "123456".equals(password)){
		    System.out.println("跳转首页");
		}else{
		    System.out.println("跳转登录页面");
		}        

	}

}
