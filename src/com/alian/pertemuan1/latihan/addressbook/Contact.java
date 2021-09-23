package com.alian.pertemuan1.latihan.addressbook;

public class Contact {
    private String nama;
    private int umur;
    private int noTelepon;

    public Contact(String n, int u, int no) {
        nama = n;
        umur = u;
        noTelepon = no;
    }

    // ubah no telepon contact
    public void ubahNomor(int nomorBaru) {
        noTelepon = nomorBaru;
    }

    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    public int getNoTelepon() {
        return noTelepon;
    }
}
