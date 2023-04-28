package demo03;

/**
 * @author 一一哥Sun QQ：2312119590 CSDN、掘金、知乎找我哦
 */
public class TypeDemo03 {

	public static void main(String[] args) {
		//常见转义字符：\n 表示换行；\t表示制表位
		
		//转义字符：\t,可以空4格；\n，可以换下一行；
	    System.out.println("hello\tworld");
	    System.out.println("hello\nworld");

	    //转义字符，\""，输出中文的“”
	    System.out.println("你\"真棒\"");        

	    //转义字符：默认情况下，斜杠是不能单独输出使用的，需要加一个转义字符才能输出。
	    System.out.println("D:\\a\\b");
	}

}
