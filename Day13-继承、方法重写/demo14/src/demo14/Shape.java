package demo14;

/**
 * @author 一一哥Sun QQ：2312119590 CSDN、掘金、知乎找我哦
 * 
 *         定义一个父类的“形状类”
 *         
 * Permitted class Triangle does not declare demo14.Shape as direct super class
 */
public sealed class Shape permits Rect, Circle, Triangle {

}
