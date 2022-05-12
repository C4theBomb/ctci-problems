package com.C4theBomb.datastructures.treesandgraphs;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class CheckedBalancedTest {
    @Test
    @DisplayName("checkBalanced - list is balanced")
    public void balanced() {
        /* Create the binary search tree */
        // Build head node
        BTNode head = new BTNode(5);

        // Build right branch
        head.right = new BTNode(7);
        head.right.left = new BTNode(6);
        head.right.right = new BTNode(8);
        head.right.right.right = new BTNode(9);

        // Build left branch
        head.left = new BTNode(3);
        head.left.right = new BTNode(4);
        head.left.left = new BTNode(2);
        head.left.left.left = new BTNode(1);

        assertTrue(CheckedBalanced.checkBalanced(head));
    }

    @Test
    @DisplayName("checkBalanced - list is not balanced")
    public void notBalanced() {
        /* Create the skewed binary search tree */
        BTNode head = new BTNode(2);
        head.left = new BTNode(1);
        head.right = new BTNode(3);
        head.right.right = new BTNode(4);
        head.right.right.right = new BTNode(5);
        head.right.right.right.right = new BTNode(6);
        head.right.right.right.right.right = new BTNode(7);
        head.right.right.right.right.right.right = new BTNode(8);
        head.right.right.right.right.right.right.right = new BTNode(9);

        assertFalse(CheckedBalanced.checkBalanced(head));
    }
}
