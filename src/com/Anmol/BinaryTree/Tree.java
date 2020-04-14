package com.Anmol.BinaryTree;

public class Tree {
    private Node root;

    void insert(int value) {
        var node = new Node(value);
        if (root == null) {
            root = node;
            return;
        }
        var current = root;
        while (true) {
            if (current.value < value) {
                if (current.right == null) {
                    current.right = node;
                    break;
                }
                current = current.right;
            }
            else {
                if (current.left == null) {
                    current.left = new Node(value);
                    break;
                }
                current = current.left;
            }
        }
    }

    private class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node = " + value;
        }
    }
}
