package com.alian.pertemuan2.praktikum.basisteks.latihan;

import java.io.*;
import java.util.Scanner;

public class FileAppLatihan {

    public static void main(String[] args) {
        int pilihan;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Masukan Pilihan");
        System.out.println("1. Read dan Copy File");
        System.out.println("2. Read file yang sudah di copy");
        System.out.print("Pilihan mu : ");
        pilihan = keyboard.nextInt();
        switch (pilihan) {
            case 1:
                readFile();
                break;
            case 2:
                readCopyFile();
                break;
            default:
                System.out.println("Pilihan tidak valid");
                break;
        }
    }

    private static void readFile() {
        String namaFile;
        System.out.print("Masukan nama file yang akan dibaca : ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            char data;
            int temp;
            boolean done = false;
            namaFile = br.readLine();
            System.out.println("membaca file " + namaFile + "...");
            FileInputStream fis;
            FileOutputStream fos;
            fis = new FileInputStream(namaFile);
            fos = new FileOutputStream(namaFile + ".copy");

            do {
                temp = fis.read();
                data = (char) temp;
                if (temp != -1) {
                    System.out.print(data);
                    if (data == ' ') {
                        fos.write('_');
                    } else {
                        fos.write(data);
                    }
                }
            } while (temp != -1);

        } catch (IOException e) {
            System.out.println("kesalahan saat membaca file");
        }
    }

    private static void readCopyFile() {
        String namaFile;
        System.out.print("Masukan nama file : ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            char data;
            int temp;
            boolean done = false;
            namaFile = br.readLine();
            System.out.println("membaca file " + namaFile + "...");
            FileInputStream fis = new FileInputStream(namaFile);
            do {
                temp = fis.read();
                data = (char) temp;
                if (temp != -1) {
                    System.out.print(data);
                }
            } while (temp != -1);
        } catch (IOException e) {
            System.out.println("ada kesalahan saat membaca file");
        }
    }
}
