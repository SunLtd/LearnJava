package demo24;

/**
 * @author 一一哥Sun
 * V我领资料：syc_2312119590
 * 各平台都有壹哥的同名博客哦
 */
public class Demo01 {

	public static void main(String[] args) {
		//创建StringBuffer对象
        StringBuffer sb = new StringBuffer("跟一一哥，");

        //在字符串后面追加新的字符串
        sb.append("学Java！");
        System.out.println(sb); 

        //删除指定位置上的字符串，从指定的下标开始和结束，下标从0开始
        sb.delete(2, 4);
        System.out.println(sb);//"一哥"

        //在指定下标位置上添加指定的字符串
        sb.insert(2, "123");
        System.out.println(sb);//跟一123，学Java！

        //将字符串翻转
        sb.reverse();
        System.out.println(sb);//！avaJ学，321一跟

        //将StringBuffer转换成String类型
        String s = sb.toString();
        System.out.println(s);
	}

}
