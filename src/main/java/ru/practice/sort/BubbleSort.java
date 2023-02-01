/**
 * Заключается в попарном сравнении элементов; 1,2; 2,3...
 * Если левый элемент больше, чем правый - то меняем их местами.
 * цикл while до тех пор, пока не будет перестановок.
 */
package ru.practice.sort;

import java.util.Arrays;

public class BubbleSort {
    private static final int[] arr = new int[] {2, 9, -5, 138, 0, 1, -1000, 100};

    private static int[] sort(int[] arr) {
        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < arr[i - 1]) {
                    int tempValue = arr[i];
                    arr[i] = arr[ i - 1];
                    arr[i - 1] = tempValue;
                    isSorted = false;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sort(arr)));
    }
}