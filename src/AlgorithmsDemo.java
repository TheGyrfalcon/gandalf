import com.thegyrfalcon.gandalf.algorithms.sort.BubbleSort;

import java.util.ArrayList;
import java.util.Arrays;

public class AlgorithmsDemo {

    public static void main(String[] args) {
        System.out.println("*************** Algorithms Demo ***************");

        System.out.println("---------- START: Search Algorithms ----------");
        System.out.println("---------- END:   Search Algorithms ----------");

        System.out.println("\n---------- START: Sort Algorithms ----------\n");

        // Bubble Sort
        System.out.println("\n---------- Bubble Sort ----------\n");
        int[] values = { 25, 9, 33, -30, 50, 5 };
        System.out.println("Before Sort :"+ Arrays.toString(values));
        BubbleSort.sort(values);
        System.out.println("After Sort  :"+ Arrays.toString(values));

        System.out.println("---------- END:   Sort Algorithms ----------");
    }
}
