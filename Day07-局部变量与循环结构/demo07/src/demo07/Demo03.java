package demo07;

/**
 * @author 一一哥Sun QQ：2312119590 CSDN、掘金、知乎找我哦
 */
public class Demo03 {

	public static void main(String[] args) {
		// for循环嵌套--打印出一个三角形，用“*”来表示
		for (int i = 1; i <= 5; i++) {
			//定义第2个局部变量j，j设置为<=i
			for (int j = 1; j <= i; j++) {
				//这里千万不要换行哦
				System.out.print(" * ");
			}
			//这里一定要换行哦
			System.out.println();
		}
		
		//打印出九九乘法表。
		for(int i=1; i<=9 ; i++){
			//定义第2个局部变量
		    for(int j = 1 ; j<=i ;j++){ 
		    	//"\t"制表符，缩进几个空格。
		        System.out.print(j+"*"+i+"="+(j*i)+"\t");
		    }
		    //注意换行
		    System.out.println();
		}
	}

}
