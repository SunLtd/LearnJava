package demo34;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import org.apache.http.client.ClientProtocolException;

/**
 * @author 一一哥Sun
 * @company 千锋教育
 */
public class Demo03 {

	public static void main(String[] args) throws ClientProtocolException, IOException {
		//创建一个URL对象，关联图片地址
		URL url = new URL("http://www.mobiletrain.org/images/index/new_logo.png"); 
		//得到一个HttpURLConnection对象
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		//设置请求方法
		connection.setRequestMethod("GET");
		//得到响应结果
		InputStream inputStream = connection.getInputStream();
		//创建文件
		File file=new File("F://logo.png");
		//利用IO流输出内容到文件中
		FileOutputStream outputStream = new FileOutputStream(file); 
		byte[] buffer = new byte[1024];
		int bytesRead;
		while ((bytesRead = inputStream.read(buffer)) != -1) {
		    outputStream.write(buffer, 0, bytesRead);
		}
		//关闭资源
		outputStream.close();
		inputStream.close();
		//关闭连接
		connection.disconnect();
	}
}
