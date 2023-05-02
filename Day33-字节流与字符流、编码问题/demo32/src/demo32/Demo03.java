package demo32;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo03 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		FileOutputStream output=null;
		try {
            //1.创建一个FileOutputStream对象
            output = new FileOutputStream("F:/output.txt");
            //如果想要向文件中追加内容，可以把第二个参数设置为true
            //new FileOutputStream("F:/output.txt", true);

            //2.写入数据到输出流中
            output.write("Hello, 一一哥!".getBytes());

            //3.刷新数据到输出流中
            output.flush();

            //4.关闭输出流
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
        	//5.关闭IO流
        	if(output!=null) {
        		output.close();
        	}
        }
	}

}
