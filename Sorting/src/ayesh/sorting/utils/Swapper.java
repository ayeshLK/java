package ayesh.sorting.utils;

public class Swapper {
    public static void Swap(int[] arr, int from, int to){
        int temp = arr[from];
        arr[from] = arr[to];
        arr[to] = temp;
    }
}
