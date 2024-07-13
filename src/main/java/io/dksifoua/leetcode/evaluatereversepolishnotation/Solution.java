package io.dksifoua.leetcode.evaluatereversepolishnotation;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {

    private Apply getApplyFunction(String operator) {
        return switch (operator) {
            case "+" -> Integer::sum;
            case "-" -> (int a, int b) -> a - b;
            case "*" -> (int a, int b) -> a * b;
            case "/" -> (int a, int b) -> a / b;
            default -> throw new IllegalArgumentException();
        };
    }

    public int evaluateReversePolishNotation(String[] tokens) {
        Deque<Integer> deque = new ArrayDeque<>(tokens.length);
        for (String token: tokens) {
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                int b = deque.removeLast();
                int a = deque.removeLast();
                deque.addLast(this.getApplyFunction(token).apply(a, b));
            } else {
                deque.addLast(Integer.parseInt(token));
            }
        }
        return deque.removeLast();
    }
}
