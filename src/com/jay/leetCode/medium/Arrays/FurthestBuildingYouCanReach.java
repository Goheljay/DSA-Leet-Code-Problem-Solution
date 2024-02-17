package com.jay.leetCode.medium.Arrays;

import java.util.PriorityQueue;

public class FurthestBuildingYouCanReach {
    public static void main(String[] args) {
        int [] arr = {1,5,1,2,3,4,10000};
        int bricks = 4;
        int ladders = 1;

        int i = furthestBuildingPhase2(arr, bricks, ladders);
        System.out.println(i);

    }
    public static int furthestBuilding(int[] h, int bricks, int ladders) {

        int i = 0;

        while (i < h.length-1) {
            if (h[i] > h[i+1]) {
                i++;
            } else {
                int requiredBricks = h[i+1] - h[i];
                if (bricks >= requiredBricks) {
                    bricks = bricks - requiredBricks;
                    i++;
                } else if (ladders != 0) {
                    ladders -=1;
                    i++;
                } else {
                    return i;
                }
            }
        }
        return i;
    }

    public static int furthestBuildingPhase2(int[] h, int bricks, int ladders) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i< h.length-1; i++) {

            int requiredBricks = h[i+1]-h[i];
            if (requiredBricks > 0) {
                pq.add(requiredBricks);
            }
            if (pq.size() > ladders) {
                bricks -= pq.poll();
            }
            if (bricks < 0){
                return i;
            }

        }
        return h.length-1;
    }
}
