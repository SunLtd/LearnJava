package demo25;

/**
 * @author 一一哥Sun
 * V我领资料：syc_2312119590
 * 各平台都有壹哥的同名博客哦
 */
public class Demo06 {

	public static void main(String[] args) {
		//随机数 默认的范围[0,1)
		System.out.println(Math.random());

		//需求：随机一个两位数  [0,1)*90   [0,90) + 10     
		System.out.println((int)(Math.random()*90)+10);
	}

}
