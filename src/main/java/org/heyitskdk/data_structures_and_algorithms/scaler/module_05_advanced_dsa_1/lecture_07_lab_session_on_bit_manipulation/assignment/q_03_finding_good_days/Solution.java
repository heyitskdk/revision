package org.heyitskdk.data_structures_and_algorithms.scaler.module_05_advanced_dsa_1.lecture_07_lab_session_on_bit_manipulation.assignment.q_03_finding_good_days;

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int singleNumber(final int[] A) {
        int num = 0;
        for (int i = 0; i < 32; i++) {
            int setBits = 0;
            for (int j = 0; j < A.length; j++) {
                if ((A[j] & (1 << i)) > 0) {
                    setBits++;
                }
            }
            if ((setBits % 3) == 1) {
                num |= (1 << i);
            }
        }
        return num;
    }
}
