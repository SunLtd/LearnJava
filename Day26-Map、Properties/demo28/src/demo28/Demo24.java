package demo28;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.Properties;

/**
 * @author 一一哥Sun
 */
public class Demo24 {
	public static void main(String[] args) {
		//设置配置信息
		Properties properties = new Properties();
		properties.setProperty("jdbc.url", "jdbc:mysql://localhost:3306/mydb2");
		properties.setProperty("jdbc.username", "root");
		properties.setProperty("jdbc.password", "syc");

		try {
			URL dbUrl = Demo24.class.getResource("/db.properties");
			String path = dbUrl.getPath();
			System.out.println("path="+path);
			OutputStream outputStream = new FileOutputStream(path);
			//写入配置信息
			properties.store(outputStream, "Database connection properties");

			// 寻找.properties文件路径方式二
			InputStream inputStream = Demo24.class.getResourceAsStream("/db.properties");
			// 加载字节流
			properties.load(inputStream);
			System.out.println("properties=" + properties);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
