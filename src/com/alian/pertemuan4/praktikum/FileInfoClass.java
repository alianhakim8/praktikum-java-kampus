package com.alian.pertemuan4.praktikum;

import java.io.File;
import java.util.Scanner;

public class FileInfoClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter filename : ");
        String fileName = scanner.nextLine();
        File fn = new File(fileName);
        System.out.println("Name : " + fn.getName());
        if (!fn.exists()) {
            System.out.println(fileName + " does not exists");
            System.out.println("creating tempt directory...");
            fileName = "temp";
            fn = new File(fileName);
            fn.mkdir();
            System.out.println(fileName + (fn.exists() ? " exists" : " does not exist"));
            System.out.println("Deleting tempt directory...");
            fn.delete();
            System.out.println(fileName + (fn.exists() ? " exists" : " does not exist"));
            return;
        }
        System.out.println(fileName + " is a " + (fn.isFile() ? "file." : " directory."));
        if (fn.isDirectory()) {
            String[] content = fn.list();
            System.out.println("The content of this directory: ");
            for (int i = 0; i < content.length; i++) {
                System.out.println(content[i]);
            }
        }

        if (!fn.canRead()) {
            System.out.println(fileName + " is not readable");
            return;
        }

        System.out.println(fileName + " is " + fn.length() + " byte long");
        System.out.println(fileName + " is " + fn.lastModified());

        if (!fn.canWrite()) {
            System.out.println(fileName + " is not writable.");
        }
    }
}
