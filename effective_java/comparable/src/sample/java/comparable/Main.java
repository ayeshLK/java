package sample.java.comparable;

import java.util.Arrays;

public class Main {
    public static void printArray(int[] arr){
        for (int i : arr){
            System.out.println("Element "+i);
        }
        System.out.println("Array is Printed.");
    }

    public static void printPersonArray(Person[] persons){
        for (Person p: persons){
            System.out.println("Hi, I am "+p.getName()+" and I am "+p.getAge()+" years old.");
        }
    }

    public static void sortPersons(Person[] persons){
        for(int i = 0; i < persons.length; i++){
            for(int j = i; j > 0; j--){
                if(persons[j].getAge() < persons[j-1].getAge()){
                    Swap(persons, j, j-1);
                }
            }
        }
    }

    public static void Swap(Person[] arr, int from, int to){
        Person temp = arr[from];
        arr[from] = arr[to];
        arr[to] = temp;
    }

    public static void main(String[] args){
        int[] values = new int[]{9,8,7,6,5,4,3,2,1,0};
        int[] array = new int [10];

        for(int i = 0; i < values.length;i++){
            array[i] = values[i];
        }

        System.out.println("Before Comparison--->");
        printArray(array);
        Arrays.sort(array);
        System.out.println("After Comparison-->");
        printArray(array);

        PersonWithComparable[] comparables1 = new PersonWithComparable[]
                {
                        new PersonWithComparable("Ayesh", 25),
                        new PersonWithComparable("Sathish", 23),
                        new PersonWithComparable("Udara", 27),
                        new PersonWithComparable("Kulakshi", 13),
                        new PersonWithComparable("Pasan", 30)
                };

        System.out.println("Before Comparison--->");
        printPersonArray(comparables1);
        Arrays.sort(comparables1);
        System.out.println("After Comparison-->");
        printPersonArray(comparables1);

        PersonWithoutComparable[] comparables2 = new PersonWithoutComparable[]
                {
                        new PersonWithoutComparable("Ayesh", 25),
                        new PersonWithoutComparable("Sathish", 23),
                        new PersonWithoutComparable("Udara", 27),
                        new PersonWithoutComparable("Kulakshi", 13),
                        new PersonWithoutComparable("Pasan", 30)
                };

        System.out.println("Before Comparison--->");
        printPersonArray(comparables2);
        sortPersons(comparables2);
        System.out.println("After Comparison-->");
        printPersonArray(comparables2);
    }
}
