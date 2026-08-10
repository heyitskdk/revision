package org.heyitskdk.data_structures_and_algorithms.scaler.module_05_advanced_dsa_1.lecture_06_bit_manipulation.assignment.q_04_unset_ith_bit;

public class Solution {
    public int solve(int A, int B) {
        int mask = 1 << B;
        if ((A & mask) > 0) {
            // toggle set-bit and unset it
            A ^= mask;
        }
        return A;
    }
}
