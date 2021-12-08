/*
Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?
*/
package datastructures.arraysandstrings;

import java.util.Arrays;

public class IsUnique {
    // Space complexity: O(n); Time complexity: O(n^2 log n)
    static boolean noDataStructures(String string, int charSetSize) {
        char[] stringArray = string.toCharArray();
        Arrays.sort(stringArray);

        for (int i = 1; i < stringArray.length - 1; i++) {
            char current = stringArray[i];
            if (current == stringArray[i - 1]) return false;
            if (current == stringArray[i + 1]) return false;
        }

        return true;
    }

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

    public static void main(String[] args) {
        System.out.println(dataStructures("asdf<>", 256));
        System.out.println(noDataStructures("asdf<>", 256));
    }
}
