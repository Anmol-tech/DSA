package com.Anmol.BinaryTree;

public class EmptyTreeException extends NullPointerException{
    @Override
    public String getMessage() {
        return "Tree is Empty";
    }
}
