package com.khoa.algorithm.sort;

import java.util.*;

public class InsertionSort {
    private static boolean isRunning;
    private static int frames;
    private static Thread framesCounter = new Thread() {
        @Override
        public void run() {
            super.run();
            while (isRunning) {
                frames++;
            }
        }
    };
    public static void main(String[] args) {
//        isRunning = true;
//        framesCounter.start();
//        ArrayList arrayToSort = new ArrayList(Arrays.asList(4,2,6,9,7,4,6,8,3,5,6,8,4,6,4,0,2,5,8,-1,-3,7,4,6));
//        insertionSort(arrayToSort.stream().mapToInt(i -> (int) i).toArray());
//        int[] valueInsertionSort;
//        valueInsertionSort = insertionSort(arrayToSort.stream().mapToInt(i -> (int) i).toArray());
//        System.out.println(Arrays.toString(valueInsertionSort));
//        isRunning = false;
//        System.out.println(frames);
        int[] array = {6,9,4,0};
        insertionSort(array);
        System.out.println(Arrays.toString(array));
        double[] array2 = {1,6.9,4.5,6.7};
        insertionSort(array2);
        System.out.println(Arrays.toString(array2));
//        Thread tr = new Thread() {
//            @Override
//            public void run() {
//                insertionSort(arrayToSort.stream().mapToInt(i -> (int) i).toArray());
//                int[] valueInsertionSort;
//                super.run();
//                Random r = new Random();
//                int j = 0;
//                while (j < 1000) {
//                    arrayToSort.add(r.nextInt(1000));
//                    valueInsertionSort = insertionSort(arrayToSort.stream().mapToInt(i -> (int) i).toArray());
//                    System.out.flush();
//                    j++;
//                    System.out.print((char)13);
//                    System.out.print(Arrays.toString(valueInsertionSort));
//                }
//            }
//        };
//        tr.start();
    }
    public static void insertionSort(int[] array) {
        for (int j = 1; j < array.length; j++) {
            int key = array[j];
            int i = j - 1;
            while (i > -1 && array[i] > key) {
                array[i + 1] = array[i];
                i = i - 1;
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
                i = i - 1;
            }
            array[i + 1] = key;
        }
    }
}