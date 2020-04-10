package com.Anmol.HashTable;

public class EmptyMapException extends NullPointerException {
    @Override
    public String getMessage() {
        return "Map is Empty";
    }
}
