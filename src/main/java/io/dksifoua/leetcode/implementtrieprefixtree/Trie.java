package io.dksifoua.leetcode.implementtrieprefixtree;

import io.dksifoua.leetcode.utils.TrieNode;
import lombok.Getter;

@Getter
public class Trie {

    private final TrieNode root;

    public Trie() {
        this.root = new TrieNode();
    }

    public void insert(String word) {
        // System.out.println("Insert " + word);
        TrieNode node = this.root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (node.getChildren().containsKey(c)) {
                node = node.getChildren().get(c);
                if (!node.isEnd()) {
                    node.setEnd(i == word.length() - 1);
                }
                // System.out.printf("\tCharacter [%c] is present. End=%b\n", c, node.isEnd());
            } else {
                node.getChildren().put(c, new TrieNode());
                node = node.getChildren().get(c);
                node.setEnd(i == word.length() - 1);
                // System.out.printf("\tCharacter [%c] is new. End=%b\n", c, node.isEnd());
            }
        }
    }

    public boolean search(String word) {
        TrieNode node = this.root;
        for (char c : word.toCharArray()) {
            if (node.getChildren().containsKey(c)) {
                node = node.getChildren().get(c);
            } else {
                return false;
            }
        }

        return node.isEnd();
    }

    public boolean startsWith(String prefix) {
        TrieNode node = this.root;
        for (char c : prefix.toCharArray()) {
            if (node.getChildren().containsKey(c)) {
                node = node.getChildren().get(c);
            } else {
                return false;
            }
        }

        return true;
    }
}
