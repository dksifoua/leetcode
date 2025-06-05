package io.dksifoua.leetcode.kclosestpointstoorigin;

import java.util.PriorityQueue;
import java.util.Queue;

public class Solution {

    public int[][] kClosest(int[][] points, int k) {
        Queue<int[]> maxHeap = new PriorityQueue<>((int[] p1, int[] p2) -> Integer.compare(distance(p2), distance(p1)));
        for (int[] point: points) {
            maxHeap.add(point);

            if (maxHeap.size() > k) maxHeap.poll();
        }

        int[][] kClosestPoints = new int[k][];
        for (int i = 0; i < k; i ++) kClosestPoints[i] = maxHeap.poll();

        return kClosestPoints;
    }

    private int distance(int[] point) {
        return point[0] * point[0] + point[1] * point[1];
    }
}
