package demo28;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;

/**
 * @author 一一哥Sun
 */
public class Demo23 {
	public static void main(String[] args) {
		//创建Properties对象
		Properties properties = new Properties();
		try {
			//设置db.properties配置文件，利用字节流来加载文件
			
			//寻找.properties文件路径方式一
			//从当前项目的根目录下寻找db.properties文件
			URL dbUrl = Demo23.class.getResource("/db.properties");
			String path = dbUrl.getPath();
			System.out.println("path="+path);
			InputStream inputStream = new FileInputStream(path);
			
			//寻找.properties文件路径方式二
			//InputStream inputStream = Demo23.class.getResourceAsStream("/db.properties");
			
			//加载字节流
		    properties.load(inputStream);
		    System.out.println("properties="+properties);
		    
		    //从配置文件中根据指定的key来读取配置信息
		    String url = properties.getProperty("jdbc.url");
		    String username = properties.getProperty("jdbc.username");
		    String password = properties.getProperty("jdbc.password");
		    System.out.println("[url]="+url+" ,[username]="+username+" ,[password]="+password);
		    
		    //读取信息时设置默认值
		    //String url = properties.getProperty("jdbc.url", "jdbc:mysql://localhost:3306/mydb");
		    //String username = properties.getProperty("jdbc.username", "root");
		    //String password = properties.getProperty("jdbc.password", "root");
		    //System.out.println("[url]="+url+" ,[username]="+username+" ,[password]="+password);
		} catch (IOException e) {
		    e.printStackTrace();
		}
	}
}
