package demo24;

/**
 * @author 一一哥Sun
 * V我领资料：syc_2312119590
 * 各平台都有壹哥的同名博客哦
 */
public class Demo02 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		String user = "yyg";
		String pwd = "123";
		
		//实现SQL语句的拼接
		sb.append("select * from userInfo where username=")
		.append(user)
		.append(" and pwd=")
		.append(pwd);

		System.out.println("sql="+sb.toString());
	}

}
