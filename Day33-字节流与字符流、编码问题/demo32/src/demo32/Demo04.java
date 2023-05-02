package demo32;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo04 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		 //1.创建一个FileOutputStream对象
		try(FileOutputStream output = new FileOutputStream("F:/output.txt")) {
            //2.写入数据到输出流中
            output.write("Hello, 一一哥Java!".getBytes());
            //3.刷新数据到输出流中
            output.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }//不用在finally中关闭OutputStream流了，会自动关闭
	}

}
