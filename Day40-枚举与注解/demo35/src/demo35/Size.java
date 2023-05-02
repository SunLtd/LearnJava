package demo35;

/**
 * @author 一一哥Sun
 * @company 千锋教育
 */
public enum Size {
	//3个枚举值
	SMALL("S"), MEDIUM("M"), LARGE("L");

    private String abbreviation;

    //构造方法必须私有化或默认的，否则会出现编译错误：
    //llegal modifier for the enum constructor; only private is permitted.
    private Size(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }
}
