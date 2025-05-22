# [Koko Eating Bananas](https://leetcode.com/problems/koko-eating-bananas/description/)

## Intuition

Koko the gorilla loves to eat bananas. Given `N` piles of bananas, where each pile `i` contains `piles[i]` bananas, Koko
can eat bananas at a certain speed `k` bananas per hour. If a pile contains fewer bananas than her eating speed, she
will finish that pile and wait for the next hour. The goal is to determine the minimum integer value of `k` such that
Koko can eat all the bananas within `h` hours. This problem can be efficiently solved using a binary search approach due
to the constraints and properties of the problem.

## Approach

The key to solving this problem efficiently is to recognize that it can be framed as a binary search problem. We need to
find the smallest possible value of `k` such that Koko can eat all the bananas in `h` hours. Here’s the approach
step-by-step:

1. **Define Search Range:**
    - The minimum eating speed `k` can be 1 (i.e., Koko eats at least one banana per hour).
    - The maximum eating speed `k` can be the size of the largest pile (i.e., Koko eats the entire largest pile in one
      hour).
2. **Binary Search:**
    - Use binary search to find the minimum `k` that allows Koko to eat all the bananas within `h` hours.
    - Calculate the middle point in the current range.
    - Determine the total number of hours required for Koko to eat all bananas at the speed of the middle point.
3. **Ceiling Division:** Use ceiling division to calculate the hours required to finish each pile since Koko can eat `k`
   bananas per hour but might not completely finish a pile in a single hour if `pile % k > 0`.
4. **Update Search Range:**
    - If the total hours required is less than or equal to `h`, move the search range to the left (i.e., try a smaller
      eating speed).
    - If the total hours required is greater than `h`, move the search range to the right (i.e., try a larger eating
      speed).
5. **Terminate and Return:** When the binary search completes, the left pointer will point to the minimum eating speed
   `k`.

## Complexity

- **Time Complexity: `O(Nlog(max(piles)))`**
    - Binary search runs in `O(log(max(piles)))`.
    - Each step involves calculating the total hours, which takes `O(N)`.
- **Space Complexity: `O(1)`** The algorithm uses a constant amount of extra space.

## Code

- [Java](../src/main/java/io/dksifoua/leetcode/kokoeatingbananas/Solution.java)