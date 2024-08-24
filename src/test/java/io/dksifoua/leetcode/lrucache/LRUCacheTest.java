package io.dksifoua.leetcode.lrucache;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class LRUCacheTest {

    private LRUCache cache;

    @BeforeEach
    void setUp() {
        cache = null;
    }

    @Test
    void test1() {
        String[] operations = { "LRUCache", "put", "put", "get", "put", "get", "put", "get", "get", "get" };
        int[][] inputs = { { 2, 0 }, { 1, 1 }, { 2, 2 }, { 1, 0 }, { 3, 3 }, { 2, 0 }, { 4, 4 }, { 1, 0 }, { 3, 0 },
                { 4, 0 } };
        Integer[] expectedOutputs = { null, null, null, 1, null, -1, null, -1, 3, 4 };

        for (int i = 0; i < operations.length; i++) {
            switch (operations[i]) {
                case "LRUCache":
                    cache = new LRUCache(inputs[i][0]);
                    assertNotNull(cache);
                case "put":
                    cache.put(inputs[i][0], inputs[i][1]);
                    break;
                case "get":
                    int result = cache.get(inputs[i][0]);
                    assertEquals(expectedOutputs[i], result);
                    break;
            }
        }
    }

    @Test
    void test2() {
        String[] operations = { "LRUCache", "put", "get", "put", "get", "get" };
        int[][] inputs = { { 1, 0 }, { 2, 1 }, { 2, 0 }, { 3, 2 }, { 2, 0 }, { 3, 0 } };
        Integer[] expectedOutputs = { null, null, 1, null, -1, 2 };

        for (int i = 0; i < operations.length; i++) {
            switch (operations[i]) {
                case "LRUCache":
                    cache = new LRUCache(inputs[i][0]);
                    assertNotNull(cache);
                case "put":
                    cache.put(inputs[i][0], inputs[i][1]);
                    break;
                case "get":
                    int result = cache.get(inputs[i][0]);
                    assertEquals(expectedOutputs[i], result);
                    break;
            }
        }
    }

    @Test
    void test3() {
        String[] operations = { "LRUCache", "put", "put", "get", "put", "put", "get" };
        int[][] inputs = { { 2, 0 }, { 2, 1 }, { 2, 2 }, { 2, 0 }, { 1, 1 }, { 4, 1 }, { 2, 0 } };
        Integer[] expectedOutputs = { null, null, null, 2, null, null, -1 };

        for (int i = 0; i < operations.length; i++) {
            switch (operations[i]) {
                case "LRUCache":
                    cache = new LRUCache(inputs[i][0]);
                    assertNotNull(cache);
                case "put":
                    cache.put(inputs[i][0], inputs[i][1]);
                    break;
                case "get":
                    int result = cache.get(inputs[i][0]);
                    assertEquals(expectedOutputs[i], result);
                    break;
            }
        }
    }

    @Test
    void test4() {
        String[] operations = { "LRUCache", "put", "put", "put", "put", "put", "get", "put", "get", "get", "put", "get",
                "put", "put", "put", "get", "put", "get", "get", "get", "get", "put", "put", "get", "get", "get", "put",
                "put", "get", "put", "get", "put", "get", "get", "get", "put", "put", "put", "get", "put", "get", "get",
                "put", "put", "get", "put", "put", "put", "put", "get", "put", "put", "get", "put", "put", "get", "put",
                "put", "put", "put", "put", "get", "put", "put", "get", "put", "get", "get", "get", "put", "get", "get",
                "put", "put", "put", "put", "get", "put", "put", "put", "put", "get", "get", "get", "put", "put", "put",
                "get", "put", "put", "put", "get", "put", "put", "put", "get", "get", "get", "put", "put", "put", "put",
                "get", "put", "put", "put", "put", "put", "put", "put" };
        int[][] inputs = { { 10, 0 }, { 10, 13 }, { 3, 17 }, { 6, 11 }, { 10, 5 }, { 9, 10 }, { 13, 0 }, { 2, 19 },
                { 2, 0 }, { 3, 0 }, { 5, 25 }, { 8, 0 }, { 9, 22 }, { 5, 5 }, { 1, 30 }, { 11, 0 }, { 9, 12 }, { 7, 0 },
                { 5, 0 }, { 8, 0 }, { 9, 0 }, { 4, 30 }, { 9, 3 }, { 9, 0 }, { 10, 0 }, { 10, 0 }, { 6, 14 }, { 3, 1 },
                { 3, 0 }, { 10, 11 }, { 8, 0 }, { 2, 14 }, { 1, 0 }, { 5, 0 }, { 4, 0 }, { 11, 4 }, { 12, 24 },
                { 5, 18 }, { 13, 0 }, { 7, 23 }, { 8, 0 }, { 12, 0 }, { 3, 27 }, { 2, 12 }, { 5, 0 }, { 2, 9 },
                { 13, 4 }, { 8, 18 }, { 1, 7 }, { 6, 0 }, { 9, 29 }, { 8, 21 }, { 5, 0 }, { 6, 30 }, { 1, 12 },
                { 10, 0 }, { 4, 15 }, { 7, 22 }, { 11, 26 }, { 8, 17 }, { 9, 29 }, { 5, 0 }, { 3, 4 }, { 11, 30 },
                { 12, 0 }, { 4, 29 }, { 3, 0 }, { 9, 0 }, { 6, 0 }, { 3, 4 }, { 1, 0 }, { 10, 0 }, { 3, 29 },
                { 10, 28 }, { 1, 20 }, { 11, 13 }, { 3, 0 }, { 3, 12 }, { 3, 8 }, { 10, 9 }, { 3, 26 }, { 8, 0 },
                { 7, 0 }, { 5, 0 }, { 13, 17 }, { 2, 27 }, { 11, 15 }, { 12, 0 }, { 9, 19 }, { 2, 15 }, { 3, 16 },
                { 1, 0 }, { 12, 17 }, { 9, 1 }, { 6, 19 }, { 4, 0 }, { 5, 0 }, { 5, 0 }, { 8, 1 }, { 11, 7 }, { 5, 2 },
                { 9, 28 }, { 1, 0 }, { 2, 2 }, { 7, 4 }, { 4, 22 }, { 7, 24 }, { 9, 26 }, { 13, 28 }, { 11, 26 } };
        Integer[] expectedOutputs = { null, null, null, null, null, null, -1, null, 19, 17, null, -1, null, null, null,
                -1, null, -1, 5, -1, 12, null, null, 3, 5, 5, null, null, 1, null, -1, null, 30, 5, 30, null, null,
                null, -1, null, -1, 24, null, null, 18, null, null, null, null, -1, null, null, 18, null, null, -1,
                null, null, null, null, null, 18, null, null, -1, null, 4, 29, 30, null, 12, -1, null, null, null,
                null, 29, null, null, null, null, 17, 22, 18, null, null, null, -1, null, null, null, 20, null, null,
                null, -1, 18, 18, null, null, null, null, 20, null, null, null, null, null, null, null };

        for (int i = 0; i < operations.length; i++) {
            switch (operations[i]) {
                case "LRUCache":
                    cache = new LRUCache(inputs[i][0]);
                    assertNotNull(cache);
                case "put":
                    cache.put(inputs[i][0], inputs[i][1]);
                    break;
                case "get":
                    int result = cache.get(inputs[i][0]);
                    assertEquals(expectedOutputs[i], result);
                    break;
            }
        }
    }
}
