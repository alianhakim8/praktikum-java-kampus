package com.alian.pertemuan1.latihan.queuelinkedlist;

class Queue2 {
    QNode depan, belakang;

    public Queue2() {
        this.depan = this.belakang = null;
    }

    // Method untuk menambahkan key ke dalam queue
    void enqueue(int key) {

        // buat node baru
        QNode temp = new QNode(key);

        // jika queue kosong, buat node baru
        if (this.belakang == null) {
            this.depan = this.belakang = temp;
            return;
        }

        // tambahkan node baru di akhir queue dan ubah nilai belakang
        this.belakang.next = temp;
        this.belakang = temp;
    }

    // Method untuk menghapus key dari queue
    void dequeue() {
        // jika queue kosong, return null
        if (this.depan == null)
            return;

        // Store nilai depan dan pindahkan depan satu node didepan
        QNode temp = this.depan;
        this.depan = this.depan.next;

        // jika nilai depan null, kemudian ubah nilai belakang juga menjadi NULL
        if (this.depan == null)
            this.belakang = null;
    }
}