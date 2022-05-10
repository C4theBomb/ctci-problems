package com.C4theBomb.datastructures.treesandgraphs;

import java.util.Queue;
import java.util.LinkedList;

public class RouteBetweenNodes {
    public static boolean checkRoute(Node<String> start, Node<String> target) {
        Queue<Node<String>> q = new LinkedList<Node<String>>();
        LinkedList<Node<String>> checked = new LinkedList<>();

        q.add(start);
        checked.add(start);

        while (!q.isEmpty()) {
            Node<String> r = q.remove();
            if (r.equals(target)) {
                return true;
            }

            for (String key : r.conn.keySet()) {
                Node<String> current = r.conn.get(key);

                if (!checked.contains(current)) {
                    q.add(current);
                    checked.add(current);
                }

            }
        }

        return false;
    }
}
