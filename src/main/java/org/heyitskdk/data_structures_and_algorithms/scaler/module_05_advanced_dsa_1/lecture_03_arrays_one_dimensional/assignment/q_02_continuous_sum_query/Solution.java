package org.heyitskdk.data_structures_and_algorithms.scaler.module_05_advanced_dsa_1.lecture_03_arrays_one_dimensional.assignment.q_02_continuous_sum_query;

public class Solution {
    public int[] solve(int A, int[][] B) {
        int[] pot = new int[A];
        int n = B.length;

        for (int i = 0; i < n; i++) {
            int l = B[i][0] - 1;
            int r = B[i][1] - 1;
            int money = B[i][2];

            pot[l] += money;
            if (r < A - 1) {
                pot[r + 1] -= money;
            }
        }

        finalAmount(pot);
        return pot;
    }

    private void finalAmount(int[] pot) {
        for (int i = 1; i < pot.length; i++) {
            pot[i] += pot[i - 1];
        }
    }
}
