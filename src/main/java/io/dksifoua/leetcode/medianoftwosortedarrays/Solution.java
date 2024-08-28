package io.dksifoua.leetcode.medianoftwosortedarrays;

public class Solution {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return this.findMedianSortedArrays(nums2, nums1);
        }

        double median = 0d;
        int totalLength = nums1.length + nums2.length;
        int partitionSize = totalLength % 2 == 0 ? totalLength / 2 : 1 + totalLength / 2;
        int leftIndex = 0, rightIndex = nums1.length - 1;
        while (true) {
            int middleIndex1 = Math.floorDiv(leftIndex + rightIndex, 2);
            int middleIndex2 = partitionSize - (middleIndex1 + 1) - 1;

            int leftElement1 = middleIndex1 >= 0 ? nums1[middleIndex1] : Integer.MIN_VALUE;
            int leftElement2 = middleIndex2 >= 0 ? nums2[middleIndex2] : Integer.MIN_VALUE;
            int rightElement1 = middleIndex1 + 1 < nums1.length ? nums1[middleIndex1 + 1] : Integer.MAX_VALUE;
            int rightElement2 = middleIndex2 + 1 < nums2.length ? nums2[middleIndex2 + 1] : Integer.MAX_VALUE;

            if (leftElement1 <= rightElement2 && leftElement2 <= rightElement1) {
                if (totalLength % 2 > 0) {
                    median = Math.max(leftElement1, leftElement2);
                } else {
                    median = (Math.max(leftElement1, leftElement2) + Math.min(rightElement1, rightElement2)) / 2d;
                }
                break;
            }

            if (leftElement1 > rightElement2) {
                rightIndex = middleIndex1 - 1;
            } else {
                leftIndex = middleIndex1 + 1;
            }
        }

        return median;
    }
}
