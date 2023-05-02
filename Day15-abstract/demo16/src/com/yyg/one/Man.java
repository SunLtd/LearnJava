package com.yyg.one;

/**
 * @author 一一哥Sun 
 * QQ：2312119590 
 * CSDN、掘金、知乎找我哦
 * 
 * 男人
 */
public class Man extends Person {
	//子类具体实现个人BMI指数的计算
	//男性标准体重(kg)=[身高(cm)-80]×0.7，女性标准体重(kg)=[身高(cm)-70]×0.6
	public double standardWeight(int height) {
		
		return (height-80)*0.7;
	}

}
