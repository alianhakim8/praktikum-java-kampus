package com.alian.pertemuan1.latihan.kelompok.addressbookkel;

public class AddressBook {
    //attribut

    int nbElement;
    AddressPage [] addressPages;
    final int MAX_ELEMENT = 5;

    public AddressBook(){
        addressPages = new AddressPage[MAX_ELEMENT];
        nbElement = 0;
    }
//    public int addElement(AddressPage A){
//        if (nbElement (nbElement-1)) && idx>=0) {
//            return null;
//        } else {
//            return addressPages[idx];
//        }
//    }
    public void printAllElement(){
        int i;
        for (i=0;i<=nbElement-1;i++) {
            System.out.println("Elemen ke -" + i);
            System.out.println(addressPages[i]);
        }
    }
}
