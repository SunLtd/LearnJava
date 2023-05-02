package demo28;

import java.util.ArrayList;

/**
 * @author 一一哥Sun
 */
public class Demo07 {

	public static void main(String[] args) {
		//创建ArrayList集合，<String>中的是泛型，后面我们会专门讲解泛型
		ArrayList<String> names = new ArrayList<String>();
		//一个一个地添加元素
		names.add("一一哥");
		names.add("java");
		names.add("数学");
		
		//删除集合中指定位置上的某个元素
		names.remove(0);
		//删除集合中的某个指定元素
		names.remove("java");
        
		//遍历集合
        for (String name : names) {
            System.out.println("name="+name);
        }
        
        ArrayList<String> names2 = new ArrayList<String>();
        names2.add("语文");
		names2.add("英语");
		names2.add("数学");
		//删除本集合中的另一个集合
        names2.removeAll(names);
        //遍历集合
        for (String name : names2) {
            System.out.println("name2="+name);
        }
	}
}
