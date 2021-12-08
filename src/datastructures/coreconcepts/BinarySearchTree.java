package datastructures.coreconcepts;

import java.util.ArrayList;

public class BinarySearchTree {
    Node root;

    BinarySearchTree() {
        root = null;
    }

    static class Node {
        int key;
        Node left, right;
        String data;

        Node (int key, String data) {
            this.key = key;
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    Node search(int key) {
        Node foundNode = searchRec(root, key);
        return foundNode;
    }

    Node searchRec(Node root, int key) {
        if (root == null || root.key == key) {
            return root;
        }

        if (root.key < key) {
            return searchRec(root.right, key);
        } else {
            return searchRec(root.left, key);
        }
    }

    void insert(int key, String data) {
        root = insertRec(root, key, data);
    }

    Node insertRec(Node root, int key, String data) {
        if (root == null) {
            root = new Node(key, data);
            return root;
        }

        if (key < root.key) {
            root.left = insertRec(root.left, key, data);
        } else if (key > root.key) {
            root.right = insertRec(root.right, key, data);
        }

        return root;
    }

    ArrayList<Integer> inOrder() {
        ArrayList<Integer> keys = new ArrayList<>();
        keys = inOrderRec(root, keys);
        return keys;
    }

    ArrayList<Integer> inOrderRec(Node root, ArrayList<Integer> list) {
        if (root != null) {
            inOrderRec(root.left, list);
            list.add(root.key);
            inOrderRec(root.right, list);
        }

        return list;
    }

    
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        
        bst.insert(30, "30");
        bst.insert(50, "50");
        bst.insert(15, "15");
        bst.insert(20, "20");
        bst.insert(10, "10");
        bst.insert(40, "40");
        bst.insert(60, "60");
        bst.inOrder();

        System.out.println(bst.inOrder().toString());
    }
}