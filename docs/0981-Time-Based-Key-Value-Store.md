# [Time Based Key-Value Store](https://leetcode.com/problems/time-based-key-value-store/description/)

## Intuition

The problem requires efficiently storing and retrieving values based on timestamps. Given the constraint that timestamps
are strictly increasing for each key, we can leverage this property to maintain an ordered list of values for each key.
This allows us to use binary search to quickly find the most recent value for a given timestamp.

## Approach

**Data structure:**

- Use a `HashMap<String, List<ValueTimestampTuple>>`:
    - Key: The string key.
    - Value: A list of `ValueTimestampTuple`, each containing a value and a timestamp.

**Methods**

- `set(String key, String value, int timestamp)`
    1. **Check for Key Existence:** If the key does not exist in the map, initialize a new `ArrayList` for that key.
    2. **Store the Value:** Append the `(value, timestamp)` tuple2 to the list associated with the key. Since timestamps
       are strictly increasing, this maintains the order.

- `get(String key, int timestamp)`
    1. **Key Check:** If the key does not exist in the map, return an empty string.
    2. **Binary Search:**
        - Initialize `leftIndex` to `0` and `rightIndex` to the last index of the list.
        - If the first timestamp is greater than the given timestamp, return an empty string.
        - If the last timestamp is less than or equal to the given timestamp, return the value at the last index.
        - Perform binary search:
            - Calculate `middleIndex` as `(leftIndex + rightIndex) / 2`.
            - If the timestamp at `middleIndex` is less than or equal to the given timestamp, update `foundIndex` to
              `middleIndex` and move `leftIndex` to `middleIndex + 1`.
            - If the timestamp at `middleIndex` is greater than the given timestamp, move `rightIndex` to
              `middleIndex - 1`.
        - Return the value at `foundIndex`.

## Complexity

- **Time Complexity:**
    - **`set`: `O(1)`** on average, as appending to an ArrayList is amortized constant time.
    - **`get`: `O(log N)`**, due to binary search.
- **Space Complexity: `O(N)`**, as each set operation adds a new entry to the list.

## Code

- [Java](../src/main/java/io/dksifoua/leetcode/timebasedkeyvaluestore/TimeMap.java)

## Summary

This solution efficiently handles the problem's requirements by using a combination of a `HashMap` and an `ArrayList`.
The set method ensures constant time storage of values, while the get method uses binary search to achieve logarithmic
time retrieval. This approach leverages the strictly increasing timestamps to maintain an ordered list, which is key to
efficient retrieval. Overall, the solution is optimal and well-suited for the constraints provided.