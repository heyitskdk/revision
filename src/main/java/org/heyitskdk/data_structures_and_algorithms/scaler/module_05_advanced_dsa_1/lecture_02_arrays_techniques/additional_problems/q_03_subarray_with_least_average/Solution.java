package org.heyitskdk.data_structures_and_algorithms.scaler.module_05_advanced_dsa_1.lecture_02_arrays_techniques.additional_problems.q_03_subarray_with_least_average;

public class Solution {
    public int solve(int[] A, int B) {
        int n = A.length;
        long sum = buildSum(A, B);
        long minSum = sum;
        int answer = 0;

        int l = 0, r = B;
        while (r < n) {
            sum += A[r] - A[l];
            if (sum < minSum) {
                minSum = sum;
                answer = l + 1;
            }
            l++;
            r++;
        }

        return answer;
    }

    private long buildSum(int[] A, int B) {
        long sum = 0;
        for (int i = 0; i < B; i++) {
            sum += A[i];
        }
        return sum;
    }
}
