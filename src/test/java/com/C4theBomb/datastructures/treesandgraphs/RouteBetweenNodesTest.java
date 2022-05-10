package com.C4theBomb.datastructures.treesandgraphs;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

@TestInstance(Lifecycle.PER_CLASS)
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
        this.nodes.get("B").conn.put("A", this.nodes.get("A"));
        this.nodes.get("C").conn.put("B", this.nodes.get("B"));
        this.nodes.get("C").conn.put("F", this.nodes.get("F"));
        this.nodes.get("D").conn.put("H", this.nodes.get("H"));
        this.nodes.get("E").conn.put("D", this.nodes.get("D"));
        this.nodes.get("E").conn.put("B", this.nodes.get("B"));
        this.nodes.get("E").conn.put("I", this.nodes.get("I"));
        this.nodes.get("F").conn.put("H", this.nodes.get("H"));
        this.nodes.get("F").conn.put("I", this.nodes.get("I"));
        this.nodes.get("G").conn.put("D", this.nodes.get("D"));
        this.nodes.get("H").conn.put("I", this.nodes.get("I"));
        this.nodes.get("H").conn.put("G", this.nodes.get("G"));
        this.nodes.get("H").conn.put("E", this.nodes.get("E"));
    }

    @Test
    @DisplayName("routeBetweenNodes - route between nodes")
    public void routeFound() {
        System.out.println(this.nodes.get("A").toString());
        assertTrue(RouteBetweenNodes.checkRoute(this.nodes.get("A"), this.nodes.get("I")));
    }

    @Test
    @DisplayName("routeBetweenNodes - no route between nodes")
    public void noRoute() {
        assertFalse(RouteBetweenNodes.checkRoute(this.nodes.get("I"), this.nodes.get("C")));
    }
}
