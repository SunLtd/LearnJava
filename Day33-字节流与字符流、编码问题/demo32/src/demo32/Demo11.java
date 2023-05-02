package demo32;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo11 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// try(resource)的写法
		// 1. 创建Reader对象
		try(BufferedReader reader=new BufferedReader(new FileReader("F:\\a.txt"))) {
            String strLine = "";
            while ((strLine = reader.readLine()) != null) { // 循环读取每行数据
                System.out.println(strLine);
            }
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }  // 3.自动资源释放
	}

}
