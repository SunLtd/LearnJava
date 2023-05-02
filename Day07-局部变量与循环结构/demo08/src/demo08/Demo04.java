package demo08;

import java.util.Scanner;

/**
 * @author 一一哥Sun
 * QQ：2312119590
 * CSDN、掘金、知乎找我哦
 */
public class Demo04 {

	public static void main(String[] args) {
		//continue关键字
		//需求：将输入的内容进行输出，如果输入"886"就结束当前聊天。如果输入了敏感词汇，则用“***”替代显示
		Scanner sc = new Scanner(System.in);
		
		while(true){
		    String word = sc.next();
		    if(word.equals("886")){
		    	//跳出当前整个循环
		        break;
		    }            
		    
		    if(word.equals("WC")||word.equals("SB")){
		        System.out.println("***");
		        //中止本次循环，继续下一次循环
		        continue;
		    }
		    System.out.println(word);            
		}
	}

}
