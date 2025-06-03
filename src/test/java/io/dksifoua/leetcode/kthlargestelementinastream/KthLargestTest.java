package io.dksifoua.leetcode.kthlargestelementinastream;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KthLargestTest {

    @Test
    public void testExample1() {
        KthLargest kthLargest = new KthLargest(3, new int[]{4, 5, 8, 2});
        assertEquals(4, kthLargest.add(3));  // [4,5,8] -> [3] added, kth=4
        assertEquals(5, kthLargest.add(5));  // [4,5,8] -> [5] added, kth=5
        assertEquals(5, kthLargest.add(10)); // [5,8,10] -> kth=5
        assertEquals(8, kthLargest.add(9));  // [8,9,10] -> kth=8
        assertEquals(8, kthLargest.add(4));  // [8,9,10] still -> kth=8
    }

    @Test
    public void testExample2() {
        KthLargest kthLargest = new KthLargest(4, new int[]{7, 7, 7, 7, 8, 3});
        assertEquals(7, kthLargest.add(2));  // [7,7,7,7] -> kth=7
        assertEquals(7, kthLargest.add(10)); // [7,7,8,10] -> kth=7
        assertEquals(7, kthLargest.add(9));  // [7,8,9,10] -> kth=7
        assertEquals(8, kthLargest.add(9));  // [8,9,9,10] -> kth=8
    }

}