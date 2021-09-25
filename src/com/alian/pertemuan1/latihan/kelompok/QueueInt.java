
package com.alian.pertemuan1.latihan.kelompok;

public class QueueInt {
    int[] ar = new int [10];
    int top = -1;
    int down = 0;
    
    public void enqueue(int angka){
        if(!isFull()){
            top++; // TOP DI NAIKAN
            ar[top] = angka; // ANGKA DI ISIKAN
            System.out.println("Angka " + angka + " berhasil di enqueue");
        }else{
            System.out.println("Antrian penuh");
        }
    }
    
    public void dequeue(){
        if(!isEmpty()){
            int indexDown = down;
            down++; // DOWN DI NAIKAN
            System.out.println("Antrian indek " + indexDown  + " berhasil di dequeue");
        }else{
            System.out.println("Antrian kosong");
        }
    }
    
    public void view(){
        if(!isEmpty()){  
            System.out.print("Isi Antrian sekarang : ");
            for (int i = down; i <= top; i++) {
                System.out.print( ar[i] + " ");
            }
            System.out.println("");
        }else{
            System.out.println("Antrian kosong");
        }
    }
    
    
    boolean isFull(){
        if(top == ar.length){
            return true;
        }
        return false;
    }
    
    boolean isEmpty(){
        if(top == -1){
            return true;
        }
        return false;
    }
    public static void main(String [] args){
        QueueInt ka = new QueueInt();
        
        ka.enqueue(4);
        ka.enqueue(5);
        ka.enqueue(6);
        ka.view();
        ka.dequeue();
        ka.view();
    }
}

    
   

