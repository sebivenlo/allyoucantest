/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Moha
 */
public class CalculatorTest {

    Calculator calc;

    public CalculatorTest() {
    }

    @Before
    public void setUp() {
        calc = new Calculator();
    }

    @After
    public void tearDown() {
        calc = null;
    }

    /**
     * Test add method without parameterized concept
     */
    @Test
    public void testAddMethod1() {
        assertEquals(14, calc.add(12, 2), 0.1);
        assertEquals(7, calc.add(3, 4), 0.1);
        assertEquals(8, calc.add(4, 4), 0.1);
        assertEquals(3, calc.add(1, 2), 0.1);
        assertEquals(3, calc.add(1, 2), 0.1);
        assertEquals(14, calc.add(10, 4), 0.1);
        assertEquals(200, calc.add(100, 100), 0.1);
        assertEquals(75, calc.add(50, 25), 0.1);
        assertEquals(60, calc.add(30, 30), 0.1);
        assertEquals(0, calc.add(0, 0), 0.1);

    }

    @Test
    public void testAddFractionMethod() {
        assertEquals("1", calc.addFraction("1/2", "1/2"));
        assertEquals("2", calc.addFraction("6/4", "2/4"));

    }

    @Test
    public void testAddFractionMixTypes() {
        assertEquals("1.0", calc.addFraction(0.5, 0.5));
        assertEquals("0.95", calc.addFraction(0.75, 0.2));
    }

}
