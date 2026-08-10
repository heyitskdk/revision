package org.heyitskdk.data_structures_and_algorithms.scaler.module_05_advanced_dsa_1.lecture_06_bit_manipulation.assignment.q_01_number_of_1_bits;

public class Solution {
    public int numSetBits(int A) {
        // revising brian kernighan's algorithm
        int oneBits = 0;
        while (A > 0) {
            A = A & (A - 1);
            oneBits++;
        }
        return oneBits;
    }
}
