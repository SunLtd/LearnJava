package demo25;

/**
 * @author 一一哥Sun
 * V我领资料：syc_2312119590
 * 各平台都有壹哥的同名博客哦
 */
public class Demo04 {

	public static void main(String[] args) {
		//三角函数运算
		//Math.sin()方法参数的单位是弧度，90度表示的是角度，需要把90度转换为弧度，即Math.PI/180*90，故转换后的弧度为Math.PI/2
		System.out.println("90度的正弦值:" + Math.sin(Math.PI/2));
        System.out.println("0度的余弦值:" + Math.cos(0));
        System.out.println("30的正切值:" + Math.tan(30));
        System.out.println("30的反正切值:" + Math.atan(30));
        System.out.println("1.8弧度的角度值:" + Math.toDegrees(1.8));
        System.out.println("100度的弧度值:" + Math.toRadians(100.0));
	}

}
