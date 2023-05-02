package demo26;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * @author 一一哥Sun 
 * V我领资料：syc_2312119590 
 * 各平台都有壹哥的同名博客哦
 */
public class Demo23 {

	public static void main(String[] args) {
		//获取当前时间的时间戳
		long currentTimeMillis = System.currentTimeMillis();
		System.out.println("currentTimeMillis毫秒级时间戳="+currentTimeMillis);

		//获取当前时间的时间戳
		Instant now = Instant.now();
		System.out.println("now时刻="+now);
		// 秒
        System.out.println("秒级时间戳="+now.getEpochSecond()); 
        // 毫秒
        System.out.println("毫秒级时间戳="+now.toEpochMilli());
		
		//用指定的时间戳创建Instant对象
		Instant ins = Instant.ofEpochSecond(1676262418);
		//获取所在时区的ZonedDateTime对象
		ZonedDateTime zdt = ins.atZone(ZoneId.systemDefault());
		System.out.println("zdt="+zdt); 
	}

}
