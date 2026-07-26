package org.heyitskdk.data_structures_and_algorithms.scaler.module_05_advanced_dsa_1.lecture_02_arrays_techniques.assignment.q_04_subarray_with_given_sum_and_length;

public class Solution {
    public static int solve(int[] A, int B, int C) {
        int n = A.length;
        // edge case
        if (B > n) return 0;

        int sum = 0;
        for (int i = 0; i < B; i++) {
            sum += A[i];
        }

        if (B == n && sum == C) return 1;

        int l = 0, r = B - 1;
        while (r + 1 < n) {
            sum += (A[r + 1] - A[l]);
            if (sum == C) return 1;
            l++;
            r++;
        }

        return 0;
    }

    public static void main(String[] args) {
        System.out.println(solve(new int[] {6}, 1, 6));
    }
}
