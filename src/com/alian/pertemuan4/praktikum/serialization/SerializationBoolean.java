package com.alian.pertemuan4.praktikum.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SerializationBoolean {

    SerializationBoolean() {
        Boolean booleanData = new Boolean("true");

        try {
            FileOutputStream fos = new FileOutputStream("boolean.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(booleanData);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SerializationBoolean sb = new SerializationBoolean();
    }
}
