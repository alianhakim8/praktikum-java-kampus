package com.alian.pertemuan2.praktikum.argument.latihan;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Integer value1 = Integer.parseInt(args[0]);
        Integer value2 = Integer.parseInt(args[1]);
        int sum = value1 + value2;
        int difference = value1 - value2;
        int product = value1 * value2;
        float quotient = value1.floatValue() / value2.floatValue();

        System.out.println("sum = " + sum);
        System.out.println("difference = " + difference);
        System.out.println("product = " + product);
        System.out.println("quotient = " + quotient);
    }
}
