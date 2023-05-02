package demo22;

/**
 * @author 一一哥Sun
 * V我领资料：syc_2312119590
 * 各平台都有壹哥的同名博客哦
 */
public class ParseTest {

	public static void main(String[] args) {
		//将数值型字符串转为对应的包装类
		int parseInt = Integer.parseInt("100");
		float parseFloat = Float.parseFloat("200.5");
		double parseDouble = Double.parseDouble("300.3");
		byte parseByte = Byte.parseByte("50");
		short parseShort = Short.parseShort("20");
		//字符串参数是true时就返回true,否则都返回false
		boolean parseBoolean = Boolean.parseBoolean("true");
		System.out.println("parseBoolean="+parseBoolean);
	}
}
