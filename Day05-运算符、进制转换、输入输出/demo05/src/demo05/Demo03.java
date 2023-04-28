package demo05;

//1.导包：导入Scanner类
import java.util.Scanner;

/**
 * @author 一一哥Sun
 * QQ：2312119590
 * CSDN、掘金、知乎找我哦
 */
public class Demo03 {

	public static void main(String[] args) {
		//输入语句
		//2.创建一个从键盘录入的扫描对象 
        Scanner sc = new Scanner(System.in);

        //3.使用Scanner对象,扫描输入的内容(整数、小数、字符串、布尔)
        System.out.println("请输入一个数字");
        int num = sc.nextInt();
        System.out.println("你输入的数字为："+num);

        System.out.println("请输入一个小数");
        double num2 = sc.nextDouble();
        System.out.println("你输入的数字为："+num2);

        System.out.println("请输入一个字符串");
        String str = sc.next();
        System.out.println("你输入的字符串为："+str);
	}

}
