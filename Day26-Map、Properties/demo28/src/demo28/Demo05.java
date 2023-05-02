package demo28;

import java.util.ArrayList;

/**
 * @author 一一哥Sun
 */
public class Demo05 {

	public static void main(String[] args) {
		//创建ArrayList集合，<String>中的是泛型，后面我们会专门讲解泛型
		ArrayList<String> names = new ArrayList<String>();
		//一个一个地添加元素
		names.add("一一哥");
		names.add("java");
		names.add("数学");
        
		//遍历集合
        for (String name : names) {
            System.out.println("name="+name+",size="+names.size());
        }
        
        ArrayList<String> names2 = new ArrayList<String>();
        names2.add("壹壹哥");
        //在A集合中追加B集合
        names2.addAll(names);
        
        //遍历集合
        for (String name : names2) {
            System.out.println("name="+name);
        }
        
	}

}
