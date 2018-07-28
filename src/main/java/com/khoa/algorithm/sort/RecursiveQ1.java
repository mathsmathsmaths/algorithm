package com.khoa.algorithm.sort;

import java.util.ArrayList;
import java.util.Arrays;

public class RecursiveQ1 {
    public static void main(String[] args) {
        int[] A = new int[] {10, 15, 25};
        int[] B = new int[] {1, 5, 20, 30};
        ArrayList<Integer[]> generatedArrays = new ArrayList<>();
        final int maxLength = ((A.length + B.length)/2)*2;
        generateArrays(A, B, generatedArrays);
    }

    private static void generateArrays(int[] A, int[] B, ArrayList<Integer[]> generatedArrays) {
        generateArraysWithGivenLength(2, A, B, generatedArrays);
    }

    private static void generateArraysWithGivenLength(final int length, int[] A, int[] B, ArrayList<Integer[]> generatedArrays) {
        int[] generated = new int[length];
        int i = -1, pointerA = 0, pointerB = 0;
        while (i < length-1) {
            i+=2;
            if (A[pointerA] < B[pointerB]) {
                while (A[pointerA] < B[pointerB]) {
                    pointerA++;
                }
            }
            if (B[pointerB] < A[pointerA]) {
                while (A[pointerA] < B[pointerB]) {
                    pointerB++;
                }
            }
        }
       // generatedArrays.add(generated);
    }
}
