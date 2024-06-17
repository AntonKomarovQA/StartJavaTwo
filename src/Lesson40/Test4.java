package Lesson40;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test4 {
    public static void main(String[] args) {
        int a = abc();
        System.out.println(a);
    }
    static int abc(){
        try {
            FileInputStream fis = new FileInputStream("file_kot.txt");
        } catch (FileNotFoundException e){
            System.out.println("file ne nayden");
        } finally {
            System.out.println("eto finally block");
        }
        System.out.println("Programma prodolijatsa");
        return 18;
    }
}

