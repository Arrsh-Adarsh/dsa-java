package com.dsa.recursion;

import java.util.List;

public class TaylorSeries {

    public static void main(String[] args) {
        TaylorSeries taylorSeries = new TaylorSeries();
        List<TaylorSeriesInput> inputs = taylorSeries.getInput();

        for (TaylorSeriesInput input: inputs) {
            System.out.printf("Approach 1: Taylor Series for n = %d, e^%d = %f\n", input.getTerms(), input.getPower(), taylorSeries.getTaylorSeries1(input.getTerms(), input.getPower()));
            System.out.printf("Approach 2: Taylor Series for n = %d, e^%d = %f\n", input.getTerms(), input.getPower(), taylorSeries.getTaylorSeries2(input.getTerms(), input.getPower()));
        }
    }

    List<TaylorSeriesInput> getInput() {
        return List.of(new TaylorSeriesInput(2, 3),
                new TaylorSeriesInput(3, 18),
                new TaylorSeriesInput(9, 23),
                new TaylorSeriesInput(2, 46),
                new TaylorSeriesInput(20, 20),
                new TaylorSeriesInput(36, 58)   // will not give correct output due to stackoverflow
        );
    }

    //Approach 1
    double getTaylorSeries1(int n, int x) {
        if (n == 0) {
            return 1;
        }
        return getTaylorSeries1(n - 1, x) + (getExponent(x, n) / getFactorial(n));
    }

    long getFactorial(int n) {
        if (0 == n) {
            return 1;
        }
        return getFactorial(n - 1) * n;
    }

    double getExponent(float base, int power) {
        if (0 == power) {
            return 1;
        }

        if (0 == power % 2) {
            return getExponent(base * base, power / 2);
        } else {
            return getExponent(base * base, (power - 1) / 2) * base;
        }
    }

    //Approach 2
    double getTaylorSeries2(int n, int x) {
        if (n == 0) {
            return 1;
        }
        return getTaylorSeries2(n - 1, x) + calculateValue(n, x);
    }

    double calculateValue(int n, int x) {
        if (0 == n) {
            return 1;
        }
        return calculateValue(n - 1, x) * x / n;
    }

}


class TaylorSeriesInput {
    int terms;
    int power;

    public TaylorSeriesInput(int terms, int power) {
        this.terms = terms;
        this.power = power;
    }

    int getTerms() {
        return terms;
    }

    int getPower() {
        return power;
    }
}