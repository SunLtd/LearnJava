package demo29;

/**
 * @author 一一哥Sun 
 * V我领资料：syc_2312119590 
 * 各平台都有壹哥的同名博客哦
 * 
 * 泛型类
 */
public class SonGenericClass<T1,T2> extends GenericClass<T1>{

	private T2 otherData;
    
    public SonGenericClass(T1 data, T2 otherData) {
        super(data);
        this.otherData = otherData;
    }
    
    public T2 getOtherData() {
        return otherData;
    }
}
