import com.thegyrfalcon.gandalf.algorithms.sort.BubbleSort;
import com.thegyrfalcon.gandalf.algorithms.sort.MergeSort;
import com.thegyrfalcon.gandalf.algorithms.sort.SelectionSort;

import java.util.Arrays;

public class AlgorithmsDemo {

    public static void main(String[] args) {
        System.out.println("*************** Algorithms Demo ***************");

        System.out.println("---------- START: Search Algorithms ----------");
        System.out.println("---------- END:   Search Algorithms ----------");

        System.out.println("\n---------- START: Sort Algorithms ----------\n");

        // Bubble Sort
        System.out.println("\n---------- Bubble Sort ----------\n");
        int[] bs_arr = { 25, 9, 33, -30, 50, 5, 5 };
        System.out.println("Before Sort :"+ Arrays.toString(bs_arr));
        BubbleSort.sort(bs_arr);
        System.out.println("After Sort  :"+ Arrays.toString(bs_arr));

        // Selection Sort
        System.out.println("\n---------- Selection Sort ----------\n");
        int[] ss_arr = { 30, 14, 36, -60, 10, 5, 5 };
        System.out.println("Before Sort :"+ Arrays.toString(ss_arr));
        SelectionSort.sort(ss_arr);
        System.out.println("After Sort  :"+ Arrays.toString(ss_arr));

        System.out.println("\n---------- END:   Sort Algorithms ----------\n");

        // Merge Sort
        System.out.println("\n---------- Merge Sort ----------\n");
        int[] ms_arr = { 20, 4, 26, -50, 1, 5, 5 };
        System.out.println("Before Sort :"+ Arrays.toString(ms_arr));
        MergeSort.sort(ms_arr);
        System.out.println("After Sort  :"+ Arrays.toString(ms_arr));

        System.out.println("\n---------- END:   Sort Algorithms ----------\n");
    }
}
