package demo25;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author 一一哥Sun 
 * V我领资料：syc_2312119590 
 * 各平台都有壹哥的同名博客哦
 */
public class Demo10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数:");
        // 保存用户输入的数字
        int num = scanner.nextInt();
        
        // 使用输入的数字创建BigInteger对象
        BigInteger bi = new BigInteger(num + "");
        // 计算大数字加上99的结果
        System.out.println("加法的结果:" + bi.add(new BigInteger("99")));
        // 计算大数字减去25的结果
        System.out.println("减法的结果:" + bi.subtract(new BigInteger("25")));
        // 计算大数字乘以3的结果
        System.out.println("乘法的结果:" + bi.multiply(new BigInteger("3")));
        // 计算大数字除以2的结果
        System.out.println("除法的结果:" + bi.divide(new BigInteger("2")));
        // 计算大数字除以3的商
        System.out.println("取商的结果:" + bi.divideAndRemainder(new BigInteger("3"))[0]);
        // 计算大数字除以3的余数
        System.out.println("取余的结果:" + bi.divideAndRemainder(new BigInteger("3"))[1]);
        // 计算大数字的4次方
        System.out.println("4次方的结果:" + bi.pow(4));
        // 计算大数字的相反数
        System.out.println("取反的结果:" + bi.negate());
	}

}
