package com.khoa.algorithm.sort;

import java.util.Arrays;

public class MergeSort {
    private static boolean isRunning;
    private static int frames;
    private static Thread framesCounter = new Thread() {
        @Override
        public void run() {
            super.run();
            while (isRunning) {
                frames++;
            }
            System.out.println(frames);
        }
    };
    public static void main(String[] args) {
        isRunning = true;
        framesCounter.start();
        int[] array = {4,2,6,9,7,4,6,8,3,5,6,8,4,6,4,0,2,5,8,-1,-3,7,4,6};
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(array, 0, array.length-1);
        mergeSort.printArray(array);
        isRunning = false;
    }
    public void merge(int[] a, int p, int q, int r) {
        int[] tempLeft = new int[q-p+1];
        int[] tempRight = new int[r-q];
        for (int i=0; i<tempLeft.length; i++) {
            tempLeft[i] = a[i + p];
        }
        for (int i=0; i<tempRight.length; i++) {
            tempRight[i] = a[q + 1 + i];
        }
        int i = 0, j = 0, k = p;
        while (i < tempLeft.length && j < tempRight.length) {
            if (tempLeft[i] <= tempRight[j]) {
                a[k] = tempLeft[i];
                i++;
            }
            else {
                a[k] = tempRight[j];
                j++;
            }
            k++;
        }
        while (i < tempLeft.length) {
            a[k] = tempLeft[i];
            i++;
            k++;
        }
        while (j < tempRight.length) {
            a[k] = tempRight[j];
            j++;
            k++;
        }
    }
    public void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }
    public void sort(int[] A, int p, int r) {
        if (p < r) {
            int q = ((p+r)/2);
            sort(A,p,q);
            sort(A,q+1,r);
            merge(A, p, q, r);
        }
    }
}
