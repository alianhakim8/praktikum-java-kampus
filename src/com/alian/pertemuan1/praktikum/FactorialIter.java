package com.alian.pertemuan1.praktikum;

public class FactorialIter {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorial(n));
    }

    static int factorial(int n) {
        int result = 1;
        for (int i = n; i > 1; i--) {
            result *= i;
        }
        return result;
    }
}
