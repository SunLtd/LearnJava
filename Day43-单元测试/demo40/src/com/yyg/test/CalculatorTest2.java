package com.yyg.test;

//静态导包，引入Assert类
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import com.yyg.work.Calculator;

/**
 * @author 一一哥Sun
 * @company 千锋教育
 * 
 * 适用于JUnit5版本
 */ 
public class CalculatorTest2 {

	/**
	 * @ParameterizedTest、@ValueSource：JUnit5中的API
	 */
	@ParameterizedTest
    @ValueSource(ints = {2, 3, 4})
    public void testAddition(int i) {
        Calculator calculator = new Calculator();
        assertEquals(i + 2, calculator.add(2, i));
    }
}
