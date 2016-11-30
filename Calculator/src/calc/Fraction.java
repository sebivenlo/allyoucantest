/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;

/**
 *
 * @author Moha, Marvin Rüsenberg
 */
public class Fraction {

    private int numerator1;
    private int denominator1;
    private int numerator2;
    private int denominator2;

    public Fraction(String firstAddend, String secondAddend) {
        decomposition(firstAddend, secondAddend);
    }

    /**
     * Decomposes a given String from a .csv File into fractions for calculation.
     * 
     * 
     * @param frac1
     * @param frac2 
     */
    private void decomposition(String frac1, String frac2) {
        this.numerator1 = Integer.parseInt(frac1.split("/")[0]);
        this.denominator1 = Integer.parseInt(frac1.split("/")[1]);
        this.numerator2 = Integer.parseInt(frac2.split("/")[0]);
        this.denominator2 = Integer.parseInt(frac2.split("/")[1]);

        //System.out.println("Frac 1 = " + this.numerator1 + "/" + this.denominator1);
        //System.out.println("Frac 2 = " + this.numerator2 + "/" + this.denominator2);

    }
}
