package com.Anmol.HashTable;

public class EmptyKeyException extends NullPointerException {
    @Override
    public String getMessage() {
        return "Key is Empty";
    }
}
