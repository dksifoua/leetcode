package io.dksifoua.leetcode.productofarrayexceptself;

public class Solution {

    public int[] productExceptSelf(int[] nums) {
        int[] prefixes = new int[nums.length];
        int[] postfixes = new int[nums.length];
        int[] result = new int[nums.length];

        prefixes[0] = 1;
        postfixes[nums.length - 1] = 1;
        for (int i = 1, j = nums.length - 2; i < nums.length && j >= 0; i++, j--) {
            prefixes[i] = prefixes[i - 1] * nums[i - 1];
            postfixes[j] = postfixes[j + 1] * nums[j + 1];
        }

        for (int i = 0; i < nums.length; i++) {
            result[i] = prefixes[i] * postfixes[i];
        }

        return result;
    }

    public int[] productExceptSelfWithExtraSpaceComplexity(int[] nums) {
        int[] result = new int[nums.length];

        result[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        int postfix = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i < nums.length - 1) {
                postfix *= nums[i + 1];
            }
            result[i] *= postfix;
        }

        return result;
    }
}
