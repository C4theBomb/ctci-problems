package com.C4theBomb.datastructures.treesandgraphs;

import java.util.ArrayList;
import java.util.List;

public class MinimalTree {
    Node<Integer> root;

    public MinimalTree(ArrayList<Integer> list) {
        this.root = createMinimalTree(list, 0, list.size() - 1);
    }

    public Node<Integer> createMinimalTree(List<Integer> list, int startIndex, int endIndex) {
        if (endIndex < startIndex) {
            return null;
        }

        int middle = (startIndex + endIndex) / 2;
        Node<Integer> root = new Node<>(list.get(middle));
        root.conn.put("left", createMinimalTree(list, startIndex, middle - 1));
        root.conn.put("right", createMinimalTree(list, middle + 1, endIndex));

        return root;
    }
}
