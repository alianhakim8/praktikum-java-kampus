package com.alian.pertemuan1.latihan.queue;

public class Queue {
    private static int depan, belakang, kapasitas;
    private static int[] queue;

    public Queue(int k) {
        depan = belakang = 0;
        kapasitas = k;
        queue = new int[kapasitas];
    }

    public static void tambahQueue(int data) {
        // cek apakah queue penuh atau tidak
        if (kapasitas == belakang) {
            System.out.println("\nQueue Penuh");
        } else {
            // tambah element ke belakang
            queue[belakang] = data;
            belakang++;
        }
    }

    public static void hapusQueue() {
        // cek apakah queue kosong
        if (depan == belakang) {
            System.out.println("\nQueue kosong");
        } else {
            for (int i = 0; i < belakang - 1; i++) {
                queue[i] = queue[i + 1];
            }

            if (belakang < kapasitas) {
                queue[belakang] = 0;
            }

            belakang--;
        }
    }

    public static void tampilkanQueue() {
        int i;
        if (depan == belakang) {
            System.out.println("\nQueue Kosong");
        }
        for (i = depan; i < belakang; i++) {
            System.out.printf("%d <---", queue[i]);
        }
    }

    public static void tampilkanQueueDepan() {
        if (depan == belakang) {
            System.out.println("\nQueue kosong");
        } else {
            System.out.printf("Elemen depan adalah : %d", queue[depan]);
        }
    }
}
