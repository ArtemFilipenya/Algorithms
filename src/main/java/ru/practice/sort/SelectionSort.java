/**
 * Заключается в последовательном поиске минимального числа и
 * замены местами с первым, на второй итерации со втором и тд.
 */
package ru.practice.sort;

import java.util.Arrays;

public class SelectionSort {
    private static final int[] arr = new int[] {2, 9, -5, 138, 0, 1, -1000, 100};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(selectionSort(arr)));
    }

    private static int findMinElement(int[] array, int start) {
        int minElement = array[start];
        int minIndex = start;

        for (int i = start + 1; i < array.length; i++) {
            if (array[i] < minElement) {
                minElement = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    private static int[] selectionSort(int[] array) {
        for (int step = 0; step < array.length; step++) {
            int index = findMinElement(array, step);
            int tempValue = array[step];
            array[step] = array[index];
            array[index] = tempValue;
        }
        return array;
    }
}