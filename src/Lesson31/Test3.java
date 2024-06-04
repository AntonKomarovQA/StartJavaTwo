package Lesson31;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test3 {
    public static void main(String[] args) {


        int[] array = {1, 3, 6};

        try {
            System.out.println(array[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Bil poiman exp");
        }

        String[] array2 = new String[2];
        System.out.println(array2[0]);

        double d1 = Double.NaN;
        double d2 = d1;
        if (d1 == d2){
            System.out.println("Eq");
        }else {
            System.out.println("Not");
        }

        File f = new File("test1.txt ");

        try {
            FileInputStream fe = new FileInputStream(f);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }finally {
            System.out.println("eto finaly block ");
        }
    }
}