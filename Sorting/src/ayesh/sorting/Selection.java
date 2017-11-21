package ayesh.sorting;

import ayesh.sorting.utils.SortHelper;

public class Selection {

    public static void Sort(int[] array){
        for(int i = 0;i< array.length; i++){
            int min = i;
            for(int j = i; j < array.length; j++){
                if(array[min] > array[j]){
                  min = j;
                }
            }
            if(min != i){
                SortHelper.Swap(array, min, i);
            }
        }
    }

}
