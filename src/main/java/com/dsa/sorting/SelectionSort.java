package com.dsa.sorting;

import java.util.Collections;
import java.util.List;

public class SelectionSort {

    public static void sort(List<Integer> list) {
        int length = list.size();

        for (int i = 0; i < length - 1; i++) {
            int smallestElementIndex = i;
            for (int j = i + 1; j < length; j++) {
                if (list.get(j) < list.get(smallestElementIndex)) {
                    smallestElementIndex = j;
                }
            }
            Collections.swap(list, i, smallestElementIndex);
            System.out.printf("Array after %d pass is: " + list + "\n", i + 1);
        }
        System.out.println("Sorted Array : " + list +"\n");
    }

    public static void sortReverse(List<Integer> list) {
        int length = list.size();

        for (int i = 0; i < length - 1; i++) {
            int smallestElementIndex = i;
            for (int j = i + 1; j < length; j++) {
                if (list.get(j) > list.get(smallestElementIndex)) {
                    smallestElementIndex = j;
                }
            }
            Collections.swap(list, i, smallestElementIndex);
            System.out.printf("Array after %d pass is: " + list + "\n", i + 1);
        }
        System.out.println("Sorted Array : " + list +"\n");
    }
}
