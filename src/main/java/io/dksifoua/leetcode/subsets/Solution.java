package io.dksifoua.leetcode.subsets;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.*;

public class Solution {

    public List<List<Integer>> subsets(int[] nums) {
        Deque<Tuple> queue = new ArrayDeque<>() {{
            add(new Tuple(Collections.emptyList(), 0));
        }};
        int subsetLength = (int) Math.pow(2, nums.length);
        while (queue.size() < subsetLength) {
            Tuple tuple = queue.removeFirst();


            List<Integer> subset1 = new ArrayList<>(tuple.getSubset());
            List<Integer> subset2 = new ArrayList<>(tuple.getSubset()) {{ add(nums[tuple.getIndex()]); }};

            queue.addLast(new Tuple(subset1, tuple.getIndex() + 1));
            queue.addLast(new Tuple(subset2, tuple.getIndex() + 1));
        }

        return queue.stream().map(Tuple::getSubset).toList();
    }

    @Getter
    @Setter
    @AllArgsConstructor
    private static class Tuple {
        private List<Integer> subset;
        private int index;
    }
}
