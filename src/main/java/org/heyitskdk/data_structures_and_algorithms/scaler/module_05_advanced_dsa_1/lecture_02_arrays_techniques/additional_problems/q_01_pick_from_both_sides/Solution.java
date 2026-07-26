package org.heyitskdk.data_structures_and_algorithms.scaler.module_05_advanced_dsa_1.lecture_02_arrays_techniques.additional_problems.q_01_pick_from_both_sides;

public class Solution {
    public int solve(int[] A, int B) {
        int n = A.length;
        int sum = windowSum(A, B);
        int l = B - 1;
        int r = n - 1;

        int max = sum;
        while (l >= 0) {
            sum += A[r] - A[l];
            max = Math.max(sum, max);
            l--;
            r--;
        }

        return max;
    }

    private static int windowSum(int[] A, int B) {
        int sum = 0;
        for (int i = 0; i < B; i++) {
            sum += A[i];
        }
        return sum;
    }
}
