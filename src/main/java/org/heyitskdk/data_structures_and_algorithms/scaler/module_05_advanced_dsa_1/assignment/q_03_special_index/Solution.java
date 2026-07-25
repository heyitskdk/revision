package org.heyitskdk.data_structures_and_algorithms.scaler.module_05_advanced_dsa_1.assignment.q_03_special_index;

public class Solution {
    public int solve(int[] A) {
        int n = A.length;
        long[] oddSum = oddPrefix(A);
        long[] evenSum = evenPrefix(A);
        
        int count = 0;

        // checking at index '0'
        if (evenSum[n - 1] - evenSum[0] == oddSum[n - 1]) {
            count++;
        }

        for (int i = 1; i < n; i++) {
            long sumOfEvens = evenSum[i - 1] + (oddSum[n - 1] - oddSum[i]);
            long sumOfOdds = oddSum[i - 1] + (evenSum[n - 1] - evenSum[i]);

            if (sumOfEvens == sumOfOdds) {
                count++;
            }
        }

        return count;
    }

    private static long[] oddPrefix(int[] A) {
        int n = A.length;
        long[] oddSum = new long[n];
        oddSum[0] = 0;

        for (int i = 1; i < n; i++) {
            if (i % 2 == 1) {
                oddSum[i] = oddSum[i - 1] + A[i];
            } else {
                oddSum[i] = oddSum[ i - 1];
            }
        }
        
        return oddSum;
    }

    private static long[] evenPrefix(int[] A) {
        int n = A.length;
        long[] evenSum = new long[n];
        evenSum[0] = A[0];

        for (int i = 1; i < n; i++) {
            if (i % 2 == 0) {
                evenSum[i] = evenSum[i - 1] + A[i];
            } else {
                evenSum[i] = evenSum[i - 1];
            }
        }

        return evenSum;
    }
}
