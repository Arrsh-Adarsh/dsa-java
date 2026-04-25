package com.dsa.recursion;

import java.util.List;

public class SumOfNaturalNumber {

    public static void main(String[] args) {
        SumOfNaturalNumber sumOfN = new SumOfNaturalNumber();
        List<Integer> inputs = sumOfN.getInput();

        for (Integer input: inputs) {
            System.out.printf("Sum of Natural from 1 to %d is: %d\n", input, sumOfN.sum(input));
        }
    }

    List<Integer> getInput() {
        return List.of(5, 10, 1000, 16565);  // higher number will give stackoverflow error
    }

    int sum(int n) {
        if(0 < n) {
            return sum(n-1) + n;
        }
         return 0;
    }
}
