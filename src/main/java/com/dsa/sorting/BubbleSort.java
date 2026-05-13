package com.dsa.sorting;

import java.util.Collections;
import java.util.List;

public class BubbleSort {

    public static void sort(List<Integer> list) {
        int length = list.size();
        boolean isSorted = false;
        int iteration_counter = 0;

        for (int i = 0; i < length && !isSorted; i++) {
            isSorted = true;
            iteration_counter++;

            for (int j = 1; j < length - i; j++) {
                if (list.get(j - 1) > list.get(j)) {
                    isSorted = false;
                    Collections.swap(list, j, j-1);
                }
            }
            System.out.printf("Array after %d pass is: " + list + "\n", i + 1);
        }
        System.out.println("Array Sorted in " + iteration_counter + " iteration: " + list +"\n");
    }

    public static void sortReverse(List<Integer> list) {
        int length = list.size();
        boolean isSorted = false;
        int iteration_counter = 0;

        for (int i = 0; i < length && !isSorted; i++) {
            isSorted = true;
            iteration_counter++;

            for (int j = 1; j < length - i; j++) {
                if (list.get(j - 1) < list.get(j)) {

                    isSorted = false;
                    Collections.swap(list, j, j-1);
                }
            }
            System.out.printf("Array after %d pass is: " + list + "\n", i + 1);
        }
        System.out.println("Array Sorted in " + iteration_counter + " iteration: " + list +"\n");
    }
}
