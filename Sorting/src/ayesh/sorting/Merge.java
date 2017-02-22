package ayesh.sorting;

import java.util.Arrays;

public class Merge {

    public static int[] Sort(int[] array){
        if(array.length <= 1){
            return array;
        }else {
            int[] first = Sort(Arrays.copyOfRange(array, 0, array.length/2));
            int[] second = Sort(Arrays.copyOfRange(array, array.length/2, array.length));
            return merge(first, second);
        }
    }

    private static int[] merge(int[] arr1, int[] arr2){
        int[] result = new int[arr1.length+arr2.length];
        int arr1_count = 0;
        int arr2_count = 0;
        for(int i=0; i < result.length; i++){
            if(arr1_count == arr1.length || arr2_count == arr2.length){
                if(arr1_count < arr1.length)
                    result[i] = arr1[arr1_count++];
                if(arr2_count < arr2.length)
                    result[i] = arr2[arr2_count++];
            }else{
                if(arr1[arr1_count] < arr2[arr2_count])
                    result[i] = arr1[arr1_count++];
                else
                    result[i] = arr2[arr2_count++];
            }
        }

        return result;
    }

}
