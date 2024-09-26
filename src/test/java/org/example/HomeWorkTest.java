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
    @Test
    void checkTest() {
        assertTrue(HOME_WORK.check("The quick brown fox jumps over the lazy dog"));
        assertTrue(HOME_WORK.check("The quick олол1234ол brown fox jumps over the lazy dog"));

        assertFalse(HOME_WORK.check(null));
        assertFalse(HOME_WORK.check("The quick brown jumps over the lazy dog"));
        assertFalse(HOME_WORK.check("The                                    dog"));
    }
    @Test
    void checkRussianTest() {
        assertTrue(HOME_WORK.checkRussian("Аэрофотосъёмка ландшафта уже выявила земли богачей и процветающих крестьян."));
        assertTrue(HOME_WORK.checkRussian("Съешь ещё этих мягких французских булок, да выпей же чаю."));

        assertFalse(HOME_WORK.checkRussian(null));
        assertFalse(HOME_WORK.checkRussian("Съешь еще этих мягких французских булок, да выпей же чаю."));
        assertFalse(HOME_WORK.checkRussian("Съешь ещѐ этих мягких французских булок, да выпей же чаю."));
        assertFalse(HOME_WORK.checkRussian("Съешь                                              чаю."));
        assertFalse(HOME_WORK.checkRussian("Съешь еще trololo 23462645 этих мягких французских булок, да выпей же чаю."));
    }


}