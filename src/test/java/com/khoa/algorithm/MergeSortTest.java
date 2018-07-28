package com.khoa.algorithm;

import com.khoa.algorithm.sort.MergeSort;
import org.junit.Test;

public class MergeSortTest {

    @Test
    public void testMerge() {
        MergeSort mergeSort = new MergeSort();
        int[] array = new int[] {1,2,3,4};
//        mergeSort.merge(array, 1L, 1L, 1L);
    }

    @Test
    public void test() {
        int[] a = new int[]{1, 2};
        func(a);
        System.out.println(a[0]);
        System.out.println(a[1]);
    }

    @Test
    public void test1() {
        int[] a = new int[]{1, 2};
        func1(a);
        System.out.println(a[0]);
        System.out.println(a[1]);
    }

    @Test
    public void test2() {
        int[] a = new int[]{1, 2};
        func2(a);
        System.out.println(a[0]);
        System.out.println(a[1]);
    }

    static void func(int[] a) {
        a[0] = a[0] + a[1];
        a[1] = 0;
    }

    static void func1(int[] a) {
        int[] b = a;
        b[0] = b[0] + b[1];
        b[1] = 0;
    }

    static void func2(int[] a) {
        a = new int[]{100, 200};
        a[0] = a[0] + a[1];
        a[1] = 0;
    }
}