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

    }

    public static LinkedList<String> getBuildOrder(ArrayList<Dependency> deps) {

    }
}
