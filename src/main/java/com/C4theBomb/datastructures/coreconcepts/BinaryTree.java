package com.C4theBomb.datastructures.coreconcepts;

import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayList;

public class BinaryTree {
    Node root;

    BinaryTree() {
        root = null;
    }

    static class Node {
        int key;
        Node left, right;
        String data;

        Node(int key, String data) {
            this.key = key;
            this.data = data; 
            this.left = null;
            this.right = null;
        }
    }
    

    ArrayList<Integer> levelOrder() {
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node tempNode = queue.poll();
            list.add(tempNode.key);

            if (tempNode.left != null) {
                queue.add(tempNode.left);
            }
            
            if (tempNode.right != null) {
                queue.add(tempNode.right);
            }
        }

        return list;
    }

    ArrayList<Integer> inOrderRecursive() {
        ArrayList<Integer> list = new ArrayList<>();
        
        if (root == null) {
            return list;
        }

        inOrder(list, root);

        return list;
    }

    void inOrder(ArrayList<Integer> list, Node root) {
        if (root == null) {
            return;
        }

        inOrder(list, root.left);
        list.add(root.key);
        inOrder(list, root.right);
    }

    ArrayList<Integer> inOrderMorris() {
        ArrayList<Integer> list = new ArrayList<>();
        Node current = root;
        Node pre = null;
        
        while (current != null) {
            if (current.left == null) {
                list.add(current.key);
                current = current.right;
            } else {
                pre = current.left;

                while (pre.right != null && pre.right != current) {
                    pre = pre.right;
                }

                if (pre.right == null) {
                    pre.right = current;
                    current = current.left;
                } else {
                    pre.right = null;
                    list.add(current.key);
                    current = current.right;
                }
            }
        }

        return list;
    }

    ArrayList<Integer> preOrderRecursive() {
        ArrayList<Integer> list = new ArrayList<>();
        
        if (root == null) {
            return list;
        }

        preOrder(list, root);

        return list;
    }

    void preOrder(ArrayList<Integer> list, Node root) {
        if (root == null) {
            return;
        }

        list.add(root.key);
        preOrder(list, root.left);
        preOrder(list, root.right);
    }

    ArrayList<Integer> preOrderMorris() {
        ArrayList<Integer> list = new ArrayList<>();
        Node current = root;
        Node pre = null;

        while (current != null) {
            if (current.left == null) {
                list.add(current.key);
                current = current.right;
            } else {
                pre = current.left;

                while (pre.right != null && pre.right != current) {
                    pre = pre.right;
                }

                if (pre.right == null) {
                    pre.right = current;
                    list.add(current.key);
                    current = current.left;
                } else {
                    pre.right = null;
                    current = current.right;
                }
            }
        }


        return list;
    }

    ArrayList<Integer> postOrderRecursive() {
        ArrayList<Integer> list = new ArrayList<>();
        
        if (root == null) {
            return list;
        }

        postOrder(list, root);

        return list;
    }

    void postOrder(ArrayList<Integer> list, Node root) {
        if (root == null) {
            return;
        }

        inOrder(list, root.left);
        inOrder(list, root.right);
        list.add(root.key);
    }

    void insert(int key, String data) {
        Node current = root;

        if (current == null) {
            current = new Node(key, data);
            return;
        }

        Queue<Node> queue = new LinkedList<Node>();
        queue.add(current);

        while (!queue.isEmpty()) {
            current = queue.poll();

            if (current.left == null) {
                current.left = new Node(key, data);
                break;
            } else {
                queue.add(current.left);
            }

            if (current.right == null) {
                current.right = new Node(key, data);
                break;
            } else {
                queue.add(current.right);
            }
        }
    }

    void deleteDeepest(Node delNode) {
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        
        Node temp = null;
        
        while (!queue.isEmpty()) {
            temp = queue.poll();
            
            if (temp == delNode) {
                temp = null;
                return;
            }

            if (temp.right != null) {
                if (temp.right == delNode) {
                    temp.right = null;
                    return;
                } else {
                    queue.add(temp.right);
                }
            }
        }
    
        if (temp.left != null) {
            if (temp.left == delNode) {
                temp.left = null;
                return;
            } else {
                queue.add(temp.left);
            }
        }
    }

    void delete(int data) {
        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null) {
            if (root.key == data) {
                root = null;
                return;
            } else {
                return;
            }
        }

        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        Node temp = null, keyNode = null;

        while (!queue.isEmpty()) {
            temp = queue.poll();
            
            if (temp.key == data) {
                keyNode = temp;
            }

            if (temp.left != null) {
                queue.add(temp.left);
            }

            if (temp.right != null) {
                queue.add(temp.right);
            }
        }

        if (keyNode != null) {
            int x = temp.key;
            deleteDeepest(temp);
            keyNode.key = x;
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1, "1");
        tree.root.left = new Node(2, "2");
        tree.root.right = new Node(3, "3");
        tree.root.left.left = new Node(4, "4");
        tree.root.left.right = new Node(5, "5");
 
        // LEVEL ORDER TRAVERSAL ALGORITHMS
        System.out.println("Level order traversal of binary tree is:");
        System.out.println(tree.levelOrder().toString());

        // INORDER TRAVERSAL ALGORITHMS
        // Inorder recursive traversal sacrifices space for time complexity
        System.out.println("Inorder recursive traversal of binary tree is:");
        System.out.println(tree.inOrderRecursive().toString());
        // Inorder Morris traversal sacrifices time for space complexity
        System.out.println("Inorder Morris traversal of binary tree is:");
        System.out.println(tree.inOrderMorris().toString());

        // PREORDER TRAVERSAL ALGORITHMS
        // Preorder recursive traversal sacrifices space for time complexity
        System.out.println("Preorder recursive traversal of binary tree is:");
        System.out.println(tree.preOrderRecursive().toString());
        // Preorder Morris traversal sacrifices time for space complexity
        System.out.println("Preorder Morris traversal of binary tree is:");
        System.out.println(tree.preOrderMorris().toString());

        // POSTORDER TRAVERSAL ALGORITHMS
        System.out.println("Postorder recursive traversal of binary tree is:");
        System.out.println(tree.postOrderRecursive().toString());

        // INSERTION AND DELETEION OPERATIONS
        System.out.println("Inorder after insert 6");
        tree.insert(6, "6");
        System.out.println(tree.inOrderRecursive().toString());
        System.out.println("Inorder after delete 6");
        tree.delete(6);
        System.out.println(tree.inOrderRecursive().toString());
    }
}