package Lesson18Array;

import java.util.Arrays;

public class Test18 {
    public static void main(String[] args) {
        int ara [] = {1,2,9,-8,0,5};
        int ar2 [] = {1,2,9,-8,0,5};

        int ar3 [] = ar2;
        System.out.println(ar3.equals(ar2));
        double arr[] = {1.5,-3.14,8.0,5.6};
        maxMin(arr);

        int [] a = {1,5,-3,14,8,0,5,6};

        System.out.println(Arrays.toString(Test18_1.sortirovka(a)));

        System.out.println(Arrays.toString(Test18_1.sortirovka1(a)));
    }

    static  void maxMin(double[]array){
        double max = array[0];
        double min = array[0];
        for (int i =0; i<array.length;i++){
            if (array[i] > max){
                max = array[i];
            }
            if (array[i] < min){
                min = array[i];
            }
        }
        System.out.println(min +" "+max);
    }
}
