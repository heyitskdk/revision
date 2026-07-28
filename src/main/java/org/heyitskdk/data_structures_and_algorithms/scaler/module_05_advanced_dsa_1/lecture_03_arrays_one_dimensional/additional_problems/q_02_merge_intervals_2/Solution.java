package org.heyitskdk.data_structures_and_algorithms.scaler.module_05_advanced_dsa_1.lecture_03_arrays_one_dimensional.additional_problems.q_02_merge_intervals_2;

import java.util.ArrayList;

public class Solution {
    public ArrayList<ArrayList<Integer>> insert(ArrayList<ArrayList<Integer>> A, ArrayList<Integer> B) {
        int n = A.size();
        ArrayList<ArrayList<Integer>> answer = new ArrayList<>();

        int si = B.get(0);
        int ei = B.get(1);

        int index = -1;
        for (int i = 0; i < n; i++) {
            if (A.get(i).get(1) < si) {
                addInterval(answer, A.get(i).get(0), A.get(i).get(1));
            } else {
                index = i;
                break;
            }
        }

        if (index == -1) {
            addInterval(answer, si, ei);
            return answer;
        }

        for (int i = index; i < n; i++) {
            int l = A.get(i).get(0);
            int r = A.get(i).get(1);

            // check overlap
            if (l <= ei && r >= si) {
                si = Math.min(l, si);
                ei = Math.max(r, ei);
            } else {
                addInterval(answer, si, ei);
                si = l;
                ei = r;
            }
        }

        // add last interval
        addInterval(answer, si, ei);

        return answer;
    }

    private void addInterval(ArrayList<ArrayList<Integer>> answer, int l, int r) {
        ArrayList<Integer> interval = new ArrayList<>();
        interval.add(l);
        interval.add(r);
        answer.add(interval);
    }
}
