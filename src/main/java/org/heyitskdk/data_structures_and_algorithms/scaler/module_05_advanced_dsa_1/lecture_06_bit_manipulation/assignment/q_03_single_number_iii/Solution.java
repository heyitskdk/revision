package org.heyitskdk.data_structures_and_algorithms.scaler.module_05_advanced_dsa_1.lecture_06_bit_manipulation.assignment.q_03_single_number_iii;

public class Solution {
    public int[] solve(int[] A) {
        // optimised solulu
        int bitwiseXOR = getBitwiseXOR(A);

        int mask = bitwiseXOR & -bitwiseXOR;

        int a = 0, b = 0;
        for (int num: A) {
            if ((num & mask) > 0) {
                a ^= num;
            } else {
                b ^= num;
            }
        }

        return a < b ? new int[] {a, b} : new int[] {b, a};
    }

    private int getBitwiseXOR(int[] A) {
        int bitwiseXOR = 0;
        for (int num: A) {
            bitwiseXOR ^= num;
        }
        return bitwiseXOR;
    }
}
