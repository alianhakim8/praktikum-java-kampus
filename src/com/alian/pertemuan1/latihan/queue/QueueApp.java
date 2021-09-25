package com.alian.pertemuan1.latihan.queue;

public class QueueApp {
    public static void main(String[] args) {
        // membuat queue dengan kapasitas 4
        Queue q = new Queue(4);

        // menampilkan element queue
        q.tampilkanQueue();

        // menambahkan element ke dalam queue
        q.tambahQueue(20);
        q.tambahQueue(30);
        q.tambahQueue(40);
        q.tambahQueue(50);

        // tampilkan queue
        q.tampilkanQueue();

        // tambahkan element queue
        q.tambahQueue(100);

        // tampilkan lagi queue
        q.tampilkanQueue();

        q.hapusQueue();
        q.hapusQueue();
        System.out.println("\ndua node queue telah di hapus");

        // tampilkan element queue
        q.tampilkanQueue();

        // tampilkan depan queue
        q.tampilkanQueueDepan();

    }
}
