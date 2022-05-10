package com.C4theBomb.datastructures.treesandgraphs;

import java.util.HashMap

import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class RouteBetweenNodesTest {
    HashMap<String, Node<String>> nodes;

    @BeforeAll
    public void setup() {
        String[] chars = { "A", "B", "C", "D", "E", "F", "G", "H", "I" };
        this.nodes = new HashMap<>();

        for (String i : chars) {
            this.nodes.put(i, new Node<>(i));
        }

        this.nodes.get("A").conn.put("D", this.nodes.get("D"));
        this.nodes.get("B").conn.put("A", this.nodes.get("D"));
        this.nodes.get("C").conn.put("F", this.nodes.get("D"));
        this.nodes.get("C").conn.put("B", this.nodes.get("D"));
        this.nodes.get("E").conn.put("D", this.nodes.get("D"));
        this.nodes.get("E").conn.put("B", this.nodes.get("D"));
        this.nodes.get("E").conn.put("I", this.nodes.get("D"));
        this.nodes.get("F").conn.put("E", this.nodes.get("D"));
        this.nodes.get("F").conn.put("I", this.nodes.get("D"));
        this.nodes.get("G").conn.put("D", this.nodes.get("D"));
        this.nodes.get("H").conn.put("I", this.nodes.get("D"));
        this.nodes.get("H").conn.put("G", this.nodes.get("D"));
        this.nodes.get("H").conn.put("E", this.nodes.get("D"));
    }
}
