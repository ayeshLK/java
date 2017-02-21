package ayesh.sorting;

import java.util.Arrays;

/**
 * Created by ayesh on 2/21/17.
 */
public class Merge {

    public static int[] Sort(int[] array){
        if(array.length <= 1){
            return array;
        }else {
            int[] first = Sort(Arrays.copyOfRange(array, 0, array.length/2));
            int[] second = Sort(Arrays.copyOfRange(array, array.length/2, array.length));
            return first;
        }
    }

    private static int[] merge(int[] arr1, int[] arr2){
        int[] result = new int[arr1.length+arr2.length];
        
        return result;
    }

}
