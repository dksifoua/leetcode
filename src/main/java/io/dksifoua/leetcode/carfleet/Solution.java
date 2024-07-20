package io.dksifoua.leetcode.carfleet;

import java.util.*;

public class Solution {

    private record PositionSpeed(int position, int speed) {}

    public int carFleet(int target, int[] position, int[] speed) {
        List<PositionSpeed> positionSpeeds = new ArrayList<>() {{
            for (int i = 0; i < position.length; i++) {
                add(new PositionSpeed(position[i], speed[i]));
            }
        }};
        positionSpeeds.sort(Comparator.comparingInt(PositionSpeed::position).reversed());

        Stack<Float> fleetHeads = new Stack<>();
        for (PositionSpeed positionSpeed: positionSpeeds) {
            float time = (float) (target - positionSpeed.position()) / positionSpeed.speed();
            if (fleetHeads.isEmpty() || time > fleetHeads.peek()) {
                fleetHeads.push(time);
            }
        }

        return fleetHeads.size();
    }
}
