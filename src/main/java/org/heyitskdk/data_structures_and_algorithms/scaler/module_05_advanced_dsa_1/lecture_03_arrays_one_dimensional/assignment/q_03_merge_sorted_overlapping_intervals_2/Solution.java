package org.heyitskdk.data_structures_and_algorithms.scaler.module_05_advanced_dsa_1.lecture_03_arrays_one_dimensional.assignment.q_03_merge_sorted_overlapping_intervals_2;

import java.util.ArrayList;

public class Solution {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {
        int n = A.size();
        ArrayList <ArrayList<Integer>> answer = new ArrayList<>();
        int l = A.get(0).get(0);
        int r = A.get(0).get(1);

        for (int i = 1; i < n; i++) {
            int si = A.get(i).get(0);
            int ei = A.get(i).get(1);

            if (si <= r) {
                r = Math.max(r, ei);
            } else {
                ArrayList<Integer> interval = new ArrayList<>();
                interval.add(l);
                interval.add(r);
                answer.add(interval);

                // reset
                l = si;
                r = ei;
            }
        }

        // add final interval
        ArrayList<Integer> interval = new ArrayList<>();
        interval.add(l);
        interval.add(r);
        answer.add(interval);

        return answer;
    }
}
