package com.Anmol.BinaryTree;

public class Main {
    public static void main(String[] args){

        Tree tree = new Tree();

        tree.insert(7);
        tree.insert(5);
        tree.insert(1);
        tree.insert(4);
        tree.insert(10);
        tree.insert(11);
        tree.orderTraversal();

//        System.out.println(tree.height());
    }
}
