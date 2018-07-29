package com.khoa.algorithm.sort;

import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args) {
        int arr[] = {-100, -1, 170, 45, 75, 90, 802, 24, 2, 66};
        radixSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void radixSort(int[] arr) {
        int max = SortUtils.getMax(arr);
        for (int exp = 1; max/exp > 0; exp *= 10) {
            countSortSubroutine(arr, exp);
        }
    }

    private static void countSortSubroutine(int[] arr, int exp) {
        int min = SortUtils.getMin(arr);
        int offset = 0;
        if (min < 0) {
            offset = -min;
        }
        int[] output = new int[arr.length];
        int i;
        int[] count = new int[SortUtils.getMax(arr)+1+offset];
        for (i = 0; i < arr.length; i++) {
            count[((arr[i] / exp) % 10)+offset]++;
        }
        for (i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }
        for (i = arr.length-1; i >= 0; i--) {
            output[count[((arr[i]/exp)%10)+offset]-1] = arr[i];
            count[((arr[i]/exp)%10)+offset]--;
        }
        for (i = 0; i < arr.length; i++) {
            arr[i] = output[i];
        }
    }
}
