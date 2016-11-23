/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;

/**
 *
 * @author Moha
 */
public class Calculator {

    /**
     * Add Method
     *
     * @param a
     * @param b
     * @return
     */
    public double add(double a, double b) {
        return a += b;
    }

    /**
     * Add two fractions. Then the method shortens the fracture.
     *
     * @param a
     * @param b
     * @return
     */
    public String addFraction(String a, String b) {
        int numerator1 = Integer.parseInt(a.split("/")[0]);
        int denominator1 = Integer.parseInt(a.split("/")[1]);
        int numerator2 = Integer.parseInt(b.split("/")[0]);
        int denominator2 = Integer.parseInt(b.split("/")[1]);

        int resultNum = (numerator1 * denominator2) + (numerator2 * denominator1);
        int resultDen = denominator1 * denominator2;
        int resWhole = 0;

        while (resultNum > resultDen) {
            resultNum = resultNum - resultDen;
            resWhole++;
        }

        if (resultNum == resultDen) {
            return Integer.toString(resWhole + 1);
        }
        int ggtVar = ggt(resultNum, resultDen);
        resultNum /= ggtVar;
        resultDen /= ggtVar;
        if (resWhole == 0) {
            return resultNum + "/" + resultDen;
        } else {
            return resWhole + " " + resultNum + "/" + resultDen;
        }
    }

    /**
     * Calculates the largest common divisor
     * 
     * @param a
     * @param b
     * @return
     */
    private int ggt(int a, int b) {
        while (b != 0) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }
}
