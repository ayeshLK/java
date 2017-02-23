package ayesh.sorting;

public class Shell {

    public static void Sort(int[] array){
        int buck = 1;
        while (buck < array.length/3)
            buck = (buck*3) +1;
        while (buck > 0){
            for(int out= buck; out< array.length; out++){
                int temp = array[out];
                int inner = out;
                while (inner > (buck - 1) && array[inner - buck] >= temp){
                    array[inner] = array[inner - buck];
                    inner -= buck;
                }
                array[inner] = temp;
            }
            buck = (buck - 1)/3;
        }
    }

}
