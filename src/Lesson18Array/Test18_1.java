package Lesson18Array;


import java.util.Arrays;

public class Test18_1 {
    public static int[] sortirovka(int[] mas) {
        Arrays.sort(mas);
        return mas;
    }

    public static int[] sortirovka1(int[] array) {
        int a;
        for (int i=0; i<array.length; i++){
            int min = array[i];
            int index = i;
            for (int j = i; j<array.length; j++){
                if (array[j]<min){
                    min = array[j];
                    index = j;
                }
            }
            if ( i != index){
                a = array[i];
                array[i] = min;
                array[index] = a;
            }
        }
        return array;
    }
}