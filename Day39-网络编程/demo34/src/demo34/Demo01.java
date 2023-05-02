package demo34;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Demo01 {

	public static void main(String[] args) {
		try {
			//创建一个URL对象
			URL url = new URL("<www.mobiletrain.org>");
			//得到一个URLConnection连接对象
			URLConnection conn = url.openConnection();
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
