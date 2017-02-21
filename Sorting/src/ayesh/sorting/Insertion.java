package ayesh.sorting;

import ayesh.sorting.utils.Swapper;

/**
 * Created by ayesh on 2/21/17.
 */
public class Insertion {

    public static void Sort(int[] array){

        for(int i = 0;i< array.length; i++){

            for(int j = i; j < array.length; j++){
                if(array[i] > array[j]){
                  Swapper.Swap(array, i, j);
                }
            }

        }

    }



}
