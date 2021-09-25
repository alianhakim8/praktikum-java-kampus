package com.alian.pertemuan1.praktikum;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListDemo {
    public static void main(String args[]) {
        ArrayList al = new ArrayList(2);
        System.out.println(al + ", size = " + al.size());
        al.add("R");
        al.add("U");
        al.add("O");
        System.out.println(al + ", size = " + al.size());
        al.remove("U");
        System.out.println(al + ", size = " + al.size());
        ListIterator li = al.listIterator();
        while (li.hasNext())
            System.out.println(li.next());
        Object a[] = al.toArray();
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
