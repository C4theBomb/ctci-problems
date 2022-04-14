package com.C4theBomb.datastructures.linkedlists;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.BeforeEach;

import com.C4theBomb.datastructures.linkedlists.Palindrome.LinkedList;

public class PalindromeTest {
    LinkedList check;

    @BeforeEach
    void setupEach() {
        this.check = new LinkedList();
    }

    @Test
    @DisplayName("checkPalindrome - true even input")
    void trueEvenCheckPalindrome() {
        int[] checkData = { 1, 2, 3, 4, 5, 5, 4, 3, 2, 1 };
        this.check.appendMultiple(checkData);

        assertTrue(this.check.checkPalindrome());
    }

    @Test
    @DisplayName("checkPalindrome - false even input")
    void falseEvenCheckPalindrome() {
        int[] checkData = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        this.check.appendMultiple(checkData);

        assertFalse(this.check.checkPalindrome());
    }

    @Test
    @DisplayName("checkPalindrome - true odd input")
    void trueOddCheckPalindrome() {
        int[] checkData = { 1, 2, 3, 4, 5, 4, 3, 2, 1 };
        this.check.appendMultiple(checkData);

        assertTrue(this.check.checkPalindrome());
    }

    @Test
    @DisplayName("checkPalindrome - false odd input")
    void falseOddCheckPalindrome() {
        int[] checkData = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        this.check.appendMultiple(checkData);

        assertFalse(this.check.checkPalindrome());
    }

    @Test
    @DisplayName("checkPalindrome - empty input")
    void emptyCheckPalindrome() {
        assertNull(this.check.checkPalindrome());
    }
}
