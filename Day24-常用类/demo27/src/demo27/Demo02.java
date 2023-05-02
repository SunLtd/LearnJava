package demo27;

import java.io.IOException;
import java.util.Scanner;

public class Demo02 {

	public static void main(String[] args) {
		//out的用法
		
		//输出字符串不换行
		System.out.print("Hello World");

		//输出字符串并换行
		System.out.println("Hello World");
		
		//err的用法
		System.err.println();
		System.err.println("错误信息");
		
		//in的用法
		//用法1：配合Scanner,作为它的参数
		System.out.println("请输入内容:");
		Scanner scanner=new Scanner(System.in);
		String content = scanner.next();
		System.out.println("content="+content);

		//用法2：挨个读取输入的每个字符
		System.out.println("请输入内容,按回车键结束输入:");
        int c;
        try {
        	//读取输入的每个字符
            c = System.in.read();    
            // 判断输入的字符是不是回车键
            while(c != '\r') {   
            	//输出字符
                System.out.print((char) c);   
                c = System.in.read();
            }
        } catch(IOException e) {
        	//捕获异常，壹哥以后会给大家专门讲解异常类
            System.out.println(e.toString());
        } 
	}

}
