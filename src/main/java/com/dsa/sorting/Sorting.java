package com.dsa.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sorting {

    public static void main(String[] args) {
        List<List<Integer>> inputs = new Sorting().getInputArray();

        for (List<Integer> input : inputs) {
            System.out.println("------------------- Bubble Sort ----------------------");
            BubbleSort.sort(new ArrayList<>(input));
            BubbleSort.sortReverse(new ArrayList<>(input));

            System.out.println("------------------- Insertion Sort ----------------------");
            InsertionSort.sort(new ArrayList<>(input));
            InsertionSort.sortAscending(new ArrayList<>(input));
            InsertionSort.sortReverse(new ArrayList<>(input));

            System.out.println("------------------- Selection Sort ----------------------");
            SelectionSort.sort(new ArrayList<>(input));
            SelectionSort.sortReverse(new ArrayList<>(input));
        }
    }

    public List<List<Integer>> getInputArray() {
        return Arrays.asList(Arrays.asList(3,6,9,1,4,7),
                Arrays.asList(23, 54, 13, 12, 89, 37, 71),
                Arrays.asList(345, 12, 72, 29, 826, 621, 237, 278),
                Arrays.asList(34, 193, 582, 38, 8, 279, 3, 42),
                Arrays.asList(23, 5567, 121, 213, 45, 23, 57, 13, 473, 18, 325, 943, 87, 44, 65, 27));
    }
}
