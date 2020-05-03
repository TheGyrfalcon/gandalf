package com.thegyrfalcon.gandalf.algorithms.sort;

/**
 * @author - Abhishek Saseendran
 * BubbleSort
 * Runtime Complexity - n^2
 */
public class BubbleSort {

    /**
     *
     * @param arr
     * @return arr
     */
    public static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < (arr.length -1 -i); j++) {
                if(arr[j] > arr[j+1]) {
                    int lesser = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = lesser;
                }
            }
        }
        return arr;
    }

}
