import com.thegyrfalcon.gandalf.algorithms.search.BinarySearch;
import com.thegyrfalcon.gandalf.algorithms.search.LinearSearch;

/**
 * Search Algorithms
 * 1.Linear Search
 * 2.Binary Search
 */
public class SearchAlgorithms {

    public static void run() {

        System.out.println("\n---------- Linear Search ----------");
        int[] ls_arr = { 25, 9, 33, -30, 50, 5, 5 };
        int ls_index = LinearSearch.search(ls_arr, 33 );
        System.out.println("[Linear Search] value found at index :"+ls_index);

        System.out.println("\n---------- Binary Search ----------");
        int[] bs_arr = { 10, 12, 14, 16, 18, 20, 22 };
        int bs_index = BinarySearch.search(bs_arr, 20 , true);
        System.out.println("[Binary Search] value found at index :"+bs_index);

    }
}
