package demo23;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author 一一哥Sun
 * V我领资料：syc_2312119590
 * 各平台都有壹哥的同名博客哦
 */
public class Demo11 {
	
	public static void main(String[] args) {
		//Pattern pattern = Pattern.compile(null);
		//Matcher matcher = pattern.matcher(null);
		
		//定义一个用于匹配电话号码的正则表达式
		String regex = "0\\d{2,3}[-]?\\d{7,8}|0\\d{2,3}\\s?\\d{7,8}|18[0-9]\\d{8}|15[1234]\\d{8}";
		
		//定义一个结束循环的标志位
		String flag = "Y";
		
		do {
		    System.out.print("请输入电话号码：");
		    // 接收用户在控制台输入的电话号码
		    Scanner scan = new Scanner(System.in);
		    String phone = scan.next();    
		    
		    // 编译正则表达式
		    Pattern pattern = Pattern.compile(regex);   
		    // 创建给定输入模式的匹配器
		    Matcher matcher = pattern.matcher(phone); 
		    //进行字符串的匹配
		    boolean bool = matcher.matches();
		    if(bool) { // 如果验证通过
		        System.out.println("电话号码格式可用");
		    } else {
		        System.out.println("电话号码不可用，请重新输入!");
		    }
		    
		    System.out.print("是否继续注册？(请输入 Y/N 或 y/n)");
		    flag=scan.next();
		}while(flag.equalsIgnoreCase("Y"));
		
		System.out.println("注册结束!");
	}
	
}