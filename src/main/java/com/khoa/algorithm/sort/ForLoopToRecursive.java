package com.khoa.algorithm.sort;

public class ForLoopToRecursive {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("For Loop:");
        doForLoop(n);
        System.out.println("Recursive Calls:");
        doRecursive(n, 0);
        System.out.println("Recurs Calls:");
        doRecurs(n);
    }

    private static void doRecursive(int n, int i) {
        if (i<n) {
            System.out.println(i);
            i++;
            doRecursive(n, i);
        }
    }

    private static void doRecurs(int n) {
        if (n > 1) {
            doRecurs(n-1);
        }
        System.out.println(n-1);
    }

    private static void doForLoop(int n) {
        for (int i = 0; i<n; i++) {
            System.out.println(i);
        }
    }
}
