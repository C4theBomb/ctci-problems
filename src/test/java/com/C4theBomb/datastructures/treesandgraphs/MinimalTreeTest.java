package com.C4theBomb.datastructures.treesandgraphs;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class MinimalTreeTest {
    @Test
    @DisplayName("minimalTree - correctly creates the minimal tree")
    public void minimalTree() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        MinimalTree bst = new MinimalTree(list);

        assertEquals(4, bst.root.data);
        assertEquals(1, bst.root.conn.get("left").data);
        assertEquals(7, bst.root.conn.get("right").data);
    }
}
