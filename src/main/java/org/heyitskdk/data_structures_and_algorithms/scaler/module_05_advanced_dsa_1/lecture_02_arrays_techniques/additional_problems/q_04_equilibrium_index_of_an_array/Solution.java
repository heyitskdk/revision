package org.heyitskdk.data_structures_and_algorithms.scaler.module_05_advanced_dsa_1.lecture_02_arrays_techniques.additional_problems.q_04_equilibrium_index_of_an_array;

public class Solution {
    public int solve(int[] A) {
        int sum = totalSum(A);
        int leftSum = 0;
        for (int i = 0; i < A.length; i++) {
            int rightSum = sum - A[i] - leftSum;
            if (leftSum == rightSum) return i;
            leftSum += A[i];
        }
        return -1;
    }

    private int totalSum(int[] A) {
        int sum = 0;
        for (int ele: A) sum += ele;
        return sum;
    }
}
