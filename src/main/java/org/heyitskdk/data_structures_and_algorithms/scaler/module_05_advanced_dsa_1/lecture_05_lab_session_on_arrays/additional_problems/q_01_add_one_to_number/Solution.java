package org.heyitskdk.data_structures_and_algorithms.scaler.module_05_advanced_dsa_1.lecture_05_lab_session_on_arrays.additional_problems.q_01_add_one_to_number;

import java.util.Arrays;

public class Solution {
    public static int[] plusOne(int[] A) {
        int n = A.length;

        int leadingZeroes = countLeadingZeroes(A);
        // edge case
        if (leadingZeroes == n) {
            return new int[]{1};
        }
        
        int nineDigits = countNines(A);
        // edge case
        if (n - leadingZeroes == nineDigits) {
            int[] answer = new int[n - leadingZeroes + 1];
            answer[0] = 1;
            return answer;
        }

        int m = n - leadingZeroes;
        int[] answer = new int[m];
        
        int sum = A[n - 1] + 1;
        int digit = sum % 10;
        int carry = sum / 10;

        answer[m - 1] = digit;
        int index = m - 2;
        int i = n - 2;
        
        while (index >= 0) {
            sum = A[i] + carry;
            carry = sum / 10;
            answer[index] = sum % 10;

            index--;
            i--;
        }

        return answer;
    }

    private static int countNines(int[] A) {
        int count = 0;
        for (int num: A) {
            if (num == 9) {
                count++;
            }
        }
        return count;
    }

    private static int countLeadingZeroes(int[] A) {
        int n = A.length;
        int count = 0;
        int i = 0;
        while (i < n && A[i] == 0) {
            if (A[i] == 0) {
                count++;
            }
            i++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[] { 0, 3, 7, 6, 4, 0, 5, 5, 5 })));
    }
}
