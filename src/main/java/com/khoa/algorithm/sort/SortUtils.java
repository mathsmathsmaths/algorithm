package com.khoa.algorithm.sort;

import java.util.Arrays;

public class SortUtils {
    public static void main(String[] args) {
        /* main() method to test methods */
        int[] arr = new int[]{37,48,27,39,69,47,56,39,39};
        int n = arr.length;
        minHeapify(arr, n);
        System.out.println(Arrays.toString(arr));
    }


    public static void maxHeapify(int[] arr, int n) {
        for (int i = n / 2 - 1; i >= 0; i--)
            maxHeapifyParentAndChildrenNodes(arr, n, i);
    }
    public static void minHeapify(int[] arr, int n) {
        for (int i = n / 2 - 1; i >= 0; i--)
            minHeapifyParentAndChildrenNodes(arr, n, i);
    }
    public static void maxHeapifyParentAndChildrenNodes(int[] arr, int n, int i) {
        int largest = i, leftChild = 2*i+1, rightChild = 2*i+2;
        if (leftChild < n && arr[leftChild] > arr[largest])
            largest = leftChild;
        if (rightChild < n && arr[rightChild] > arr[largest])
            largest = rightChild;
        if (largest != i) {
            int swaper = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swaper;
            maxHeapifyParentAndChildrenNodes(arr, n, largest);
        }
    }
    public static void minHeapifyParentAndChildrenNodes(int[] arr, int n, int i) {
        int smallest = i, leftChild = 2*i+1, rightChild = 2*i+2;
        if (leftChild < n && arr[leftChild] < arr[smallest])
            smallest = leftChild;
        if (rightChild < n && arr[rightChild] < arr[smallest])
            smallest = rightChild;
        if (smallest != i) {
            int swaper = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = swaper;
            minHeapifyParentAndChildrenNodes(arr, n, smallest);
        }
    }


    public static void swap(int[] arr, int index1, int index2) {
        int swapHelper = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = swapHelper;
    }


    public static int getMax(int[] arr) {
        int currentMax = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > currentMax) {
                currentMax = arr[i];
            }
        }
        return currentMax;
    }
    public static int getMin(int[] arr) {
        int currentMin = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < currentMin) {
                currentMin = arr[i];
            }
        }
        return currentMin;
    }
}
