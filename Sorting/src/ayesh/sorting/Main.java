package ayesh.sorting;

import ayesh.sorting.utils.Printer;

public class Main {

    public static void main(String[] args) {
        System.out.println("Selection Sort");
        int[] arr1 = {9,14,3,2,43,11,58,22};
        Selection.Sort(arr1);
        Printer.printArray(arr1);
        System.out.println("");

        System.out.println("Insertion Sort");
        int[] arr2 = {9,14,3,2,43,11,58,22};
        Insertion.Sort(arr2);
        Printer.printArray(arr2);
        System.out.println("");

        System.out.println("Bubble Sort");
        int[] arr3 = {9,14,3,2,43,11,58,22};
        Insertion.Sort(arr3);
        Printer.printArray(arr3);
        System.out.println("");
    }

}
