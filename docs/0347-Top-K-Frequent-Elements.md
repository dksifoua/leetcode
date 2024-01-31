# [Top K Frequent Elements](https://leetcode.com/problems/top-k-frequent-elements/description/)

## Intuition

The problem requires finding the k most frequent elements in an array. A direct way to do this is by counting the frequency of each element and then sorting or selecting the top k elements based on their frequencies. A more efficient approach leverages bucket sort, where elements are grouped by their frequencies. This way, we can directly access elements with the highest frequencies without sorting all the elements.

## Approach

1. **Counting Frequencies:**
   - Use a HashMap to store the frequency of each element in the array.
   - Iterate through the array and populate the HashMap with the count of each element.
2. **Bucket Sort:**
   - Create an array of lists (bucket) where the index represents the frequency of elements. The length of this array is `nums.length + 1` because the maximum possible frequency of any element can be `nums.length` (if all elements are the same).
   - Iterate over the HashMap and place each element into the corresponding bucket based on its frequency. The bucket index is frequency.
3. **Collecting Results:**
   - Start from the highest possible frequency (end of the bucket array) and collect elements until we have k elements.
   - Traverse the bucket array from the end to the beginning, and for each non-null bucket, add its elements to the result array.
   - Stop collecting once we have added k elements to the result array.

## Complexity

- **Time Complexity: `O(N)`**
  - Counting the frequencies takes `O(N)` time, where `N` is the number of elements in the input array.
  - Filling the buckets takes `O(N)` time.
  - Collecting the top `k` frequent elements takes `O(N)` time in the worst case.
- **Space Complexity: `O(N)`**
  - The HashMap for counting frequencies takes `O(N)` space.
  - The bucket array of lists also takes `O(N)` space in the worst case.
  - The result array takes `O(k)` space.

## Code

- [Java](../src/main/java/io/dksifoua/leetcode/topkfrequentelements/Solution.java)
