package com.khoa.algorithm.sort;

import java.util.Arrays;

import static com.khoa.algorithm.sort.SortUtils.getMax;
import static com.khoa.algorithm.sort.SortUtils.getMin;


public class CountSort {
    public static void main(String[] args) {
        int[] array = {-2,-10,10,-3,0,1,5,2};
        countSort(array);
        System.out.println(Arrays.toString(array));

    }

    private static void countSort(int[] array) {
        int min = getMin(array);
        int offset = 0;
        if (min < 0) {
            offset = -min;
        }
        final int n = array.length;
        int max = getMax(array);
        int[] count = new int[max+1+offset];
        int[] output = new int[n];
        for (int i = 0; i < n; i++) {
            count[array[i] + offset]++;
        }
        for (int i = 0; i < count.length-1; i++) {
            count[i+1] = count[i] + count[i+1];
        }
        for (int i = 0; i < n; i++) {
            output[count[array[i]+offset]-1] = array[i];
            count[array[i]+offset]--;
        }
        System.arraycopy(output, 0, array, 0, n);
    }


}
