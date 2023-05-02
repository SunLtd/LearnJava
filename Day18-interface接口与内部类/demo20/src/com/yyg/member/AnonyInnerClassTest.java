package com.yyg.member;

/**
 * @author 一一哥Sun
 * V我领资料：syc_2312119590
 * 各平台都有壹哥的同名博客哦
 * 
 * 测试匿名内部类
 */
public class AnonyInnerClassTest {

	public static void main(String[] args) {
		//外部变量
		int num=20;
		
		//测试匿名内部类
		Button btn=new Button();
		
		//模拟处理按钮的点击事件
		btn.setOnClickListener(new OnClickListener() {//这里就是一个匿名内部类
			
			//在匿名内部类中，可以允许使用非静态代码块进行成员初始化操作。
			int i; 
			
			{    // 非静态代码块，在构造方法之后执行
		        i = 100;    //成员初始化
		    }
			
			@Override
			public void onClick() {
				System.out.println("按钮被点击啦...i="+i+",num="+num);
			}
		});
		
	}
}
