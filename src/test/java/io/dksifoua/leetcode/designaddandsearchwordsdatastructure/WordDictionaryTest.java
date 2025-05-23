package io.dksifoua.leetcode.designaddandsearchwordsdatastructure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordDictionaryTest {

    @Test
    public void testWordDictionaryOperations() {
        WordDictionary wordDictionary = new WordDictionary();

        wordDictionary.addWord("bad");
        wordDictionary.addWord("dad");
        wordDictionary.addWord("mad");

        assertFalse(wordDictionary.search("pad")); // "pad" not added
        assertTrue(wordDictionary.search("bad"));  // exact match
        assertTrue(wordDictionary.search(".ad"));  // wildcard match
        assertTrue(wordDictionary.search("b.."));  // wildcard match
    }

}