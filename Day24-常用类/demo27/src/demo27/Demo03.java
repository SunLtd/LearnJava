package demo27;

public class Demo03 {

	public static void main(String[] args) {
		//getProperty的用法
		
		//获取java版本
		String version = System.getProperty("java.version");
		System.out.println("Java版本:"+version);
		
		//获取java安装目录
		String home = System.getProperty("java.home");
		System.out.println("Java目录:"+home);
		
		//系统名称
        String name = System.getProperty("os.name");
        System.out.println("操作系统名称:"+name);
        
        //用户名称
        String user = System.getProperty("user.name");
        System.out.println("当前用户名称:"+user);
	}

}
