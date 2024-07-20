# [Car Fleet](https://leetcode.com/problems/car-fleet/description/)

## Intuition

The problem is essentially about determining how many distinct groups (“fleets”) of cars will arrive at a target 
destination, given that no car can overtake another but can form groups with any car it catches up to. The critical 
insight here is to understand that cars closer to the destination at the start can only form a fleet with cars behind 
them if those cars do not catch up by the target. Thus, sorting cars by their starting positions in descending order 
allows us to simulate their journey and determine how many separate groups form by the time they reach the target.

## Approach

1. **Structuring the Data:** Use a record `PositionSpeed` to store each car’s starting position and speed. This helps in
organizing the data and simplifies operations on it.
2. **Sorting:** Sort the cars based on their starting positions in descending order. This way, we process cars that are 
further from the destination first and keep adding cars to a fleet until a car cannot catch up, thus forming a distinct 
fleet.
3. **Calculating Arrival Times:** For each car, calculate the time it would take to reach the target from its starting 
position at its given speed. This is given by `(target - position) / speed`.
4. **Using a Stack to Form Fleets:**
    - Utilize a stack to track the leading arrival times of each fleet. If a car’s calculated arrival time is greater 
    than the time on the stack (i.e., it takes longer to reach the destination than the car at the top of the stack), it
    starts a new fleet, and its time gets pushed onto the stack.
    - If a car can catch up (i.e., its arrival time is less than or equal to the time on the top of the stack), it joins
    an existing fleet and does not change the stack.
5. **Determining the Number of Fleets:** The number of distinct arrival times in the stack at the end of the iteration 
gives the number of fleets.

## Complexity

- ** Time Complexity: `O(NlogN)`**. The dominant factor here is the sorting step, which is `O(NlogN)`, where `N` is the 
number of cars. 
- **Space Complexity: `O(N)`** since we need space proportional to the number of cars for storing the `PositionSpeed` 
records, the sorted list, and the stack that potentially can hold as many elements as there are cars in the worst-case 
scenario.

## Code

- [Java](../src/main/java/io/dksifoua/leetcode/carfleet/Solution.java)