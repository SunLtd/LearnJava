package demo04;

/**
 * @author 一一哥Sun QQ：2312119590 CSDN、掘金、知乎找我哦
 */
public class OperatorDemo02 {

	public static void main(String[] args) {
		//=赋值运算符
		int a = 10;
		a += 2; //12,相当于 a=a+2;
		System.out.println("a="+a);
		a -= 3; //9,a = a - 3;
		System.out.println("a="+a);
		a *= 4; //36,a = a * 4;
		System.out.println("a="+a);
		//注意：Java中的除法，36/5=7哦，不会等于7.2，想想这是为什么？
		a /= 5; //7,a = a / 5;
		System.out.println("a="+a);
		a %= 6; //1,a = a % 6;
		System.out.println("a="+a);

		//笔试题：short s1 = 1; short s2 = 1; s2 = s1 + s2? s2 += s1;?
		short s1 = 1;
		short s2 = 1;
		//类型提升：s1+s2变成了int类型
		//s2 = s1 + s2; //错误
		s2 += s1; // 正确
		System.out.println(s2);
	}

}
