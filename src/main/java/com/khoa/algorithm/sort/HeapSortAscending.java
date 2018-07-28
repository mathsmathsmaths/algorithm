package com.khoa.algorithm.sort;

import java.util.Arrays;

import static com.khoa.algorithm.sort.SortUtils.*;


public class HeapSortAscending {
    public static void main(String[] args) {
        int[] arr = {37,48,27,69,47,56,39};
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void heapSort(int[] arr) {
        int n = arr.length;
        maxHeapify(arr, n);
        for (int i = arr.length-1; i > 0; i--) {
            swap(arr, 0, i);
            n--;
            maxHeapify(arr, n);
        }
    }
}
