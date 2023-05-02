package demo21;

/**
 * @author 一一哥Sun
 * V我领资料：syc_2312119590
 * 各平台都有壹哥的同名博客哦
 * 
 */
public class ObjectTest {

	public static void main(String[] args) {
		Dog dog=new Dog("乔治");
		System.out.println("dog一号="+dog);
		System.out.println("dog二号="+dog.toString());
		
		Cat cat=new Cat("汤姆");
		System.out.println("cat一号="+cat);
		System.out.println("cat二号="+cat.toString());
		
		Dog dog01=new Dog("乔治01");
		Dog dog02=new Dog("乔治02");
		System.out.println("dog01对比dog02 "+(dog01==dog02));//false
		System.out.println("dog01对比dog02 "+(dog01.equals(dog02)));//false
		System.out.println("dog01的hash值 "+dog01.hashCode());
		System.out.println("dog02的hash值 "+dog02.hashCode());
		
		//判断运行时d对象和c对象是否是同一个类型
		Animal d = new Dog();
		Animal c = new Cat();

		//方式1：通过 instanceof 关键字判断
		if((d instanceof Dog && c instanceof Dog) ||(d instanceof Cat && c instanceof Cat)) {
		    System.out.println("是同一个类型");
		}else {
		    System.out.println("不是同一个类型");
		}
		
		//方式2：通过getClass方法 判断
		if(d.getClass() == c.getClass()) {
		    System.out.println("是同一个类型");
		}else {
		    System.out.println("不是同一个类型");
		}
		
		//手动将对象标记为垃圾对象
        dog = null;
        //触发垃圾回收器，回收垃圾对象
        System.gc();
		
	}
	
}
