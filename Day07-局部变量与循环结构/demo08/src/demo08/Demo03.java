package demo08;

/**
 * @author 一一哥Sun
 * QQ：2312119590
 * CSDN、掘金、知乎找我哦
 */
public class Demo03 {

	public static void main(String[] args) {
		//continue关键字
		
		//案例：输出100以内，所有不是3的倍数的整数
		for(int i = 1; i <= 100 ; i++){
		    if(i % 3 == 0){
		    	//结束本次循环，继续执行下次循环，并不会结束整个循环，直到完成整个循环
		        continue;
		    }        
		    System.out.println(i);            
		}
	
	}

}
