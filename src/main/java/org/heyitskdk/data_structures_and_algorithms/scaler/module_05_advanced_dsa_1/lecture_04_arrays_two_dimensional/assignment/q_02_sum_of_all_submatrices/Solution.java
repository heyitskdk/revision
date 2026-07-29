package org.heyitskdk.data_structures_and_algorithms.scaler.module_05_advanced_dsa_1.lecture_04_arrays_two_dimensional.assignment.q_02_sum_of_all_submatrices;

public class Solution {
    public int solve(int[][] A) {
        int n = A.length;
        int m = A[0].length;

        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sum += (((i + 1) * (j + 1)) * ((n - i) * (m - j))) * A[i][j];
            }
        }

        return sum;
    }
}
