package org.heyitskdk.data_structures_and_algorithms.scaler.module_05_advanced_dsa_1.lecture_05_lab_session_on_arrays.assignment.q_01_rain_water_trapped;

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int trap(final int[] A) {
        int[] leftMax = leftMaxHeight(A);
        int[] rightMax = rightMaxHeight(A);
        int rainWater = 0;

        for (int i = 1; i < A.length; i++) {
            int water = Math.min(leftMax[i], rightMax[i]) - A[i];
            if (water > 0) {
                rainWater += water;
            }
        }

        return rainWater;
    }

    private int[] leftMaxHeight(int[] A) {
        int n = A.length;
        int[] leftMax = new int[n];
        leftMax[0] = A[0];

        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(A[i], leftMax[i - 1]);
        }

        return leftMax;
    }

    private int[] rightMaxHeight(int[] A) {
        int n = A.length;
        int[] rightMax = new int[n];
        rightMax[n - 1] = A[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(A[i], rightMax[i + 1]);
        }

        return rightMax;
    }
}
