package com.C4theBomb.datastructures.arraysandstrings;

/* 
Implement a method to perform a basic string compression using the counts of repeated charactres. 
For example, the string 'aabcccccaaa' would become 'a2b1c5a3'.
If the compressed string would not become smaller than the original string, your method should return the original string.
You can assume the string has only uppercase and lowercase characters.
*/

public class StringCompression {
    static String compressString(String str) {
        int currentIndex = 0;
        char[] strArray = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            // Get the number of indentical characters by iterating through the string
            int count = 1;
            while ((i + count < str.length()) && (str.charAt(i) == str.charAt(i + count)))  {
                count++;
            }

            // Add the character to the strArray and move index forward
            strArray[currentIndex] = str.charAt(i);
            currentIndex++;

            // Add the count (if any) and move index forward again
            if (count > 1) {
                strArray[currentIndex] = (char) (count + '0');
                currentIndex++;
            }

            // Increase i by the amount of characters compressed
            i += count - 1;
        }

        String newStr = new String(strArray).trim();
        return (newStr.length() < str.length()) ? newStr : str;
    }
}
