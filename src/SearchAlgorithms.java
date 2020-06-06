import com.thegyrfalcon.gandalf.algorithms.search.LinearSearch;

/**
 * Search Algorithms
 * 1.Linear Search
 */
public class SearchAlgorithms {

    public static void run() {

        System.out.println("\n---------- Linear Search ----------");
        int[] ls_arr = { 25, 9, 33, -30, 50, 5, 5 };
        int ls_index = LinearSearch.search(ls_arr, 33 );
        System.out.println("[Linear Search] value found at index :"+ls_index);
    }
}
