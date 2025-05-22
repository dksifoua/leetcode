# [Trapping Rain Water](https://leetcode.com/problems/trapping-rain-water/description/)

## Intuition

The intuition behind the problem is to find out how much water can be trapped between the bars of the elevation map
after raining. The amount of water trapped above a bar is determined by the height of the tallest bars to its left and
right. If we know these values, we can calculate the trapped water above each bar by subtracting the bar’s height
from the minimum of the tallest bars to its left and right.

## Approach

1. **Precompute Maximum Heights:**
    - Use two arrays, `maxLeft` and `maxRight`, to store the maximum heights up to each index from the left and the
      right, respectively.
    - Iterate through the `height` array to fill these arrays.
        - `maxLeft[i]` stores the maximum height of the bars from the left up to index `i`.
        - `maxRight[j]` stores the maximum height of the bars from the right up to index `j`.
2. **Calculate Trapped Water:**
    - For each bar at index `i`, the water trapped above it is determined by the minimum of `maxLeft[i]` and
      `maxRight[i]`, minus the height of the bar itself (`height[i]`).
    - Sum these values to get the total amount of trapped water.
3. **Implementation:**
    - Initialize `maxLeft` and `maxRight` arrays.
    - Iterate through the `height` array from both ends simultaneously to fill `maxLeft` and `maxRight`.
    - Iterate through the `height` array to calculate the total trapped water using the precomputed values in `maxLeft`
      and `maxRight`.

## Complexity

- **Time Complexity: O(N)**
    - The first loop to fill `maxLeft` and `maxRight` runs in `O(N)` time.
    - The second loop to calculate the trapped water also runs in `O(N)` time.
    - Therefore, the overall time complexity is `O(N)`.
- **Space Complexity: O(N)**
    - We use two additional arrays `maxLeft` and `maxRight`, each of size `N`.
    - Hence, the space complexity is `O(N)`.

## Code

- [Java](../src/main/java/io/dksifoua/leetcode/trappingrainwater/Solution.java)