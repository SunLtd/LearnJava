package demo35;

/**
 * @author 一一哥Sun
 * @company 千锋教育
 */
public enum Singleton {
	//枚举实例值
	INSTANCE;

	//定义其他的属性和方法
	private String name;
	
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
}
