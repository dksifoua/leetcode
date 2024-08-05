package io.dksifoua.leetcode.searcha2dmatrix;

public class Solution {

    public boolean searchMatrix(int[][] matrix, int target) {
        int leftIndex = 0, rightIndex = matrix.length * matrix[0].length - 1;
        while (leftIndex <= rightIndex) {
            int middleIndex = (leftIndex + rightIndex) / 2;

            int row = middleIndex / matrix[0].length;
            int col = middleIndex % matrix[0].length;

            if (matrix[row][col] == target) {
                return true;
            }

            if (matrix[row][col] < target) {
                leftIndex = middleIndex + 1;
            } else {
                rightIndex = middleIndex - 1;
            }
        }

        return false;
    }
}
