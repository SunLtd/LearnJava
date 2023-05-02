package demo35;
/**
 * @author 一一哥Sun
 * @company 千锋教育
 */
public class ShapeFactory {

	public static Shape createShape(ShapeType shapeType) {
		//使用枚举，创建工厂模式
        switch (shapeType) {
            case CIRCLE:
                return new Circle();
            case RECTANGLE:
                return new Rectangle();
            case SQUARE:
                return new Square();
            default:
                throw new IllegalArgumentException("Invalid shape type: " + shapeType);
        }
    }
	
	public static void main(String[] args) {
		// 使用枚举值,调用工厂方法
		Shape shape = ShapeFactory.createShape(ShapeType.CIRCLE);
		shape.draw();
	}
}
