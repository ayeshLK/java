package ayesh.sorting;

import ayesh.sorting.utils.SortHelper;

public class Insertion {

    public static void Sort(int[] array){
        for(int i = 0; i < array.length; i++){
            for(int j = i; j > 0; j--){
                if(array[j] < array[j-1]){
                    SortHelper.Swap(array, j, j-1);
                }
            }
        }
    }

}
