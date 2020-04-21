package com.Anmol.BinaryTree;

public class Main {
    public static void main(String[] args){

        Tree tree = new Tree();
        Tree tree2 = new Tree();

        tree.insert(4);
        tree.insert(5);
        tree.insert(1);
        tree.insert(7);
        tree.insert(10);
        tree.insert(11);

        tree2.insert(20);
        tree2.insert(10);
        tree2.insert(30);
        tree2.insert(6);
        tree2.insert(21);
        tree2.insert(4);
        tree2.insert(3);
        tree2.insert(8);

        System.out.println(tree2.minValue());
    }
}
