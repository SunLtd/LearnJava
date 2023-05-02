package demo29;

/**
 * @author 一一哥Sun 
 * V我领资料：syc_2312119590 
 * 各平台都有壹哥的同名博客哦
 */
public class Demo08 {

	public static void main(String[] args) {
		SonGenericClass<Integer,String> son=new SonGenericClass<>(100, "hello");
		Integer data = son.getData();
		String otherData = son.getOtherData();
		System.out.println("t1---data="+data+",t2---data="+otherData);
	}

}
