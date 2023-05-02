package demo28;

import java.util.ArrayList;

/**
 * @author 一一哥Sun
 */
public class Demo06 {

	public static void main(String[] args) {
		//创建ArrayList集合，<String>中的是泛型，后面我们会专门讲解泛型
		ArrayList<String> names = new ArrayList<String>();
		//一个一个地添加元素
		names.add("一一哥");
		names.add("java");
		names.add("数学");
		
		//修改集合中的元素：第一个参数是集合中的索引，第二个是要修改的值
		names.set(1, "Android"); 
		names.set(2, "iOS"); 
        
		//遍历集合
        for (String name : names) {
            System.out.println("name="+name);
        }
	}

}
