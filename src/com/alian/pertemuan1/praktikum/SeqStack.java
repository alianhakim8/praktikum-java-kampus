package com.alian.pertemuan1.praktikum;

public class SeqStack {
    int top = -1;     /* pada permulaan, stack kosong*/
    int memSpace[];   /* penyimpanan untuk integer */
    int limit;        /* ukuran dari memSpace */

    SeqStack() {
        memSpace = new int[10];
        limit = 10;
    }

    SeqStack(int size) {
        memSpace = new int[size];
        limit = size;
    }

    boolean push(int value) {
        top++;
        /* memeriksa apakah stack penuh */
        if (top < limit) {
            memSpace[top] = value;
        } else {
            top--;
            return false;
        }
        return true;
    }

    int pop() {
        int temp = -1;
        /* memeriksa apakah stack kosong */
        if (top >= 0) {
            temp = memSpace[top];
            top--;
        } else {
            return -1;
        }
        return temp;
    }

    public static void main(String args[]) {
        SeqStack myStack = new SeqStack(3);
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
    }
}
