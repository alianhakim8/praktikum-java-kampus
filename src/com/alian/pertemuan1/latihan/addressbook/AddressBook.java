package com.alian.pertemuan1.latihan.addressbook;

import java.util.ArrayList;

public class AddressBook {
    private ArrayList<Contact> contacts;

    public AddressBook() {
        contacts = new ArrayList<>();
    }

    public void tambahKontak(Contact c) {
        contacts.add(c);
    }

    public void tampilkanKontak() {
        for (int i = 0; i < contacts.size(); i++) {
            System.out.println("-----------------------------------");
            System.out.println("Nama\t\t: " + contacts.get(i).getNama());
            System.out.println("Umur\t\t: " + contacts.get(i).getUmur());
            System.out.println("No Telepon\t: " + contacts.get(i).getNoTelepon());
            System.out.println("-----------------------------------");
        }
    }

    public int jumlahKontak() {
        return contacts.size();
    }

    private int haveContact(String s) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getNama().equals(s)) {
                return i;
            }
        }
        return -1;
    }

    public void hapusKontak(String s) {
        int posisi = haveContact(s);
        if (posisi >= 0) {
            contacts.remove(posisi);
        }
    }
}
