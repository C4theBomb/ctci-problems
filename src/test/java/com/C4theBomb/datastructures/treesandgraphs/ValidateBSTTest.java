package com.C4theBomb.datastructures.treesandgraphs;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.BeforeEach;

public class ValidateBSTTest {
    BTNode head;

    @BeforeEach
    public void setup() {
        /* Create the binary search tree */
        // Build head node
        this.head = new BTNode(5);

        // Build right branch
        this.head.right = new BTNode(7);
        this.head.right.left = new BTNode(6);
        this.head.right.right = new BTNode(8);
        this.head.right.right.right = new BTNode(9);

        // Build left branch
        this.head.left = new BTNode(3);
        this.head.left.right = new BTNode(4);
        this.head.left.left = new BTNode(2);
        this.head.left.left.left = new BTNode(1);
    }

    @Test
    @DisplayName("valigateBST - false")
    public void trueBST() {
        assertTrue(ValidateBST.checkBST(this.head, Integer.MIN_VALUE, Integer.MAX_VALUE));
    }

    @Test
    @DisplayName("validateBST - false")
    public void falseBST() {
        this.head.right.data = 10;

        assertFalse(ValidateBST.checkBST(this.head, Integer.MIN_VALUE, Integer.MAX_VALUE));
    }
}
