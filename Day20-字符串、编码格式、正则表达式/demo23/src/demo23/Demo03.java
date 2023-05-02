package demo23;

/**
 * @author 一一哥Sun
 * V我领资料：syc_2312119590
 * 各平台都有壹哥的同名博客哦
 */
public class Demo03 {
	
	public static void main(String[] args) {
		//判断字符串对象是否为null或""
		
		//注意：null表示String对象为空，而""表示是一个长度为零、内容为空的空字符串对象，但该对象不为空！
		//定义一个值为null的空字符串
		String s1=null;
		
		//判断方式1：判断对象是否为null
		if(s1==null) {
			System.out.println("s1字符串对象为null,s1="+s1);
		}
		
		//定义一个内容为空，长度为零的字符串
		String s2 = "";
		
		//判断方式2：这种判断写法存在异常隐患，字符串对象s2有可能为null,如果s2.equals()调用时，s2可能为null,此时就会出现空指针异常
		if(s2.equals("")) {
			System.out.println("s2的长度="+s2.length()+",s2="+s2);
		}
		
		//判断方式3：对上面的判断方式进行改进，用以下方式进行判断，就会消除空指针异常的隐患
		if("".equals(s2)) {
			System.out.println("s2的长度="+s2.length()+",s2="+s2);
		}
		
		//判断方式4：判断一个空串的长度是否为0，这种判断字符串是否为空的方式效率更高
		if(s2.length()==0) {
			//我们也可以直接使用字符串的isEmpty()方法，其内部实现与此方式相同。
			System.out.println("s2的长度="+s2.length()+",s2="+s2);
		}
		
		//判断方式5：更全面严谨的判断。s==null一定要写在前面，因为如果s为null，先调用后面的s.length()就会出现空指针异常
		if(s2 == null || s2.length() == 0) {
			System.out.println("s2的长度="+s2.length()+",s2="+s2);
		}
		
		//判断方式6：或者我们直接使用字符串的isBlank()方法
		if(s2.isBlank()) {
			System.out.println("s2的长度="+s2.length()+",s2="+s2);
		}
		
	}
	
}
