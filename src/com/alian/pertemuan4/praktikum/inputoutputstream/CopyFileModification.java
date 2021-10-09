package com.alian.pertemuan4.praktikum.inputoutputstream;

import java.io.*;

public class CopyFileModification {
    public static void main(String[] args) {
        String inputFile = "test.txt";
        CopyFileModification cf = new CopyFileModification();
        cf.copy(inputFile);
    }

    private void copy(String input) {
        PushbackInputStream inputStream;
        PrintStream outputStream;
        int data;
        try {
            inputStream = new PushbackInputStream(new FileInputStream(input));
            outputStream = new PrintStream(System.out);
            while ((data = inputStream.read()) != -1) {
                outputStream.println("Read data : " + (char) data);
                inputStream.unread(data);
                data = inputStream.read();
                outputStream.println("Unread data :  " + (char) data);
            }
            inputStream.close();
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
