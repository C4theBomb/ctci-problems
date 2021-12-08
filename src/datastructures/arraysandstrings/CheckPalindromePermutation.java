package datastructures.arraysandstrings;

public class CheckPalindromePermutation {
    static boolean checkPalidrome(String str, int charSetSize) {
        int[] charCounts = new int[charSetSize];
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

    public static void main(String[] args) {
        
    }
}
