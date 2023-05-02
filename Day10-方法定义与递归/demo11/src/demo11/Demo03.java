package demo11;

/**
 * @author 一一哥Sun
 * QQ：2312119590
 * CSDN、掘金、知乎找我哦
 */
public class Demo03 {

	public static void main(String[] args) {
		//调用方法，获取到返回结果
		String result = Demo01.showMsg(16, "一一哥", "要好好学习");
		System.out.println(result);
		
		Demo01 demo=new Demo01();
		String result2 = demo.showMsg2(19, "以一个", "你好啊");
		System.out.println(result2);
	}

}
