package demo04;

/**
 * @author 一一哥Sun QQ：2312119590 CSDN、掘金、知乎找我哦
 */
public class OperatorDemo01 {

	public static void main(String[] args) {
		//算术运算符
		//注意类型提升：两个数计算，结果取决于范围大的数！比如两个int计算，结果还是int；
		//而int与浮点数进行计算，则结果为浮点数，即结果变成更大范围的类型，这就是类型提升！
		int a = 10;
		//double b = 20.0;
		int b=20;
		
		//+号的第1个作用：数学计算
	    System.out.println(a+b);
	    System.out.println(a-b);
	    System.out.println(a*b);
	    System.out.println(a/b);
	    System.out.println(a%b);
	    //除法和取模运算中，右操作数不能取0
	    System.out.println(a/0);
	    

	    //+号的第2个作用：字符串拼接，自左向右的结合性，字符串在前，数字在后，执行字符串拼接操作。
	    System.out.println("hello"+1+2); //hello12
	    //自左向右的结合性：数字在前，字符串字后，先计算出结果，再进行字符串的拼接。
	    System.out.println(1+2+"hello"); //3hello
	    System.out.println(1+2+"hello"+3+4);//3hello34

	    int c = 34;
	    //获取c这个数据中的十位，执行整除
	    System.out.println(c/10);
	    //获取c这个数据中的个位
	    System.out.println(c%10);

	    //自增操作
	    int d = 10;
	    d++; //d = d + 1; 先使用，再自增       
	    System.out.println(d); //11
	    ++d;//先自增，再使用
	    System.out.println(d); //12
	    
	    //先使用再自增：在本语句中，先使用变量d，在本语句结束之后再对变量d进行自增。
	    System.out.println(d++); //12    13
	    //先自增再使用：在本语句中，先对变量d进行自增，然后把自增后的结果在语句中进行输出。
	    System.out.println(++d); //14  

	    int x = 10; 
	    int y = 8;
	    //执行过程：10 - 9 + 8 + 10 - 7 =12
	    System.out.println(x++ - --x + y-- + x++ - --y);
	}

}
