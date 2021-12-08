/*
Write a method to replace all spaces in a string with '%20'. 
You may assume that the string has suffcient space at the end to hold the additional characters, and that you are given the "true" lenth of the string
(NOTE: If implementing in Java, please use a character array so that you can perform this operation in place)
*/
package datastructures.arraysandstrings;

public class URLify {
    static String urlify(char[] string, int trueLength) {
        char[] url = new char[trueLength];
        int newArrayIndex = 0;
        for (int oldArrayIndex = 0; oldArrayIndex < string.length; oldArrayIndex++) {
            if (string[oldArrayIndex] == ' ') {
                url[newArrayIndex] = '%';
                url[newArrayIndex + 1] = '2';
                url[newArrayIndex + 2] = '0';
                newArrayIndex += 3;
            } else {
                url[newArrayIndex] = string[oldArrayIndex];
                newArrayIndex++;
            }
        }

        return new String(url);
    }
    public static void main(String[] args) {
        char[] testString = "or ange".toCharArray();
        System.out.println(urlify(testString, 12));
    }
}
