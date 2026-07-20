package org.heyitskdk.data_structures_and_algorithms.scaler.module_05_advanced_dsa_1.assignment.q_01_range_sum_query;

import java.util.Arrays;

public class Solution {
    public static long[] rangeSum(int[] A, int[][] B) {
        int n = A.length, m = B.length;
        long[] sum = new long[m];
        long[] arr = createPrefixArray(A);

        for (int i = 0; i < m; i++) {
            int l = B[i][0];
            int r = B[i][1];

            sum[i] = arr[r];
            if (l > 0) sum[i] -= arr[l - 1];
        }

        return sum;
    }

    public static long[] createPrefixArray(int[] A) {
        int n = A.length;
        
        long[] arr = new long[n];
        arr[0] = A[0];

        for (int i = 1; i < n; i++)
            arr[i] = A[i] + arr[i - 1];

        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(rangeSum(new int[] { 7, 3, 1, 5, 5, 5, 1, 2, 4, 5 }, new int[][] { {6, 9}, {2, 9}, {2, 4}, {0, 9} })));
    }
}
