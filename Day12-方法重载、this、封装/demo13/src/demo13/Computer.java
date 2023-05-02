package demo13;

/**
 * @author 一一哥Sun QQ：2312119590 CSDN、掘金、知乎找我哦
 */
public class Computer {
	// 电脑品牌
	private String logo;

	// 电脑颜色
	private String color;

	// 播放音频
	public void playSound() {
		System.out.println("播放音频...");
	}

	// 播放视频
	public void playVideo() {
		// 同时播放音频
		this.playSound();

		System.out.println("播放视频...");
	}

	public Computer() {
		// this(a,b)调用另一个构造方法
		this(null, null);
	}

	public Computer(String logo) {
		// this(a,b)调用另一个构造方法
		this(logo, null);
	}

	public Computer(String logo, String color) {
		System.out.println("logo=" + logo + ",color=" + color);
	}

	public static void main(String[] args) {
		// 静态方法中不能使用非静态成员
		// this.playVideo();

		Computer com = new Computer();
		com.playVideo();
		
		Computer com2=new Computer("苹果");
	}

}
