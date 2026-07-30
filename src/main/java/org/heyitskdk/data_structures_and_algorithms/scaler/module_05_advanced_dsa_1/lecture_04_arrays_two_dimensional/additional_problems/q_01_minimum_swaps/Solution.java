package org.heyitskdk.data_structures_and_algorithms.scaler.module_05_advanced_dsa_1.lecture_04_arrays_two_dimensional.additional_problems.q_01_minimum_swaps;

public class Solution {
    public int solve(int[] A, int B) {
        int n = A.length;
        int window = countNums(A, B);

        int badNums = 0;
        for (int i = 0; i < window; i++) {
            if(A[i] > B) {
                badNums++;
            }
        }

        int minSwaps = badNums;
        int l = 0, r = window;
        while (r < n) {
            if (A[l] > B) {
                badNums--;
            }
            if (A[r] > B) {
                badNums++;
            }
            minSwaps = Math.min(badNums, minSwaps);
            l++;
            r++;
        }

        return minSwaps;
    }

    private int countNums(int[] A, int B) {
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] <= B) {
                count++;
            }
        }
        return count;
    }
}
