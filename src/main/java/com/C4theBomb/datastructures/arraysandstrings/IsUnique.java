package com.C4theBomb.datastructures.arraysandstrings;
/*
Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?
*/

public class IsUnique {
    // Space complexity: O(n); Time complexity: O(n)
    static boolean dataStructures(String string, int charSetSize) {
        boolean[] charSet = new boolean[charSetSize];
        if (string.length() > charSetSize) {
            return false;
        }

        for (int i = 0; i < string.length(); i++) {
            int value = string.charAt(i);
            if (charSet[value]) {
                return false;
            }
            charSet[value] = true;
        }

        return true;
    }
}
