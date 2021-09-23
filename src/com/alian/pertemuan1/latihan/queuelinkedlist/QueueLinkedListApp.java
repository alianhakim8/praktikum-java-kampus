package com.alian.pertemuan1.latihan.queuelinkedlist;

public class QueueLinkedListApp {
    public static void main(String[] args) {
        Queue2 q = new Queue2();
        q.enqueue(10);
        q.enqueue(20);
        q.dequeue();
        q.dequeue();
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.dequeue();
        System.out.println("Queue Front : " + q.depan.key);
        System.out.println("Queue Rear : " + q.belakang.key);
    }
}
