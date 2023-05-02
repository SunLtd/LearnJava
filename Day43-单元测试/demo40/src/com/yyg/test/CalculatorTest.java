package com.yyg.test;

//静态导包，引入Assert类
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.yyg.work.Calculator;

/**
 * @author 一一哥Sun
 * @company 千锋教育
 */ 
//@RunWith(JUnitParamsRunner.class)
@RunWith(Parameterized.class)
public class CalculatorTest {

	@Test
    public void testAddition() {
		//创建Calculator对象
        Calculator calculator = new Calculator();
        //assertEquals是Assert静态类中的方法，我们可以通过静态导包引入该方法，然后直接调用
        //assert-->断言，判断2+2的结果是否等于4，如果等于则执行通过，否则报错
        assertEquals(3, calculator.add(2, 2));
    }
	
	//处理异常
	//制定异常的处理规则
	@Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void testDivideByZero() {
    	//期待该异常由算术异常来处理
        exceptionRule.expect(ArithmeticException.class);
        //期待预料会产生除零错误
        exceptionRule.expectMessage("/ by zero");
        Calculator calculator = new Calculator();
        //调用方法
        calculator.divide(1, 0);
    }
    
    //参数化测试
    //@ParameterizedTest
    //@ValueSource(ints = {2, 2, 4})
    public void testAddition(int i) {
        Calculator calculator = new Calculator();
        assertEquals(i + 2, calculator.add(2, i));
    }
    
    private int x;
    private int y;
    private int expected;

    public CalculatorTest(int x, int y, int expected) {
        this.x = x;
        this.y = y;
        this.expected = expected;
    }

    //参数化处理，定义方法中要使用的参数
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
    	//定义几个待测试的参数
        return Arrays.asList(new Object[][]{
                {2, 2, 4},
                //{1, 1, 3},
                {1, 1, 2},
                {0, 0, 0},
                {-1, -1, -2},
                {-1, 1, 0},
                {1, -1, 0}
        });
    }

    @Test
    public void testAdditionParameters() {
        Calculator calculator = new Calculator();
        assertEquals(expected, calculator.add(x, y));
    }
}
