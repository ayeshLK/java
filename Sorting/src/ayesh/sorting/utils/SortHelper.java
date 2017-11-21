package ayesh.sorting.utils;

public final class SortHelper {
    public static void printArray(int[] arr){
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void Swap(int[] arr, int from, int to){
        int temp = arr[from];
        arr[from] = arr[to];
        arr[to] = temp;
    }
}
