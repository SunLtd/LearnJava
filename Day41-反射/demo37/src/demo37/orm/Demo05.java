package demo37.orm;

import demo37.orm.core.ORM;
import demo37.orm.entity.User;

/**
 * @author 一一哥Sun
 * @company 千锋教育
 */
public class Demo05 {

	public static void main(String[] args) {
		//传入自己的数据库表的地址与账户信息
		ORM orm = new ORM("jdbc:mysql://localhost:3306/db1?useSSL=false", "root", "syc");
		//创建一个用户对象
	    User user = new User();
	    user.setId(55);
	    user.setUsername("一一哥666");
	    user.setAge(18);
	    //调用ORM框架的插入操作
	    orm.save(user);
	    //关闭数据库连接
	    orm.close();
	}

}
