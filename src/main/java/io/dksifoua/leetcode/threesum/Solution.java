package io.dksifoua.leetcode.threesum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i ++) {
            if (i - 1 >= 0 && nums[i - 1] == nums[i]) continue;

            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum < 0) {
                    left += 1;
                } else if (sum > 0) {
                    right -= 1;
                } else {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    do {
                        left += 1;
                    } while (left < right && nums[left - 1] == nums[left]);
                }
            }
        }

        return result;
    }
}
