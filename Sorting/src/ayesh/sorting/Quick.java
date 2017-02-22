package ayesh.sorting;

import ayesh.sorting.utils.Swapper;

public class Quick {

    public static void Sort(int[] array){
        quickSort(array, 0, array.length - 1);
    }

    private static void quickSort(int[] array, int low, int high){
        if(array == null || array.length == 0 )
            return;
        else {
            if(low < high){
                int pivot = partition(array, low, high);
                quickSort(array, low, pivot-1);
                quickSort(array, pivot+1, high);
            }else{
                return;
            }
        }
    }

    private static int partition(int[] array, int low, int high){
        int value = array[high];
        int i = low - 1;
        for(int j = low; j <= high; j++){
            if(array[j] < value){
                Swapper.Swap(array, ++i, j);
            }
        }
        Swapper.Swap(array, i+1, high);
        return i+1;
    }

}
