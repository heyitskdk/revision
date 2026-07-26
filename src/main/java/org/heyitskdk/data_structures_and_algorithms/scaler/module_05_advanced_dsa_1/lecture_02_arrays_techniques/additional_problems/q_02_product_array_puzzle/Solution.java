package org.heyitskdk.data_structures_and_algorithms.scaler.module_05_advanced_dsa_1.lecture_02_arrays_techniques.additional_problems.q_02_product_array_puzzle;

public class Solution {
    public int[] solve(int[] A) {
        int n = A.length;
        int[] prefix = buildPrefixProduct(A);
        int[] suffix = buildSuffixProduct(A);
        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {
            int prefixProduct = i > 0 ? prefix[i - 1] : 1;
            int suffixProduct = i < n - 1 ? suffix[i + 1] : 1;
            answer[i] = prefixProduct * suffixProduct;
        }

        return answer;
    }

    private int[] buildPrefixProduct(int[] A) {
        int n = A.length;
        int[] prefix = new int[n];
        prefix[0] = A[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] * A[i];
        }

        return prefix;
    }

    private int[] buildSuffixProduct(int[] A) {
        int n = A.length;
        int[] suffix = new int[n];
        suffix[n - 1] = A[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] * A[i];
        }

        return suffix;
    }
}
