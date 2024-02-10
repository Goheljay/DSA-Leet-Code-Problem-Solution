package com.jay.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IBMQuestion {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(List.of(1, 5, 9, 2, 4, 7));
        int target = 9;
        Long mediaMatchTarget = findMediaMatchTarget(integers, target);
        System.out.println(mediaMatchTarget);

    }

    static Long findMediaMatchTarget(List<Integer> data, int target) {
        Collections.sort(data);
        int start = 0;
        int end = data.size() - 1;
        int mid = 0;
        while (start <= end) {
            mid = (end + start) / 2;

            if (data.get(mid) < target) {
                start = mid + 1;
            } else if (data.get(mid) > target) {
                end = mid - 1;
            }
            else  {
                return (long)mid;
            }
        }
        return (long)mid;
    }
}
