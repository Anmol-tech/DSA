package com.Anmol.HashTable;


public class HashTable {

    private static class KeyValuePair {
        int key;
        String value;
        KeyValuePair next;

        @Override
        public String toString() {
            return key + "=" + value;
        }
    }

    KeyValuePair[] pair;

    public HashTable(int length) {
        pair = new KeyValuePair[length];
        addressInitializer();
    }

    public void addressInitializer() {
        for (int i = 0; i < pair.length; i++) {
            pair[i] = new KeyValuePair();
        }
    }

    public void remove(int k) {
        if (pair[hash(k)] == null)
            throw new EmptyMapException();

        KeyValuePair current = pair[hash(k)];
        while (current.next.next != null)
            current = current.next;
        current.value = "";
    }

    public int hash(int k) {
        return k % pair.length;
    }

    public void put(int k, String v) {
        KeyValuePair current = pair[hash(k)];
        if (pair[hash(k)] == null) {
            current.key = k;
            current.value = v;
        } else {
            while (current.next != null)
                current = current.next;
            current.value = v;
            current.key = k;
        }
    }

    public KeyValuePair get(int k) {
        if (pair[hash(k)].key == 0)
            throw new EmptyMapException();

        KeyValuePair current = pair[hash(k)];
        while (current.next != null) {
            current = current.next;
        }
        return current;
    }


}
