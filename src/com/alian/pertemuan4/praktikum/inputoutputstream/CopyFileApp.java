package com.alian.pertemuan4.praktikum.inputoutputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileApp {
    public static void main(String[] args) {
        String inputFile = "test.txt";
        String outputFile = "test_ouput.txt";
        CopyFileApp copyFileApp = new CopyFileApp();
        copyFileApp.copy(inputFile, outputFile);
    }

    private void copy(String input, String output) {
        FileInputStream inputStream;
        FileOutputStream outputStream;
        int data;
        try {
            inputStream = new FileInputStream(input);
            outputStream = new FileOutputStream(output);
            while ((data = inputStream.read()) != -1) {
                outputStream.write(data);
            }
            inputStream.close();
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
