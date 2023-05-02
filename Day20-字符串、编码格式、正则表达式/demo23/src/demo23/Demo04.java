package demo23;

/**
 * @author 一一哥Sun
 * V我领资料：syc_2312119590
 * 各平台都有壹哥的同名博客哦
 */
public class Demo04 {
	
	public static void main(String[] args) {
		String s1 = "hello";
        String s2 = "hello";
        
        //==用于比较两个对象的地址
        System.out.println("s1==s2的结果："+(s1 == s2));
        
        //equals()用于比较两个对象的内容
        System.out.println("s1.equals(s2)的结果："+s1.equals(s2));
		
        //新的写法
        String s3 = "yiyige";
        //将字符串转为小写
        String s4 = "YIYIGE".toLowerCase();
        //此时s3和s4是指向两个不同引用地址的对象
        System.out.println("s3==s4的结果："+(s3 == s4));
        System.out.println("s3.equals(s4)的结果："+s3.equals(s4));
	}
	
}
