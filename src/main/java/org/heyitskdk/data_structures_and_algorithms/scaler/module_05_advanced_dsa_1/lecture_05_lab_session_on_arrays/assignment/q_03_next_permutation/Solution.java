package org.heyitskdk.data_structures_and_algorithms.scaler.module_05_advanced_dsa_1.lecture_05_lab_session_on_arrays.assignment.q_03_next_permutation;

public class Solution {
    public int[] nextPermutation(int[] A) {
        int n = A.length;
        int index = -1;
        
        for (int i = n - 2; i >= 0; i--) {
            if (A[i] < A[i + 1]) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            reverse(A, 0, n - 1);
            return A;
        }

        // find the element to swap
        for (int i = n - 1; i > index; i--) {
            if (A[i] > A[index]) {
                int temp = A[index];
                A[index] = A[i];
                A[i] = temp;
                break;
            }
        }

        // sort end range elements
        reverse(A, index + 1, n - 1);

        return A;
        
    }

    private void reverse(int[] A, int l, int r) {
        while (l < r) {
            int temp = A[l];
            A[l] = A[r];
            A[r] = temp;
            l++;
            r--;
        }
    }
}
