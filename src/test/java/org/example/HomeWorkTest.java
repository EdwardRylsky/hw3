package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HomeWorkTest {
    private static final HomeWork HOME_WORK = new HomeWork();

    @Test
    void findMaxSubstringTest() {
        assertEquals("abcd", HOME_WORK.findMaxSubstring("abcddcba"));
        assertEquals("dcbaX", HOME_WORK.findMaxSubstring("abcddcbaX"));
        assertEquals("abc", HOME_WORK.findMaxSubstring("abcabcbb"));
        assertEquals("b", HOME_WORK.findMaxSubstring("bbbbbbbbb"));
    }
}