package com.Anmol.HashTable;

public class Main {

    public static void main(String[] args) {
        HashTable map = new HashTable(5);
        map.put(3, "hello");
        map.put(4, "bye");
        map.put(8, "hi");
        map.remove(8);
        System.out.println(map.get(4));

    }
}
