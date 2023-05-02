package demo28;

import java.util.List;

/**
 * @author 一一哥Sun
 */
public class Demo03 {

	public static void main(String[] args) {
		List<String> list = List.of("java", "大数据", "壹壹哥");
		
		// List转数组方式一：返回一个Object[]数组
		Object[] array = list.toArray();
        for (Object val : array) {
            System.out.println("方式一，value="+val);
        }
        
        // List转数组方式二，给toArray(T[])传入与数组元素类型相同的Array，如果数组类型与集合数据元素类型不匹配则会产生如下异常：
        // java.lang.ArrayStoreException: arraycopy: element type mismatch: 
        //can not cast one of the elements of java.lang.Object[] to the type of the destination array, java.lang.Integer
        String[] array2 = list.toArray(new String[list.size()]);
        for (String val : array2) {
            System.out.println("方式二，value="+val);
        }
        
        // List转数组方式三：返回一个String[]数组
        String[] array3 = list.toArray(String[]::new);
        for (String val : array3) {
            System.out.println("方式二，value="+val);
        }
	}

}
