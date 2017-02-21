package ayesh.sorting.utils;

/**
 * Created by ayesh on 2/21/17.
 */
public class Swapper {
    public static void Swap(int[] arr, int from, int to){
        int temp = arr[from];
        arr[from] = arr[to];
        arr[to] = temp;
    }
}
