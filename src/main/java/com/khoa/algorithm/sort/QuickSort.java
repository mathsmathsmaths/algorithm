package com.khoa.algorithm.sort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {10,80,30,90,40,50};
        quickSort(array, 0, array.length-1);
        System.out.println(Arrays.toString(array));
    }
    private static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);
            quickSort(array, low, pi - 1);
            quickSort(array, pi+1, high);
        }
    }
    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                SortUtils.swap(array, i, j);
            }
        }
        SortUtils.swap(array, i+1, high);
        return (i+1);
    }
}
