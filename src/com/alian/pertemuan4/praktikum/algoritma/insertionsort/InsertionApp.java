package com.alian.pertemuan4.praktikum.algoritma.insertionsort;

public class InsertionApp {
    void insertionSort(Object[] array, int startIdx, int endIdx) {
        for (int i = startIdx; i < endIdx; i++) {
            int k = i;
            for (int j = i++; j < endIdx; j++){
                if (((Comparable) array[k]).compareTo(array[j])>0) {
                    k = j;
                }
            }
//            swap(array[i],array[k]);
        }
    }
}
