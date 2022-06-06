package com.C4theBomb.datastructures.treesandgraphs;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.LinkedList;

public class BuildOrder {
    static class Dependency {
        String prj, dep;

        Dependency(String prj, String dep) {
            this.prj = prj;
            this.dep = dep;
        }
    }

    private static HashMap<String, ArrayList<String>> buildAjdList(ArrayList<Dependency> deps) {
        HashMap<String, ArrayList<String>> depsList = new HashMap<>();

        for (Dependency dep : deps) {
            depsList.putIfAbsent(dep.prj, new ArrayList<String>());
            depsList.get(dep.prj).add(dep.dep);
        }

        return depsList;
    }

    public static LinkedList<String> getBuildOrder(ArrayList<Dependency> deps) {
        HashMap<String, ArrayList<String>> adjList = BuildOrder.buildAjdList(deps);
        LinkedList<String> order = new LinkedList<>();

        while ajdList not empty {
            for key in ajdList keys {

                if (key.value.length == 0) {
                    for key in ajdList keys {
                        pop key from key.value
                    }
                    remove key and add to buildOrder
                }
            }
        }

        return order;
    }
}
