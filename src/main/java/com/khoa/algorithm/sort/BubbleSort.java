package com.khoa.algorithm.sort;

import com.khoa.algorithm.utils.FramesCounter;
import jdk.internal.org.objectweb.asm.tree.analysis.Frame;

import java.util.Arrays;

import static com.khoa.algorithm.sort.SortUtils.swap;

public class BubbleSort {
    public static void main(String[] args) {
        FramesCounter counter = new FramesCounter();
        int[] array = {5,3,8,4,6};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
        counter.stopFramesTimer(false, true);
    }
    public static void bubbleSort(int[] array) {
        boolean arrayChanged = true;
        while (arrayChanged) {
            arrayChanged = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i - 1] > array[i]) {
                    swap(array, i - 1, i);
                    arrayChanged = true;
                }
            }
        }
    }
}
