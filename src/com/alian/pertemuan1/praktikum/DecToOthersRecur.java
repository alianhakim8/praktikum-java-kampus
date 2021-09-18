package com.alian.pertemuan1.praktikum;

public class DecToOthersRecur {
    static void printBase(int num, int base) {
        String digits = "0123456789abcdef";
        /* Langkah Rekursif*/
        if (num >= base) {
            printBase(num/base, base);
        }
        /* Base case: num < base */
        System.out.print(digits.charAt(num%base));
    }
    public static void main(String args[]) {
        int num = 10;
        int base = 8;
        printBase(num, base);
    }
}
