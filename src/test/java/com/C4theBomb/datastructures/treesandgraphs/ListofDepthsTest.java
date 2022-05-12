package com.C4theBomb.datastructures.treesandgraphs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class ListofDepthsTest {
    @Test
    @DisplayName("listOfDepths - correctly creates list of depths")
    public void listOfDepths() {
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

        /* Build expected hashmap */
        HashMap<Integer, LinkedList<Integer>> expected = new HashMap<>();
        expected.put(0, new LinkedList<Integer>(Arrays.asList(5)));
        expected.put(1, new LinkedList<Integer>(Arrays.asList(3, 7)));
        expected.put(2, new LinkedList<Integer>(Arrays.asList(2, 4, 6, 8)));
        expected.put(3, new LinkedList<Integer>(Arrays.asList(1, 9)));

        HashMap<Integer, LinkedList<Integer>> list = new HashMap<>();
        HashMap<Integer, LinkedList<Integer>> recieved = ListofDepths.listDepths(head, 0, list);

        // Test for equality
        for (int key : expected.keySet()) {
            LinkedList<Integer> e = expected.get(key);
            LinkedList<Integer> r = recieved.get(key);

            for (int i = 0; i < e.size(); i++) {
                assertEquals(e.get(i), r.get(i));
            }
        }
    }
}
