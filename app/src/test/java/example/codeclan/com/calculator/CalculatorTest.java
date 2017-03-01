package example.codeclan.com.calculator;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by user on 01/03/2017.
 */

public class CalculatorTest {

    Calculator calc;

    @Before
    public void before() {
        calc = new calculator();
    }

    @Test
    public void testAdd() {
        assertEquals(4, calc.add(2,2));
    }

    @Test
    public void testSubtract() {
        assertEquals(4, calc.subtract(6,2));
    }

    @Test
    public void testMultiply() {
        assertEquals(4, calc.multiply(2,2));
    }

    @Test
    public void testDivide() {
        assertEquals(3, calc.divide(7,2));


}
