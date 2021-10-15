package com.alian.pertemuan4.praktikum.algoritma;

public class AlgoritmaApp {
    public static void main(String[] args) {

    }

    void insertionSort(Object[] array, int startIndex, int endIndex) {
        for (int i = startIndex; i < endIndex; i++) {
            int k = i;
            for (int j = i + 1; j < endIndex; j++) {
                if (((Comparable) array[k]).compareTo(array[j]) > 0) {
                    k = j;
                }
            }
//            swap(array[i], array[k]);
        }
    }

    void selectionSort(Object[] array, int startIndex, int endIndex) {
        int min;
        for (int i = startIndex; i < endIndex; i++) {
            min = i;
            for (int j = i + 1; j < endIndex; j++) {
                if (((Comparable) array[min]).compareTo(array[j]) > 0) {
                    min = j;
                }
            }
//            swap(array[min], array[i]);
        }
    }

//    void mergeSort(Object[] array, int startIndex, int endIndex) {
//        if (array.length != 1) {
//            mergeSort(leftArr, startIndex, midIdx);
//            mergeSort(rightArr, midIdx+1, endIndex);
//            combine(leftArr, rightArr);
//        }
//    }
//
//    void quickSort(Object[] array, int leftIdx, int rightIdx) {
//        int pivotIdx;
//        if (rightIdx > leftIdx) {
//            pivotIdx = partition(array, leftIdx, rightIdx);
//            quickSort(array, leftIdx, pivotIdx-1);
//            quickSort(array, pivotIdx+1, rightIdx);
//        }
//    }
}
