package demo22;

/**
 * @author 一一哥Sun
 * V我领资料：syc_2312119590
 * 各平台都有壹哥的同名博客哦
 */
public class BoxTest {

	public static void main(String[] args) {
		//JDK 1.5之前的拆装箱过程--手动拆装箱
		byte b = 10;
		//手动装箱
		Byte b1 = Byte.valueOf(b);
		System.out.println("手动装箱后的结果，b1="+b1);
		
		//手动拆箱
		byte b2 = b1.byteValue();
		System.out.println("手动拆箱后的结果="+b2);
		
		//手动装箱的另一种形式
		int m = 100;
        Integer obj = new Integer(m); 
        
        //手动拆箱的另一种形式
        int n = obj.intValue(); 
        System.out.println("n = " + n);
		
		//JDK 1.5之后的拆装箱过程--自动拆装箱        
		int i = 10;
		//自动装箱
		Integer i001 = i;
		System.out.println("自动装箱后的结果，i001="+i001);
		//自动拆箱
		int i002 = i001;
		System.out.println("自动拆箱后的结果，i002="+i002);
	}
}
