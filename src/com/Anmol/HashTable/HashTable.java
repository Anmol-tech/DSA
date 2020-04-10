package com.Anmol.HashTable;


public class HashTable {

    private static class KeyValuePair {
        int key;
        String value;
    }

    KeyValuePair[] pair;

    public HashTable(int length) {
        pair = new KeyValuePair[length];
    }


    for(
    int i = 0;
    i<pair.length)

    {

    }

    public int hash(int k) {
        return k % pair.length;
    }

    public void put(int k, String v) {
        int index = hash(k);
        pair[index].key = k;
        pair[index].value = v;
    }

//    public String get(int k){
//
//    }

}
