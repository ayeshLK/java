package ayesh.sorting;

import static ayesh.sorting.utils.SortHelper.printArray;

public class TestProgram {

    public static void main(String[] args) {
        System.out.println("Selection Sort");
        int[] arr1 = {9,14,3,2,43,11,58,22};
        Selection.Sort(arr1);
        printArray(arr1);
        System.out.println("");

        System.out.println("Insertion Sort");
        int[] arr2 = {9,14,3,2,43,11,58,22};
        Insertion.Sort(arr2);
        printArray(arr2);
        System.out.println("");

        System.out.println("Bubble Sort");
        int[] arr3 = {9,14,3,2,43,11,58,22};
        Bubble.Sort(arr3);
        printArray(arr3);
        System.out.println("");

        System.out.println("Merge Sort");
        int[] arr4 = {9,14,3,2,43,11,58,22};
        printArray(Merge.Sort(arr4));
        System.out.println("");

        System.out.println("Quick Sort");
        int[] arr5 = {9,14,3,2,43,11,58,22};
        Quick.Sort(arr5);
        printArray(arr5);
        System.out.println("");

        System.out.println("Shell Sort");
        int[] arr6 = {9,14,3,2,43,11,58,22};
        Shell.Sort(arr6);
        printArray(arr6);
        System.out.println("");
    }

}
