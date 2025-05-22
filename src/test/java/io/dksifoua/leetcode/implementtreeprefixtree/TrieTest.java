package io.dksifoua.leetcode.implementtreeprefixtree;

import io.dksifoua.leetcode.implementtrieprefixtree.Trie;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrieTest {

    final Trie trie = new Trie();

    @Test
    void exampleScenario() {
        trie.insert("apple");
        assertTrue(trie.search("apple"));
        assertFalse(trie.search("app"));
        assertTrue(trie.startsWith("app"));
        trie.insert("app");
        assertTrue(trie.search("app"));

        assertEquals("""
                |-a[false]
                |--p[false]
                |---p[true]
                |----l[false]
                |-----e[true]
                """, trie.getRoot().toString());
    }

    @Test
    void extendedTrieScenario() {
        Trie trie = new Trie();

        trie.insert("app");
        trie.insert("apple");
        trie.insert("beer");
        trie.insert("add");
        trie.insert("jam");
        trie.insert("rental");

        // search tests
        assertFalse(trie.search("apps"));
        assertTrue(trie.search("app"));
        assertFalse(trie.search("ad"));
        assertFalse(trie.search("applepie"));
        assertFalse(trie.search("rest"));
        assertFalse(trie.search("jan"));
        assertFalse(trie.search("rent"));
        assertTrue(trie.search("beer"));
        assertTrue(trie.search("jam"));

        // startsWith tests
        assertFalse(trie.startsWith("apps"));
        assertTrue(trie.startsWith("app"));
        assertTrue(trie.startsWith("ad"));
        assertFalse(trie.startsWith("applepie"));
        assertFalse(trie.startsWith("rest"));
        assertFalse(trie.startsWith("jan"));
        assertTrue(trie.startsWith("rent"));
        assertTrue(trie.startsWith("beer"));
        assertTrue(trie.startsWith("jam"));
    }

}