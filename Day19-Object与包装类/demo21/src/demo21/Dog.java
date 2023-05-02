package demo21;

/**
 * @author 一一哥Sun
 * V我领资料：syc_2312119590
 * 各平台都有壹哥的同名博客哦
 */
public class Dog implements Animal{
	
	private String name;
	
	public Dog() {}

	public Dog(String name) {
		this.name = name;
	}

	@Override
	public void eat() {
		System.out.println("小狗"+this.name+"狗爱吃骨头");
	}
	
//	@Override
//	public String toString() {
//		
//	    return "Dog name= " + name;
//	}
	
	//复写finalize方法
	@Override
    protected void finalize() throws Throwable {
        super.finalize();//不要删除
        System.out.println("finalize方法执行了");
    }

}
