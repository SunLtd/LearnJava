package demo23;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author 一一哥Sun 
 * V我领资料：syc_2312119590 
 * 各平台都有壹哥的同名博客哦
 */
public class Demo13 {

	public static void main(String[] args) {
		//18位号码的正则表达式
		String reg18 = "^[1-9][0-9]{5}(18|19|20)[0-9]{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)[0-9]{3}([0-9]|(X|x))";

		//15位号码的正则表达式
		String reg15 = "^[1-9][0-9]{5}[0-9]{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)[0-9]{2}[0-9]";

		//编译正则表达式
		String validStr = "(" + reg18 + ")" + "|" + "(" + reg15 + ")";
		Pattern pattern = Pattern.compile(validStr);

		//匹配身份证号是否合法,请在这里传入自己18/15位的身份证号
		Matcher matcher = pattern.matcher("140826198812190122");

		System.out.println("身份证号是否合法："+matcher.matches());
	}

}