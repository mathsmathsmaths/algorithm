package com.khoa.algorithm.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static java.util.Collections.sort;

public class BucketSort {
    public static void main(String[] args) {
        double[] array = {0.745,0.794,0.838,0.175,0.184};
        bucketSort(array);
        System.out.println(Arrays.toString(array));
    }
    public static void bucketSort(double[] array) {
        int n = array.length;
        //create buckets
        List<Double>[] buckets = new List[n];
        List<Double> result = new ArrayList<>();
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }
        for (int i = 0; i < n; i++) {
            buckets[(int) (n*array[i])].add(array[i]);
        }
        for (int i = 0; i < n; i++) {
            sort(buckets[i]);
            result.addAll(buckets[i]);
        }
        for (int i = 0; i < n; i++) {
            array[i] = result.get(i);
        }
    }
}
