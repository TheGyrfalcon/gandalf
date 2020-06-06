package com.thegyrfalcon.gandalf.algorithms.search;

import java.util.Arrays;

/**
 * LinearSearch
 * Complexity
 */
public class LinearSearch {

    public static int search(int[] arr, int value) {
        System.out.println("Linear Search on Array "+ Arrays.toString(arr) +" to find value :"+value);
        int index = -1;
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                index = i;
                break;
            }
        }
        return index;
    }

}
