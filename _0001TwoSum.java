import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/two-sum/">Two Sum</a>
 */
public class _0001TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> memory = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int left = nums[i];
            int right = target - nums[i];
            if(memory.containsKey(right)) {
                return new int[] { i, memory.get(right) };
            } else {
                memory.put(left, i);
            }
        }
        throw new IllegalArgumentException("No two elements add up to the target");
    }
}
