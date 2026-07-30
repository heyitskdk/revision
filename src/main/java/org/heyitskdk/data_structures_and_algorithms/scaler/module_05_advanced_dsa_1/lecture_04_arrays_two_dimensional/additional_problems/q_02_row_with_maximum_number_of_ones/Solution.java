package org.heyitskdk.data_structures_and_algorithms.scaler.module_05_advanced_dsa_1.lecture_04_arrays_two_dimensional.additional_problems.q_02_row_with_maximum_number_of_ones;

public class Solution {
    public int solve(int[][] A) {
        int n = A.length;
        int m = A[0].length;
        int i = 0;
        int j = m - 1;

        int answer = 0;
        while (i < n && j >= 0) {
            if (A[i][j] == 1) {
                answer = i;
                j--;
            } else {
                i++;
            }
        }

        return answer;
    }
}
