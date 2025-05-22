package io.dksifoua.leetcode.utils;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@NoArgsConstructor
public class TrieNode {

    private Map<Character, TrieNode> children = new HashMap<>();
    private boolean end = false;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character, TrieNode> entry : children.entrySet()) {
            buildTreeString(entry.getKey(), entry.getValue(), sb, "|", true);
        }
        return sb.toString();
    }

    private void buildTreeString(char c, TrieNode node, StringBuilder sb, String prefix, boolean ignoredIsLast) {
        sb.append(prefix);
        sb.append("-");
        sb.append(c).append("[").append(node.isEnd()).append("]").append("\n");

        List<Map.Entry<Character, TrieNode>> entries = new ArrayList<>(node.getChildren().entrySet());
        for (int i = 0; i < entries.size(); i++) {
            Map.Entry<Character, TrieNode> child = entries.get(i);
            boolean last = (i == entries.size() - 1);
            buildTreeString(child.getKey(), child.getValue(), sb, prefix + "-", last);
        }
    }
}
