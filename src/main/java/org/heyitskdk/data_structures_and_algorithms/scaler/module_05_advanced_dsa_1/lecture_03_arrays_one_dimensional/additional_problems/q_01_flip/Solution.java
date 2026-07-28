package org.heyitskdk.data_structures_and_algorithms.scaler.module_05_advanced_dsa_1.lecture_03_arrays_one_dimensional.additional_problems.q_01_flip;

public class Solution {
    public int[] flip(String A) {
        int n = A.length();
        char[] letter = A.toCharArray();
        int sum = 0;
        int answer = sum;

        int si = -1, ei = -1, l = 0;
        for (int i = 0; i < n; i++) {
            if (letter[i] == '0') {
                sum++;
            } else {
                sum--;
            }

            if (sum > answer) {
                answer = sum;
                si = l;
                ei = i;
            } else if (sum < 0) {
                sum = 0;
                l = i + 1;
            }
        }

        return si == -1 ? new int[] {} : new int[] { si + 1, ei + 1 };
    }
}
