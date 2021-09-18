package com.alian.pertemuan1.praktikum;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String args[]) {
        HashSet hs = new HashSet(5, 0.5f);
        System.out.println(hs.add("one"));
        System.out.println(hs.add("two"));
        System.out.println(hs.add("one"));
        System.out.println(hs.add("three"));
        System.out.println(hs.add("four"));
        System.out.println(hs.add("five"));
        System.out.println(hs);
    }
}
