package io.dksifoua.leetcode.designaddandsearchwordsdatastructure;

import java.util.HashMap;
import java.util.Map;

public class WordDictionary {

    private final Map<Character, WordDictionary> children;
    private boolean end;

    public WordDictionary() {
        this.children = new HashMap<>();
        this.end = false;
    }

    public void addWord(String word) {
        WordDictionary node = this;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (!node.children.containsKey(c)) {
                node.children.put(c, new WordDictionary());
            }
            node = node.children.get(c);
        }
        node.end = true;
    }

    public boolean search(String word) {
        return this.dfs(word, 0);
    }

    private boolean dfs(String word, int startIndex) {
        WordDictionary node = this;
        for (int i = startIndex; i < word.length(); i++) {
            char c = word.charAt(i);
            if (c == '.') {
                for (char nc: node.children.keySet()) {
                    if (node.children.get(nc).dfs(word, i + 1)) {
                        return true;
                    }
                }
                return false;
            } else {
                if (node.children.containsKey(c)) {
                    node = node.children.get(c);
                } else {
                    return false;
                }
            }
        }
        return node.end;
    }
}
