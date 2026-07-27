package org.heyitskdk.data_structures_and_algorithms.scaler.module_05_advanced_dsa_1.lecture_03_arrays_one_dimensional.assignment.q_01_max_sum_contiguous_subarray;

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int maxSubArray(final int[] A) {
        int n = A.length;
        
        int sum = 0;
        int answer = Integer.MIN_VALUE;
        
        for (int i = 0; i < n; i++) {
            sum += A[i];
            answer = Math.max(answer, sum);
            if (sum < 0) sum = 0;
        }

        return answer;
    }
}
