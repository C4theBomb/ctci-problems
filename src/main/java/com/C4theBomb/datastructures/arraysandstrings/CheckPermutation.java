package com.C4theBomb.datastructures.arraysandstrings;
/*
Given two strings, write a method to decide if one is a permutation of the other.
*/

import java.util.Arrays;

public class CheckPermutation {
    static String sort(String string) {
        char[] stringArray = string.toCharArray();
        Arrays.sort(stringArray);
        return new String(stringArray);
    }

    // Space complexity: O(n) Time complexity: O(n log n)
    static boolean checkPermutation1(String string1, String string2) {
        if (string1.length() != string2.length()) return false;
        return sort(string1).equals(sort(string2));
    }

    // Space complexity: O(n) Time complexity: O(n)
    static boolean checkPermutation2(String string1, String string2) {
        if (string1.length() != string2.length()) return false;
        int[] charSet = new int[128];
        for (int i = 0; i < string1.length(); i++) {
            charSet[string1.charAt(i)]++;
        }
        for (int i = 0; i < string2.length(); i++) {
            charSet[string2.charAt(i)]--;
            if (charSet[string2.charAt(i)] < 0) return false;
        }

        return true;
    }
}
