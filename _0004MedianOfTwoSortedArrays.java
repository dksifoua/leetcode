import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/median-of-two-sorted-arrays/">...</a>
 */
public class _0004MedianOfTwoSortedArrays {

    /**
     * Time complexity: O(log(min(m,n)))
     * Space complexity: O(1)
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public double findMedianSortedArraysOptimal(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) return findMedianSortedArraysOptimal(nums2, nums1);

        int x = nums1.length, y = nums2.length;
        int low = 0, high = x;
        while (low <= high) {
            int partitionX = (low + high) / 2;
            int partitionY = (x + y + 1) / 2 - partitionX;

            int minX = partitionX >= 1 ? nums1[partitionX - 1] : Integer.MIN_VALUE;
            int minY = partitionY >= 1 ? nums2[partitionY - 1] : Integer.MIN_VALUE;

            int maxX = partitionX < nums1.length ? nums1[partitionX] : Integer.MAX_VALUE;
            int maxY = partitionY < nums2.length ? nums2[partitionY] : Integer.MAX_VALUE;

            if (minX > maxY) high = partitionX - 1;
            else if (maxX < minY) low = partitionX + 1;
            else return (x + y) % 2 == 1
                        ? Integer.max(minX, minY)
                        : (double) (Integer.max(minX, minY) + Integer.min(maxX, maxY)) / 2
                        ;
        }

        throw new IllegalArgumentException("There's no solution for the given inputs!");
    }

    /**
     * Time complexity: O(m+n)
     * Space complexity: O(1)
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public double findMedianSortedArraysBruteForce(int[] nums1, int[] nums2) {
        double median = 0;
        int position2 = (nums1.length + nums2.length) / 2;
        int position1 = (nums1.length + nums2.length) % 2 == 0 ? position2 - 1 : position2;

        int counter = 0, i = 0, j = 0;
        while (counter <= position2) {
            int num1 = i < nums1.length ? nums1[i] : Integer.MAX_VALUE;
            int num2 = j < nums2.length ? nums2[j] : Integer.MAX_VALUE;

            if (counter == position1 || counter == position2) median += Integer.min(num1, num2);

            if (num1 < num2) i += 1;
            else j += 1;

            counter += 1;
        }

        return position1 == position2 ? median : median / 2;
    }
}
