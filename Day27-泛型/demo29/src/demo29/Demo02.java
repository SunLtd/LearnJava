package demo29;

/**
 * @author 一一哥Sun
 * V我领资料：syc_2312119590
 * 各平台都有壹哥的同名博客哦
 */
public class Demo02 {
	public static void main(String[] args) {
		//这里壹哥直接利用匿名内部类的写法进行实现，大家也可以编写一个类实现ICompute接口
		//我这里传入了两个Integer类型的具体参数，分别取代M和N
		ICompute<Integer, Integer> iCompute = new ICompute<Integer, Integer>() {
			@Override
			public Integer add(Integer m, Integer n) {
				return m+n;
			}
		};
		
		//调用上面实现的方法
		Integer result = iCompute.add(100, 200);
		System.out.println("result="+result);
	}
}
