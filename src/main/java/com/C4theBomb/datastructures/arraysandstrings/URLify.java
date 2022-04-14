package com.C4theBomb.datastructures.arraysandstrings;
/*
Write a method to replace all spaces in a string with '%20'. 
You may assume that the string has suffcient space at the end to hold the additional characters, and that you are given the "true" lenth of the string
(NOTE: If implementing in Java, please use a character array so that you can perform this operation in place)
*/

public class URLify {
    static int countChars(char[] string, char search) {
        int count = 0;
        for (char c : string) {
            if (c == ' ') {
                count++;
            } 
        }

        return count;
    }

    static String urlify(String string) {
        if (string.length() == 0) return "";

        char[] stringArray = string.toCharArray();
        int trueLength = countChars(stringArray, ' ') * 2 + stringArray.length;
        char[] url = new char[trueLength];

        int newArrayIndex = 0;
        for (int oldArrayIndex = 0; oldArrayIndex < stringArray.length; oldArrayIndex++) {
            if (stringArray[oldArrayIndex] == ' ') {
                url[newArrayIndex] = '%';
                url[newArrayIndex + 1] = '2';
                url[newArrayIndex + 2] = '0';
                newArrayIndex += 3;
            } else {
                url[newArrayIndex] = stringArray[oldArrayIndex];
                newArrayIndex++;
            }
        }

        return new String(url);
    }
}
