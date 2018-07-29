package com.khoa.algorithm.search;

public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {458,262,795,474,275,587};
        int target = 262;
        int targetPresentIndex = linearSearch(array, target);
        System.out.println((targetPresentIndex == -1) ? target + " is not present in the array." : target + " is present at index " + targetPresentIndex);
    }
    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
