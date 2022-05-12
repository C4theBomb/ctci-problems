package com.C4theBomb.datastructures.treesandgraphs;

public class ValidateBST {
    public static boolean checkBST(BTNode head, int min, int max) {
        if (head == null)
            return true;

        if (head.data < min || head.data > max) {
            return false;
        }

        return (checkBST(head.left, min, head.data - 1) &&
                checkBST(head.right, head.data + 1, max));
    }
}
