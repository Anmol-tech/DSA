package com.Anmol.Linklist;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Linklist list = new Linklist();
        list.addLast(10);
        list.addLast(20);
        list.addLast(40);
        list.addFirst(30);
//        list.addFirst(12);
        System.out.println(Arrays.toString(list.toArray()));
        System.out.println(list.getKthFromTheEnd(2));
        list.printMiddle();
    }
}
