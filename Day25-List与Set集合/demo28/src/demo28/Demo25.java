package demo28;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author 一一哥Sun
 */
public class Demo25 {
	public static void main(String[] args) {
		// 创建Properties对象
		Properties properties = new Properties();
		try {
			// 从当前项目的根目录下寻找db.properties文件
			InputStream inputStream = Demo25.class.getResourceAsStream("/config.xml");
			// 加载字节流,从XML文件中读取配置信息
			properties.loadFromXML(inputStream);

			// 从配置文件中根据指定的key来读取配置信息

			// 读取信息时设置默认值
			 String url = properties.getProperty("jdbc.url","jdbc:mysql://localhost:3306/mydb2");
			 String username = properties.getProperty("jdbc.username", "syc");
			 String password = properties.getProperty("jdbc.password", "syc");
			 System.out.println("[url]="+url+" ,[username]="+username+" ,[password]="+password);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
