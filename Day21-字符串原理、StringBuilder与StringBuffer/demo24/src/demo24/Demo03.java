package demo24;

/**
 * @author 一一哥Sun 
 * V我领资料：syc_2312119590 
 * 各平台都有壹哥的同名博客哦
 */
public class Demo03 {
	// 扩容机制
	public static void main(String[] args) {
		//无参构造方法，初始容量默认为16
		StringBuffer sb = new StringBuffer();

		//使用StringBuffer的capacity()方法查看其当前容量
		System.out.println("默认初始化容量capacity=" + sb.capacity() + ",默认长度length=" + sb.length());

		//一次追加20个字符，因为超过了初始容量，因此会扩容16*2+2=34
		sb.append("11111111112222222222");
		System.out.println("扩容一次的capacity()=" + sb.capacity() + ",扩容一次后的length=" + sb.length());
		
		StringBuffer sb02 = new StringBuffer();
		//再次添加50个字符，不仅超过了初始容量16，而且按照 当前容量*2+2 进行扩容(34)后，依然存储不下，
        //则直接将容量扩容到新追加的字符串长度50
		sb02.append("11111111112222222222333333333344444444445555555555");	
		System.out.println("再次扩容后的capacity="+sb02.capacity()+",再次扩容后的长度length():"+sb02.length());
	}

}
