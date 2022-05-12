package com.C4theBomb.datastructures.treesandgraphs;

public class CheckedBalanced {
    public static boolean checkBalanced(BTNode head) {
        if (head == null) {
            return true;
        }

        int leftDepth = getDepth(head.left);
        int rightDepth = getDepth(head.right);

        if (Math.abs(leftDepth - rightDepth) <= 1 && checkBalanced(head.left) && checkBalanced(head.right)) {
            return true;
        }

        return false;
    };

    private static int getDepth(BTNode head) {
        if (head == null) {
            return 0;
        }

        return 1 + Math.max(getDepth(head.left), getDepth(head.right));
    }
}
