package com.C4theBomb.datastructures.arraysandstrings;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class OneAwayTest {
    @Test
    @DisplayName("oneAway ('ple', 'pale') - true")
    void trueOneAwayInsert() {
        assertTrue(OneAway.oneAway("pale", "ple"));
    }

    @Test
    @DisplayName("oneAway ('pales', 'pale') - true")
    void trueOneAwayDelete() {
        assertTrue(OneAway.oneAway("pales", "pale"));
    }

    @Test
    @DisplayName("oneAway ('pale', 'bale') - true")
    void trueOneAwayReplace() {
        assertTrue(OneAway.oneAway("pale", "bale"));
    }

    @Test
    @DisplayName("oneAway ('pale', 'pale') - true")
    void trueOneAwaySame() {
        assertTrue(OneAway.oneAway("pale", "pale"));
    }

    @Test
    @DisplayName("oneAway ('pale', 'bake') - false")
    void falseOneAway() {
        assertFalse(OneAway.oneAway("pale", "bake"));
    }

    @Test
    @DisplayName("oneAway ('pale', 'bakegreen') - false")
    void falseOneAwayLong() {
        assertFalse(OneAway.oneAway("pale", "bakegreen"));
    }

}
