package io.dksifoua.leetcode.twosum2;

public class Solution {

    public int[] twoSum(int[] numbers, int target) {
        int leftIndex = 0, rightIndex = numbers.length - 1;
        while (leftIndex < rightIndex) {
            int sum = numbers[leftIndex] + numbers[rightIndex];
            if (sum < target) {
                leftIndex += 1;
            } else if (sum > target) {
                rightIndex -= 1;
            } else {
                return new int[] { leftIndex + 1, rightIndex + 1 };
            }
        }

        throw new IllegalArgumentException();
    }
}
