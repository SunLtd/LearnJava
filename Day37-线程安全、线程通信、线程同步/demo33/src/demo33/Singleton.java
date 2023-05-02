package demo33;

/**
 * @author 一一哥Sun
 * @company 千锋教育
 */
public class Singleton {
	//volatile修饰变量，禁止指令重排
    private static volatile Singleton instance = null;

    //构造方法私有化
    private Singleton() {}

    //对外公开一个获取单例模式对象的方法
    public static Singleton getInstance() {
    	//双重检查
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}