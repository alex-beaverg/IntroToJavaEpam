package by.epam.bobrikov.stage02.one_dim_sorts;

import java.util.ArrayList;
import java.util.List;

/**
 * Даны дроби p1/q1, p2/q2, ..., pn/qn (pi, qi - натуральные). Составить программу, которая приводит эти дроби к общему
 * знаменателю и упорядочивает их в порядке возрастания
 */
public class Task08 {
    public List<Fraction> taskCalculation(List<Fraction> fractionList) {
        List<Fraction> result = new ArrayList<>();
        int den = 1;
        for (Fraction fraction : fractionList) {
            den *= fraction.getDenominator();
        }
        for (Fraction fraction : fractionList) {
            result.add(new Fraction(fraction.getNumerator() * den / fraction.getDenominator(), den));
        }
        return sortFraction(result);
    }

    public List<Fraction> sortFraction(List<Fraction> fractionList) {
        int j;
        for (int i = 1; i < fractionList.size(); i++) {
            int x = fractionList.get(i).getNumerator();
            for (j = i; j > 0 && x < fractionList.get(j - 1).getNumerator(); j--) {
                fractionList.get(j).setNumerator(fractionList.get(j - 1).getNumerator());
            }
            fractionList.get(j).setNumerator(x);
        }
        return fractionList;
    }

    static class Fraction {
        private int numerator;
        private int denominator;

        Fraction (int numerator, int denominator) {
            this.numerator = numerator;
            this.denominator = denominator;
        }

        public int getNumerator() {
            return numerator;
        }

        public int getDenominator() {
            return denominator;
        }

        public void setNumerator(int numerator) {
            this.numerator = numerator;
        }

        @Override
        public String toString() {
            return numerator + "/" + denominator;
        }
    }
}
