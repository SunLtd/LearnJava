package demo08;

/**
 * @author 一一哥Sun QQ：2312119590 CSDN、掘金、知乎找我哦
 */
public class Demo06 {

	public static void main(String[] args) {
		//多层循环嵌套

		//打印5行5列的矩形，用 * 表示
		label01:for(int i = 1 ; i <= 5 ;i++){ //控制行
			
		    label02:for(int j = 1 ; j <= 5 ; j++){//控制列
		        System.out.print(" * ");
		        //当执行到第3列时，提前跳出循环
		        if(j==3) {
		        	break label02;
		        	//continue label02;
		        }
		    }
		    
		    //进行换行
		    System.out.println();
		}
	}

}
