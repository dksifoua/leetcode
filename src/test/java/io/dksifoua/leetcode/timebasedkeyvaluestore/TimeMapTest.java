package io.dksifoua.leetcode.timebasedkeyvaluestore;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TimeMapTest {

    @Test
    void test1() {
        TimeMap timeMap = new TimeMap();
        timeMap.set("foo", "bar", 1);
        Assertions.assertEquals("bar", timeMap.get("foo", 1));
        Assertions.assertEquals("bar", timeMap.get("foo", 3));

        timeMap.set("foo", "bar2", 4);
        Assertions.assertEquals("bar2", timeMap.get("foo", 4));
        Assertions.assertEquals("bar2", timeMap.get("foo", 5));
    }

    @Test
    void test2() {
        TimeMap timeMap = new TimeMap();
        timeMap.set("love", "high", 10);
        timeMap.set("love", "low", 20);
        Assertions.assertEquals("", timeMap.get("love", 5));
        Assertions.assertEquals("high", timeMap.get("love", 10));
        Assertions.assertEquals("high", timeMap.get("love", 15));
        Assertions.assertEquals("low", timeMap.get("love", 20));
        Assertions.assertEquals("low", timeMap.get("love", 25));
    }
}
