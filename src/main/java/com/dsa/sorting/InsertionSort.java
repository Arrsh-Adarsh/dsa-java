package com.dsa.sorting;

import java.util.Collections;
import java.util.List;

public class InsertionSort {

    public static void sort(List<Integer> list) {
        int length = list.size();
        int iteration_counter = 0;

        for (int i = 1; i < length; i++) {
            int currElement = list.get(i);
            iteration_counter++;
            for (int j = 0; j < i; j++) {
                if (list.get(j) >= currElement) {
                    int temp = list.get(j);
                    list.set(j, currElement);
                    currElement = temp;
                }
            }
            list.set(i, currElement);
            System.out.printf("Array after %d pass is: " + list + "\n", i);
        }
        System.out.println("Array Sorted in " + iteration_counter + " iteration: " + list +"\n");
    }

    public static void sortAscending(List<Integer> list) {
        int length = list.size();
        int iteration_counter = 0;

        for (int i = 1; i < length; i++) {
            int currElement = list.get(i);

            for (int j = i - 1; (j > -1) && (list.get(j) > currElement); j--) {
                list.set(j + 1, list.get(j));
                list.set(j, currElement);
            }

            iteration_counter = i;
            System.out.printf("Array after %d pass is: " + list + "\n", i);
        }
        System.out.println("Array Sorted in " + iteration_counter + " iteration: " + list +"\n");
    }


    public static void sortReverse(List<Integer> list) {
        int length = list.size();
        int iteration_counter = 0;

        for (int i = 1; i < length; i++) {
            int currElement = list.get(i);
            iteration_counter++;
            for (int j = 0; j < i; j++) {
                if (list.get(j) <= currElement) {
                    int temp = list.get(j);
                    list.set(j, currElement);
                    currElement = temp;
                }
            }
            list.set(i, currElement);
            System.out.printf("Array after %d pass is: " + list + "\n", i);
        }
        System.out.println("Array Sorted in " + iteration_counter + " iteration: " + list +"\n");
    }
}
