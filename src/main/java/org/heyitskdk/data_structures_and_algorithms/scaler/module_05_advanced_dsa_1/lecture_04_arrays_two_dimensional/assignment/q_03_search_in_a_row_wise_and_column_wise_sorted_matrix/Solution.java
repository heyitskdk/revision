package org.heyitskdk.data_structures_and_algorithms.scaler.module_05_advanced_dsa_1.lecture_04_arrays_two_dimensional.assignment.q_03_search_in_a_row_wise_and_column_wise_sorted_matrix;

public class Solution {
    public int solve(int[][] A, int B) {
        int n = A.length;
        int m = A[0].length;
        
        // top-right corner
        int i = 0, j = m - 1;
        int answer = Integer.MAX_VALUE;
        while (i < n && j >= 0) {
            if (B == A[i][j]) {
                int position = 1009 * (i + 1) + (j + 1);
                answer = Math.min(answer, position);
                j--;
            } else if (B > A[i][j]) {
                i++;
            } else {
                j--;
            }
        }

        return answer != Integer.MAX_VALUE ? answer : -1;
    }
}
