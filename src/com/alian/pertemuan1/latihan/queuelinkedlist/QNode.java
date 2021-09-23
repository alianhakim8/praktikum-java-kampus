package com.alian.pertemuan1.latihan.queuelinkedlist;

class QNode {
    int key;
    QNode next;

    // constructor untuk membuat linkedlist node
    public QNode(int key) {
        this.key = key;
        this.next = null;
    }
}