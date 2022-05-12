package com.C4theBomb.datastructures.treesandgraphs;

import java.util.HashMap;
import java.util.LinkedList;

public class ListofDepths {
    public static HashMap<Integer, LinkedList<Integer>> listDepths(BTNode head, int depth,
            HashMap<Integer, LinkedList<Integer>> acc) {
        if (head == null) {
            return acc;
        }

        if (!acc.containsKey(depth)) {
            acc.put(depth, new LinkedList<Integer>());
        }

        acc.get(depth).add(head.data);
        listDepths(head.left, depth + 1, acc);
        listDepths(head.right, depth + 1, acc);

        return acc;
    }
}
