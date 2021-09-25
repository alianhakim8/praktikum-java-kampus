package com.alian.pertemuan2.praktikum.basisteks;

import java.io.*;

public class FileApp {
    public static void main(String[] args) {
        readFile();
        writeFile();
    }

    private static void readFile() {
        String fileName;
        System.out.println("What is the name of the file to read from ?");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            fileName = br.readLine();
            System.out.println("Now reading from " + fileName + "...");
            FileInputStream fis = null;
            fis = new FileInputStream(fileName);
            char data;
            int temp;
            do {
                temp = fis.read();
                data = (char) temp;
                if (temp != -1) {
                    System.out.println(data);
                }
            } while (temp != -1);
        } catch (IOException e) {
            System.out.println("problem in reading from the file.");
        }
    }

    private static void writeFile() {
        String filename;
        int data;
        boolean done = false;
        System.out.println("What is the name of the file to be written do ?");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            filename = br.readLine();
            System.out.println("Enter data to write to " + filename + "...");
            FileOutputStream fos = null;
            fos = new FileOutputStream(filename);
            do {
                data = br.read();
                if ((char) data == 'q') {
                    data = br.read();
                    if ((char) data == '$') {
                        done = true;
                    } else {
                        fos.write('q');
                        fos.write(data);
                    }
                } else {
                    fos.write(data);
                }
            } while (!done);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
