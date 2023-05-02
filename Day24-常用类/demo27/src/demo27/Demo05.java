package demo27;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;

public class Demo05 {

	public static void main(String[] args) {
		//SecureRandom真随机数的用法
		
		SecureRandom sr = null;
        try {
        	//获取高强度安全随机数生成器实例对象
            sr = SecureRandom.getInstanceStrong(); 
        } catch (NoSuchAlgorithmException e) {
        	//处理异常，获取普通的安全随机数生成器
            sr = new SecureRandom(); 
        }
        
        //生成16个随机数
        byte[] buffer = new byte[16];
        //用安全随机数填充buffer
        sr.nextBytes(buffer); 
        System.out.println("随机数="+Arrays.toString(buffer));
        
        //生成100以内的随机整数
        int nextInt = sr.nextInt(100);
        System.out.println("随机数="+nextInt);
	}

}
