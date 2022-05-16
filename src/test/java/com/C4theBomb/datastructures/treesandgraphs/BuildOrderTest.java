package com.C4theBomb.datastructures.treesandgraphs;

import java.util.LinkedList;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import com.C4theBomb.datastructures.treesandgraphs.BuildOrder.Dependency;

public class BuildOrderTest {

    @Test
    @DisplayName("buildOrder - build order successfully found")
    public void buildOrderFound() {
        ArrayList<Dependency> input = new ArrayList<>();
        input.add(new Dependency("c", "f"));
        input.add(new Dependency("b", "f"));
        input.add(new Dependency("a", "f"));
        input.add(new Dependency("a", "c"));
        input.add(new Dependency("a", "b"));
        input.add(new Dependency("e", "a"));
        input.add(new Dependency("e", "b"));
        input.add(new Dependency("g", "d"));

        String[] expected = { "f", "d", "c", "b", "g", "a", "e" };
        LinkedList<String> recieved = BuildOrder.getBuildOrder(input);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], recieved.get(i));
        }
    }

    @Test
    @DisplayName("buildOrder - no possible build order found")
    public void buildFailed() {
        ArrayList<Dependency> input = new ArrayList<>();
        input.add(new Dependency("c", "f"));
        input.add(new Dependency("b", "f"));
        input.add(new Dependency("a", "f"));
        input.add(new Dependency("a", "c"));
        input.add(new Dependency("d", "a"));
        input.add(new Dependency("e", "a"));
        input.add(new Dependency("e", "b"));
        input.add(new Dependency("a", "d"));

        assertNull(BuildOrder.getBuildOrder(input));
    }

}
