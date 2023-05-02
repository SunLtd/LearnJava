package demo29;

/**
 * @author 一一哥Sun
 * V我领资料：syc_2312119590
 * 各平台都有壹哥的同名博客哦
 */
public class Pair<T> {

	//我们可以直接把泛型当成一个java的“类型”来用，Java类怎么用，泛型就可以怎么用
	//直接利用泛型来定义成员变量
	private T first;
    private T second;

    //构造方法中使用泛型
    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    //方法中使用泛型
    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }
}
