package com.C4theBomb.datastructures.treesandgraphs;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;

public class BuildOrder {
    static class Dependency {
        String prj, dep;

        Dependency(String prj, String dep) {
            this.prj = prj;
            this.dep = dep;
        }
    }

    private static HashMap<String, ArrayList<String>> buildAjdList(String[] projects, ArrayList<Dependency> deps) {
        HashMap<String, ArrayList<String>> depsList = new HashMap<>();

        for (String project : projects) {
            depsList.put(project, new ArrayList<String>());
        }

        for (Dependency dep : deps) {
            depsList.get(dep.prj).add(dep.dep);
        }

        return depsList;
    }

    public static LinkedList<String> getBuildOrder(String[] projects, ArrayList<Dependency> deps) {
        HashMap<String, ArrayList<String>> adjList = BuildOrder.buildAjdList(projects, deps);
        LinkedList<String> order = new LinkedList<>();
        Iterator<String> iter = adjList.keySet().iterator();

        while (iter.hasNext()) {
            String key = iter.next();
            ArrayList<String> value = adjList.get(key);

            if (value.size() == 0) {
                order.add(key);

                System.out.println(adjList);
                System.out.println(order);
                for (ArrayList<String> keyValue : adjList.values()) {
                    keyValue.remove(key);
                }

                iter.remove();

                if (order.size() == projects.length) {
                    return order;
                }

                iter = adjList.keySet().iterator();
            }
        }

        return null;
    }
}
