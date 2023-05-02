package demo29;

/**
 * @author 一一哥Sun 
 * V我领资料：syc_2312119590 
 * 各平台都有壹哥的同名博客哦
 * 
 * 泛型类
 */
public class GenericClass<T1> {

	private T1 data;

	public GenericClass(T1 data) {
		this.data = data;
	}

	public T1 getData() {
		return data;
	}
}
