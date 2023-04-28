package demo05;

/**
 * @author 一一哥Sun
 * QQ：2312119590
 * CSDN、掘金、知乎找我哦
 */
public class Demo02 {

	public static void main(String[] args) {
		//格式化输出
		
		//默认输出格式
		//double d = 88800000;
        //System.out.println(d); // 8.88E7
        
        double d = 3.1415926;
        System.out.printf("%.2f\n", d); // 保留2位小数3.14
        System.out.printf("%.4f\n", d); // 保留4位小数3.1416
        
        //占位符与格式化
        int n = 123456789;
        //%08x,输出16进制数据，如果不足8位，用0补齐
        System.out.printf("n=%d, hex=%08x", n, n); // 注意，两个%占位符必须传入两个数
	}

}
