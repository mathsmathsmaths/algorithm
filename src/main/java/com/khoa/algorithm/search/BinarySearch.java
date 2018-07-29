package com.khoa.algorithm.search;

import java.util.Arrays;

import static java.util.Arrays.sort;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {364,253,867,354,876,376,294,684,896,486,296};
        int target = 857;
        sort(array);
        System.out.println("Given array: " + Arrays.toString(array));
        int index = binarySearch(array, target);
        System.out.println(index == -1 ? target + " not found" : target  +  " at: " + index);
    }

    public static int binarySearch(int[] array, int target) {
        int leftBoundary = 0;
        int rightBoundary = array.length-1;
        int currentMid = (rightBoundary + leftBoundary)/2;
        while (rightBoundary != leftBoundary) {
            if (rightBoundary - 1 == leftBoundary && currentMid == leftBoundary) {
                if (array[currentMid] == target) {
                    return currentMid;
                } else if (array[rightBoundary] == target){
                    return rightBoundary;
                } else {
                    return -1;
                }
            } else if (array[currentMid] == target) {
                return currentMid;
            } else if (array[currentMid] < target) {
                leftBoundary = currentMid;
                currentMid = (rightBoundary + leftBoundary)/2;
            } else if (array[currentMid] > target) {
                rightBoundary = currentMid;
                currentMid = (rightBoundary + leftBoundary)/2;
            }
        }
        return leftBoundary;
    }
}
