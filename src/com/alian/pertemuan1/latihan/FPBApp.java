package com.alian.pertemuan1.latihan;

public class FPBApp {

    public static void main(String[] args) {
        System.out.println(fpbIterasi(12, 8));
        System.out.println(fpbRecursive(12, 8));
    }

    public static int fpbIterasi(int x, int y) {
        int result;
        while (y != 0) {
            result = y;
            y = x % y;
            x = result;
        }
        return x;
    }

    public static int fpbRecursive(int x, int y) {
        if (x == 0) {
            return y;
        }
        return fpbRecursive(x % y, x);
    }
}
