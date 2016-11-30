/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;

import junitparams.FileParameters;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

/**
 *
 * @author Moha
 */
@RunWith(JUnitParamsRunner.class)
public class CalculatorParamsLibTest {

    Calculator calc;

    @Before
    public void setUp() {
        calc = new Calculator();
    }

    @After
    public void tearDown() {
        calc = null;
    }

    /**
     * Test add method with JUnitParams lib and CSV file
     *
     * @param a
     * @param b
     * @param result
     */
    @Test
    @FileParameters("addMethodParam.csv")
    public void testAddWithCSVMethod(double a, double b, double result) {
        assertEquals(result, calc.add(a, b), 0.1);
    }

    /**
     * Test add method of fractions with JUnitParams lib and CSV file
     *
     * @param a
     * @param b
     * @param result
     */
    @Test
    @FileParameters("fractionTestData.csv")
    public void testAddFractionWithCSVMethod(String a, String b, String result) {
        assertEquals(result, calc.addFraction(a, b));
    }

    /**
     * Test add method with JUnitParams lib and parameters
     *
     * @param a
     * @param b
     * @param result
     */
    @Parameters({"12, 2, 14", "3, 4, 7", "4, 4, 8", "1, 2, 3", "1, 2, 3", "10, 4, 14", "100, 100, 200", "50, 25, 75",
        "50, 25, 75", "30, 30, 60", "0, 0, 0", "2147483646, 1, 2147483647"})
    public void testAddMethod(double a, double b, double result) {
        assertEquals(result, calc.add(a, b), 0.1);
    }

}
