package io.dksifoua.leetcode.generateparentheses;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    private void backtrack(List<String> result, String current, int openedParenthesis, int closedParenthesis, int n) {
        if (openedParenthesis == n && closedParenthesis == n) {
            result.add(current);
            return;
        }

        if (openedParenthesis < n) {
            backtrack(result, current + "(", openedParenthesis + 1, closedParenthesis, n);
        }

        if (closedParenthesis < openedParenthesis) {
            backtrack(result, current + ")", openedParenthesis, closedParenthesis + 1, n);
        }
    }

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }
}
