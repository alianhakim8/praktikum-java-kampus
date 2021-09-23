package com.alian.pertemuan1.latihan.addressbook;

import java.util.Scanner;

public class AddressBookApp {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // membuat objek addressbook
        AddressBook addressBook = new AddressBook();

        // tampilkan menu
        menu();
        int pilihan = keyboard.nextInt();
        while (pilihan != 5) {
            switch (pilihan) {
                case 1:
                    if (addressBook.jumlahKontak() < 10) {
                        System.out.print("Masukan Nama : ");
                        String nama = keyboard.next();
                        System.out.print("Masukan umur : ");
                        int umur = keyboard.nextInt();
                        System.out.print("Masukan No Telepon : ");
                        int noTelepon = keyboard.nextInt();
                        addressBook.tambahKontak(new Contact(nama, umur, noTelepon));
                    } else {
                        System.out.println("Address book penuh");
                    }
                    break;
                case 2:
                    System.out.println("Masukan nama yang ingin di hapus : ");
                    String name = keyboard.nextLine();
                    addressBook.hapusKontak(name);
                    break;
                case 3:
                    System.out.println("Jumlah ada " + addressBook.jumlahKontak() + " kontak");
                    break;
                case 4:
                    addressBook.tampilkanKontak();
                    break;
                default:
                    System.out.println("pilihan tidak valid");
            }
            menu();
            pilihan = keyboard.nextInt();
        }
    }

    public static void menu() {
        System.out.println("1. Tambahkan kontak baru ke address book");
        System.out.println("2. Hapus kontak dari address book");
        System.out.println("3. tampilkan jumlah kontak");
        System.out.println("4. tampilkan semua informasi kontak");
        System.out.println("5. keluar");
        System.out.print("Masukan pilihan : ");
    }
}
