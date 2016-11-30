/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;

import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * TestClass making use of the default JUnit Parameter-Testing
 * 
 * @author Moha, Marvin Rüsenberg
 */
@RunWith(Parameterized.class)
public class CalculatorParamsTest {

    Calculator calc;
    private double a;
    private double b;
    private double result;

    public CalculatorParamsTest(double a, double b, double result) {
        this.a = a;
        this.b = b;
        this.result = result;
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
     * Method for returning the Collection of specified Parameters
     *
     * 
     * @return Two Dimensional Object Array of Parameters
     */
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {12, 2, 14}, {3, 4, 7}, {4, 4, 8}, {1, 2, 3}, {1, 2, 3}, {10, 4, 14}, {100, 100, 200}, {50, 25, 75},
            {50, 25, 75}, {30, 30, 60}, {0, 0, 0},
            {2147483646, 1, 2147483647}, {-2147483647, 2147483647, 0}
        });
    }

    /**
     * Test add method with JUnit parameterized concept and static collection
     * list
     */
    @Test
    public void testAddMethod() {
        assertEquals(result, calc.add(a, b), 0.1);
    }
}
