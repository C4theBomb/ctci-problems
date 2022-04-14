package com.C4theBomb.datastructures.arraysandstrings;
/* 
There are three types of deits thtat can be performed on strings: insert a character, remove a character, or replace a character. 
Given two strings, write a function to check if they are one edit (or zero edits away).
*/

import java.lang.Math;

public class OneAway {
    static boolean oneAway(String initialString, String finalString) {
        if (Math.abs(initialString.length() - finalString.length()) > 1) return false;

        if (initialString.length() == finalString.length()) {
            return replace(initialString, finalString);
        } else if (initialString.length() > finalString.length()) {
            return insert(finalString, initialString);
        } else {
            return insert(initialString, finalString);
        }
    }

    private static boolean replace(String string1, String string2) {
        boolean differenceFound = false;
        for (int i = 0; i < string1.length(); i++) {
            if (string1.charAt(i) != string2.charAt(i)) {
                if (differenceFound) return false;

                differenceFound = true;
            }
        }

        return true;
    }

    private static boolean insert(String shorterString, String longerString) {
        int shortIndex = 0;
        int longIndex = 0;

        while (shortIndex < shorterString.length() && longIndex < longerString.length()) {
            if (shorterString.charAt(shortIndex) == longerString.charAt(longIndex)) {
                shortIndex++;
                longIndex++;
            } else {
                if (shortIndex != longIndex) return false;

                longIndex++;
            }
        }

        return true;
    }
}
