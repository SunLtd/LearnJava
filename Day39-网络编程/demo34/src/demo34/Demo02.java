package demo34;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

/**
 * @author 一一哥Sun
 * @company 千锋教育
 */
public class Demo02 {

	public static void main(String[] args) throws ClientProtocolException, IOException {
		String url = "https://json.tewx.cn/json/API_kdd531mytfdzm06i?sdAS1dsnuUa3sd=190001&Jsdh4bajs99dii=sohpuisypf4nfaei";
		//HttpClient client = HttpClientBuilder.create().build();
		CloseableHttpClient client = HttpClients.createDefault();
        HttpGet request = new HttpGet(url);
        request.setHeader("Content-Type", "application/json");
        CloseableHttpResponse response = client.execute(request);
        HttpEntity entity = response.getEntity();
        String content = EntityUtils.toString(entity);
        System.out.println(content);
	}
}
