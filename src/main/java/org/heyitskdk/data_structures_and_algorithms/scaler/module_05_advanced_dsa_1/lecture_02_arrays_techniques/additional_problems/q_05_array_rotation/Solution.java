package org.heyitskdk.data_structures_and_algorithms.scaler.module_05_advanced_dsa_1.lecture_02_arrays_techniques.additional_problems.q_05_array_rotation;

public class Solution {
    public int[] solve(int[] A, int B) {
        int n = A.length;
        B %= n;
        
        reverse(A, 0, n - 1);
        reverse(A, 0, B - 1);
        reverse(A, B, n - 1);

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
