package com.C4theBomb.datastructures.treesandgraphs;

import java.util.HashMap;

public class Node<T> {
    T data;
    HashMap<String, Node<T>> conn;

    public Node(T data) {
        this.data = data;
        this.conn = new HashMap<>();
    }

    public Node<T> get(String key) {
        return this.conn.get(key);
    }
}
