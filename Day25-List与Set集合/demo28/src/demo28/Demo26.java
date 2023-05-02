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
public class Demo26 {
	public static void main(String[] args) {
		// 设置配置信息
		Properties properties = new Properties();
		properties.setProperty("jdbc.url", "jdbc:mysql://localhost:3306/mydb2");
		properties.setProperty("jdbc.username", "root");
		properties.setProperty("jdbc.password", "syc");

		try {
			URL dbUrl = Demo26.class.getResource("/config.xml");
			String path = dbUrl.getPath();
			OutputStream outputStream = new FileOutputStream(path);
			// 写入配置信息
			properties.storeToXML(outputStream, "Database connection properties");

			// 寻找.properties文件路径方式二
			InputStream inputStream = Demo26.class.getResourceAsStream("/config.xml");
			// 加载字节流
			properties.loadFromXML(inputStream);
			System.out.println("xml=" + properties);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
