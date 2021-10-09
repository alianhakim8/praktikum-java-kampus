package com.alian.pertemuan4.praktikum;

import java.io.*;

public class CopyFile {
    void copy(String input, String output) {
        BufferedWriter writer;
        BufferedReader reader;
        String data;
        try {
            reader = new BufferedReader(new FileReader(input));
            writer = new BufferedWriter(new FileWriter(output));
            while ((data = reader.readLine()) != null) {
                writer.write(data, 0, data.length());
            }

            // 12.7
            reader.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String inputFile = "test.txt";
        String outputFile = "test_output.txt";
        CopyFile cf = new CopyFile();
        cf.copy(inputFile, outputFile);
    }
}
