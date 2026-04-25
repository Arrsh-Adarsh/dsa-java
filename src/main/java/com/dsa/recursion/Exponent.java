package com.dsa.recursion;

import java.util.List;

public class Exponent {

    public static void main(String[] args) {
        Exponent factorial = new Exponent();
        List<ExponentInput> inputs = factorial.getInput();

        for (ExponentInput input: inputs) {
            System.out.printf("Exponent of %d^%d is: %d\n", input.getBase(), input.getPower(),
                    factorial.getExponent(input.getBase(), input.getPower()) );

            System.out.printf("Exponent using optimized method of %d^%d is: %d\n", input.getBase(), input.getPower(),
                    factorial.getExponentOptimized(input.getBase(), input.getPower()) );
        }
    }

    List<ExponentInput> getInput() {
        return List.of(new ExponentInput(2, 10),
                new ExponentInput(7, 14),
                new ExponentInput(3, 5),
                new ExponentInput(5, 5),
                new ExponentInput(10, 7),
                new ExponentInput(23, 11)
                );
    }

    long getExponent(int base, int power) {
        if (0 == power) {
            return 1;
        } else {
            return getExponent(base, power -1) * base;
        }
    }

    long getExponentOptimized(int base, int power) {
        if (0 == power) {
            return 1;
        }

        if (0 == power % 2) {
            return getExponentOptimized(base * base, power/2);
        } else {
            return getExponentOptimized(base * base, (power - 1) /2) * base;
        }
    }
}

class ExponentInput {
    int base;
    int power;

    public ExponentInput(int base, int power) {
        this.base = base;
        this.power = power;
    }

    int getBase() {
        return base;
    }

    int getPower() {
        return power;
    }
}
