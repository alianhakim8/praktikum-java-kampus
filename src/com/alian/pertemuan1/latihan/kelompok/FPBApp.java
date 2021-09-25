package com.alian.pertemuan1.latihan.kelompok;

import java.util.Scanner;

public class FPBApp {

    public static void main(String[] args) {
        int number1;
        int number2;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Masukan angka pertama : ");
        number1 = keyboard.nextInt();
        System.out.print("Masukan angka kedua : ");
        number2 = keyboard.nextInt();

        int result = fpbRecursive(number1, number2);
        int resultIterate = fpbIterasi(number1, number2);

        System.out.println("===============================");
        System.out.println("FPB Menggunakan Iterasi");
        System.out.println("FPB dari " + number1 + " dan " + number2 + " adalah " + resultIterate);
        System.out.println("===============================");
        System.out.println("FPB Menggunakan Rekursif");
        System.out.println("FPB dari " + number1 + " dan " + number2 + " adalah " + result);
    }

    public static int fpbIterasi(int number1, int number2) {
        int result;
        while (number2 != 0) {
            result = number2;
            number2 = number1 % number2;
            number1 = result;
        }
        return number1;
    }

    public static int fpbRecursive(int number1, int number2) {
        if (number2 != 0) {
            return fpbRecursive(number2, number1 % number2);
        }
        return number1;
    }
}
