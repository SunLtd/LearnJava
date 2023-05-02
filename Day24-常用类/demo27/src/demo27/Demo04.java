package demo27;

public class Demo04 {

	public static void main(String[] args) {
		//arraycopy的用法
		
		//源数组
		char[] srcArray = {'A','B','C','D'};
		//目标数组
        char[] destArray = {'1','2','3','4','5'};
        
        //进行数组复制
        System.arraycopy(srcArray,1,destArray,1,2);
        
        System.out.println("遍历源数组:");
        for(int i = 0;i < srcArray.length;i++) {
            System.out.println("源数组中的每个元素:"+srcArray[i]);
        }
        
        System.out.println("遍历目标数组:");
        for(int j = 0;j < destArray.length;j++) {
            System.out.println("新数组中的每个元素:"+destArray[j]);
        }
	}

}
