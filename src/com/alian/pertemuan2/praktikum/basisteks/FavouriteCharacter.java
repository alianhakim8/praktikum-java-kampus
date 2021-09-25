package com.alian.pertemuan2.praktikum.basisteks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FavouriteCharacter {
    public static void main(String[] args) {
        System.out.println("Hi, what's your favourite character ?");
        char favChar;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            favChar = (char) br.read();
            System.out.println(favChar + " is a good choice !");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
