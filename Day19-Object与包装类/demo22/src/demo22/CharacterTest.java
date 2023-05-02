package demo22;

/**
 * @author 一一哥Sun
 * V我领资料：syc_2312119590
 * 各平台都有壹哥的同名博客哦
 */
public class CharacterTest {

	public static void main(String[] args) {
		//构造一个Character对象，该方式已过时
		Character character = new Character('A');
		
		//比较两个对象是否相同，0表示相同；正数表示前者大于后者；负数表示前者小于后者
		int result = character.compareTo(new Character('B'));
		System.out.println(result);    // 输出：-1
		
		//获取Character对象的第2种方式,注意参数必须是单引号括起来的字符型，
		Character char02 = Character.valueOf('B');
		
		//获取Character对象的第3种方式,常用该方式
		Character char03='C';
		
		//将大写字符转为小写字符
		char lowerCase = Character.toLowerCase('Y');
		System.out.println("lowerCase="+lowerCase);   
		
		String str="hello666";
		for(int i=0;i<str.length();i++) {
			//判断每一个字符是否是字母
			boolean isLetter = Character.isLetter(str.charAt(i));
			System.out.println(str.charAt(i)+", 是字母吗?="+isLetter); 
		}
		
	}
}
