package org.heyitskdk.data_structures_and_algorithms.scaler.module_05_advanced_dsa_1.lecture_04_arrays_two_dimensional.assignment.q_01_first_missing_integer;

public class Solution {
    public int firstMissingPositive(int[] A) {
        int n = A.length;
        int i = 0;
        while (i < n) {
            while (A[i] > 0 && A[i] <= n && A[i] != i + 1 && A[i] != A[A[i] - 1]) {
                int targetIndex = A[i] - 1;
                int temp = A[i];
                A[i] = A[targetIndex];
                A[targetIndex] = temp;
            }
            i++;
        }

        for (i = 0; i < n; i++) {
            if (A[i] != i + 1) return i + 1;
        }

        return n + 1;
    }
}
