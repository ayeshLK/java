package ayesh.sorting;

import ayesh.sorting.utils.Printer;

public class Main {

    public static void main(String[] args) {
        int[] arr = {9,14,3,2,43,11,58,22};
        Insertion.Sort(arr);
        Printer.printArray(arr);
    }

}
