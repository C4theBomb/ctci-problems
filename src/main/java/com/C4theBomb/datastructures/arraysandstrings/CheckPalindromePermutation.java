package com.C4theBomb.datastructures.arraysandstrings;

/* 
Given a string, write a function to check if it is a permutation of a palindrome. 
A palindrome is a word or phrase that is the same forwards and backwards.
A permutation is a rearrangement of letters. The palindrome does not need to be limited to just dictionary words.
You can ignore the casing and non-letter characters.
*/

public class CheckPalindromePermutation {
    static boolean checkPalindromePermutation(String str) {
        int[] charCounts = new int[256];
        int differences = 0;
        for (int i = 0; i < str.length(); i++) {
            charCounts[str.charAt(i)]++;
        }

        for (int count : charCounts) {
            if (count % 2 != 0) {
                differences++;
            }
        }

        return (differences > 1) ? false : true;
    }
}
