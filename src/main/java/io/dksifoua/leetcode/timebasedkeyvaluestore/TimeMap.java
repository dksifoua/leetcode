package io.dksifoua.leetcode.timebasedkeyvaluestore;

import java.util.*;

public class TimeMap {

    private record ValueTimestampTuple(String value, int timestamp) {
    }

    private final Map<String, List<ValueTimestampTuple>> data;

    public TimeMap() {
        this.data = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        if (!this.data.containsKey(key)) {
            this.data.put(key, new ArrayList<>());
        }
        this.data.get(key).add(new ValueTimestampTuple(value, timestamp));
    }

    public String get(String key, int timestamp) {
        if (!this.data.containsKey(key)) {
            return "";
        }

        int leftIndex = 0, rightIndex = this.data.get(key).size() - 1;
        if (this.data.get(key).get(leftIndex).timestamp() > timestamp) {
            return "";
        }
        if (this.data.get(key).get(rightIndex).timestamp() <= timestamp) {
            return this.data.get(key).get(rightIndex).value();
        }

        int foundIndex = leftIndex;
        while (leftIndex <= rightIndex) {
            int middleIndex = (leftIndex + rightIndex) / 2;
            if (this.data.get(key).get(middleIndex).timestamp() <= timestamp) {
                foundIndex = middleIndex;
                leftIndex = middleIndex + 1;
            } else {
                rightIndex = middleIndex - 1;
            }
        }

        return this.data.get(key).get(foundIndex).value();
    }
}
