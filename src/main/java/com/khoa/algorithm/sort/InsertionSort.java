package com.khoa.algorithm.sort;

import com.sun.org.apache.xml.internal.security.Init;

import java.util.*;

public class InsertionSort {
    public static void main(String[] args) {
        /* Init a FramesCounter (@link FramesCounter) */

        //Test InsertionSort for array of ints
        int[] array = {6,9,4,0};
        insertionSort(array);
        System.out.println(Arrays.toString(array));

        //Test InsertionSort for array of doubles
        double[] array2 = {1.8464,6.9486,4.53875,6.76386};
        insertionSort(array2);
        System.out.println(Arrays.toString(array2));

        //Test InsertionSort on ArrayList
        ArrayList<Double> array3 = new ArrayList<>(Arrays.asList(5.2,0.68,6.567,7.05,1.04));
        insertionSort(array3);
        System.out.println(Arrays.toString(array3.toArray()));
    }
    public static void insertionSort(int[] array) {
        for (int j = 1; j < array.length; j++) {
            int key = array[j];
            int i = j - 1;
            while (i > -1 && array[i] > key) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = key;
        }
    }
    public static void insertionSort(double[] array) {
        for (int j = 1; j < array.length; j++) {
            double key = array[j];
            int i = j - 1;
            while (i > -1 && array[i] > key) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = key;
        }
    }
    public static void insertionSort(ArrayList array) {
        for (int j = 1; j < array.size(); j++) {
            double key = ((Number) array.get(j)).doubleValue();
            int i = j - 1;
//            Number comparer = (Number) array.get(i);
            while (i > -1 && key < ((Number) array.get(i)).doubleValue()) {
                //array[i + 1] = array[i];
                array.set(i+1, array.get(i));
                i--;
            }
            array.set(i + 1, key);
        }
    }
    public static void insertionSort(List array) {
        for (int j = 1; j < array.size(); j++) {
            double key = ((Number) array.get(j)).doubleValue();
            int i = j - 1;
//            Number comparer = (Number) array.get(i);
            while (i > -1 && key < ((Number) array.get(i)).doubleValue()) {
                //array[i + 1] = array[i];
                array.set(i+1, array.get(i));
                i--;
            }
            array.set(i + 1, key);
        }
    }
}