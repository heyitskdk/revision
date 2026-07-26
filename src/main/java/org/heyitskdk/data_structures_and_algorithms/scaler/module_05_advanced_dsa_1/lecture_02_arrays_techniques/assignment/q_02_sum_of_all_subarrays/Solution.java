package org.heyitskdk.data_structures_and_algorithms.scaler.module_05_advanced_dsa_1.lecture_02_arrays_techniques.assignment.q_02_sum_of_all_subarrays;

public class Solution {
    public long subarraySum(int[] A) {
        int n = A.length;
        long sum = 0;

        for (int i = 0; i < n; i++) {
            sum += (long)A[i] * (n - i) * (i + 1);
        }

        return sum;
    }
}
