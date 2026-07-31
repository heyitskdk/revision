package org.heyitskdk.data_structures_and_algorithms.scaler.module_05_advanced_dsa_1.lecture_05_lab_session_on_arrays.assignment.q_02_spiral_order_matrix_ii;

public class Solution {
    public static int[][] generateMatrix(int A) {
        int[][] arr = new int[A][A];
        int num = 1;

        int i = 0, j = 0;
        while (A > 1) {
            // 1st traversal: col-wise rightward
            for (int k = 0; k < A - 1; k++) {
                arr[i][j] = num;
                num++;
                j++;
            }

            // 2nd traversal: row-wise downward
            for (int k = 0; k < A - 1; k++) {
                arr[i][j] = num;
                num++;
                i++;
            }

            // 3rd traversal: col-wise leftward
            for (int k = 0; k < A - 1; k++) {
                arr[i][j] = num;
                num++;
                j--;
            }

            // 4th traversal: row-wise upward
            for (int k = 0; k < A - 1; k++) {
                arr[i][j] = num;
                num++;
                i--;
            }

            // movement to inner circle
            i++;
            j++;
            A -= 2;
        }

        // if A was oddd
        if ( A == 1) {
            arr[i][j] = num;
        }

        return arr;
    }
}
