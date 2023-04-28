package demo03;

/**
 * @author 一一哥Sun QQ：2312119590 CSDN、掘金、知乎找我哦
 */
public class TypeDemo05 {

	public static void main(String[] args) {
		// 强制类型转换:大转小。
		double d1 = 100;
		// double-->int，大转小，d1的类型为double,i的类型为int,需要强制转换,类型前添加(要转换成的类型)。
		int i = (int) d1;
		System.out.println("i=" + i);

		//int-->char,大转小
		int j = 97;
		char c1 = (char) j;
		System.out.println("c1="+c1);
		
		//int-->byte，大转小，精度可能会丢失
		int k =128;   
		//byte类型是8位，最大值为127，当int强制转换为byte类型时，128就会导致溢出变成-128。
		byte b = (byte)k;
		System.out.println("b="+b);//-128

		//表达式中进行类型转换
		double d2 = 10;
		double d3 = 12;
		int m = (int) (d2 + d3);
		System.out.println("m="+m);
		
		//double+int,小类型和大类型进行计算，会进行类型提升，最终的结果变成大类型。
		//Type mismatch: cannot convert from double to int
		//int n = d2 + k;
		int n = (int)d2 + k;
		System.out.println("n="+n);
		
		//浮点数到整数的转换，是通过舍弃小数得到的，而不是四舍五入
		int x=(int)55.9;//55
		int y=(int)-28.89f;
		System.out.println("x="+x+",y="+y);//-28
		
	}

}
