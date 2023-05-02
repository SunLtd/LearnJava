package demo29;

/**
 * @author 一一哥Sun 
 * V我领资料：syc_2312119590 
 * 各平台都有壹哥的同名博客哦
 * 
 * 泛型类
 */
public class SubGenericClass<T1,T2> implements GenericInterface<T1>{

	private T2 otherData;
	
	@Override
	public void doSomething(T1 data) {
		System.out.println("t1="+data);
	}
    
    public SubGenericClass(T2 otherData) {
        this.otherData = otherData;
    }
    
    public T2 getOtherData() {
        return otherData;
    }

}
