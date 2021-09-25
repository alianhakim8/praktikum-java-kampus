package com.alian.pertemuan2.praktikum.basisteks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GreetUser {
    public static void main(String[] args) {
        System.out.println("Hi, what's your name ?");
        String name;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            name = br.readLine();
            System.out.println("Nice to meet you, " + name + "! : ");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
