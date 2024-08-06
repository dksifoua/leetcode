package io.dksifoua.leetcode.findminimuminrotatedsortedarray;

public class Solution {

    public int findMin(int[] nums) {
        int leftIndex = 0, rightIndex = nums.length - 1;
        while (leftIndex <= rightIndex) {
            if (nums[leftIndex] <= nums[rightIndex]) {
                break;
            }

            int middleIndex = (leftIndex + rightIndex) / 2;
            if (nums[middleIndex] > nums[rightIndex]) {
                leftIndex = middleIndex + 1;
            } else {
                rightIndex = middleIndex;
            }
        }

        return nums[leftIndex];
    }
}
