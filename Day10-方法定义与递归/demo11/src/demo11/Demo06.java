package demo11;

public class Demo06 {

	//命令行参数
	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
			System.out.println("args[" + i + "]: " + args[i]);
		}
	}

}
