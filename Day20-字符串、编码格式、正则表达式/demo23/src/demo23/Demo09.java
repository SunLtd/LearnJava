package demo23;

/**
 * @author 一一哥Sun
 * V我领资料：syc_2312119590
 * 各平台都有壹哥的同名博客哦
 */
public class Demo09 {
	
	public static void main(String[] args) {
		//实例方法：String对象.format()
		String s = "恭喜你，%s, 你的得分是：%d!";
        System.out.println(s.formatted("壹壹哥", 99));
        
        //静态方法：String类.format()
        System.out.println(String.format("恭喜你，%s, 你的成绩是：%.2f!", "一一哥2", 46.5));
	}
	
}