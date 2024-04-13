package com.sunbeam;
import java.util.Comparator;

public class SelectionSort {
    public static void main(String[] args) {
        Integer[] arr = {5, 3, 8, 1, 2, 7, 4, 6};

        System.out.println("Before sorting:");
        printArray(arr);

        selectionSort(arr, Integer::compareTo);

        System.out.println("After sorting:");
        printArray(arr);
    }

    static <T> void selectionSort(T[] arr, Comparator<? super T> comparator) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (comparator.compare(arr[i], arr[j]) > 0) {
                    T temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    static <T> void printArray(T[] arr) {
        for (T item : arr) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
