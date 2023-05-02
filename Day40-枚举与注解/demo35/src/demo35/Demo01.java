package demo35;

/**
 * @author 一一哥Sun
 * @company 千锋教育
 */
public class Demo01 {

	public static void main(String[] args) {
		// 使用枚举值
		Sex sex = Sex.MALE;
		System.out.println("sex=" + sex);

		// 也可以在switch中使用
		switch (sex) {
		case MALE: {
			System.out.println("性别是男的..." );
			break;
		}
		case FAMALE: {
			System.out.println("性别是女的..." );
			break;
		}
		default:
			throw new IllegalArgumentException("未知性别: " + sex);
		}
	}

}

/**
 * @author 一一哥Sun
 * @company 千锋教育 枚举类--性别
 */
enum Sex {
	MALE, FAMALE
}
