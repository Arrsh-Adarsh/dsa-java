package com.dsa.recursion;

import java.util.List;

public class Factorial {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        List<Integer> inputs = factorial.getInput();

        for (Integer input: inputs) {
            System.out.printf("Factorial of %d is: %d\n", input, factorial.getFactorial(input));
        }
    }

    List<Integer> getInput() {
        return List.of(5, 10, 15, 19, 20, 21, 65);  // 20 is max limit in long to get correct result
    }

    long getFactorial(int n) {
        if(0 < n) {
            return getFactorial(n - 1) * n;
        }
        return 1;
    }
}
