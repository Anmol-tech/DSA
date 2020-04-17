package com.Anmol.BinaryTree;

public class Tree {
    private Node root;
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

    boolean find(int value){
        var current = root;
        if(current == null)
            throw new EmptyTreeException();
        while(current != null) {
            if (current.value == value)
                return true;
            if(current.value > value)
                current = current.left;
            else
                current = current.right;
        }
        return false;
    }

    public void traversalPreOrder(){
        traversalPreOrder(root);
    }
    private void traversalPreOrder(Node root){
        if(root == null)
            return;

        System.out.print(root.value + " ");
        traversalPreOrder(root.left);
        traversalPreOrder(root.right);
    }

    public void traversalInOrder(){
        traversalInOrder(root);
    }
    private void traversalInOrder(Node root){
        if(root == null)
            return;

        traversalPreOrder(root.left);
        System.out.print(root.value + " ");
        traversalPreOrder(root.right);
    }

    public void traversalPostOrder(){
        traversalPostOrder(root);
    }
    private void traversalPostOrder(Node root){
        if(root == null)
            return;

        traversalPreOrder(root.left);
        traversalPreOrder(root.right);
        System.out.print(root.value + " ");
    }
}

