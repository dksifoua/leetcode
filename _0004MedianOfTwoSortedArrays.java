import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class _0004MedianOfTwoSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median = 0;

        int len1 = nums1.length, len2 = nums2.length;
        int mid = (len1 + len2) / 2, mod = (len1 + len2) % 2;

        int position1 = mod == 0 ? mid - 1 : mid, position2 = mid;

        int counter = 0, i = 0, j = 0;
        while(counter <= position2) {
            int num1 = i < len1 ? nums1[i] : Integer.MAX_VALUE;
            int num2 = j < len2 ? nums2[j] : Integer.MAX_VALUE;

            if(counter == position1 || counter == position2) median += Integer.min(num1, num2);

            if(num1 < num2) i += 1;
            else j += 1;

            counter += 1;
        }

        median = position1 == position2 ? median : median / 2;

        return median;
    }
}
