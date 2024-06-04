package Lesson31;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test7 {
    static int abc (){
        try {
            File a = new File("test1.txt");
            FileInputStream fis = new FileInputStream(a);
            //return 5;
        } catch (FileNotFoundException e){
            System.out.println("Excep poyman");
            return 6;
        } finally {
            System.out.println("eto block finaly");

        }
        return 7;
    }

    public static void main(String[] args) {
        System.out.println(abc());

    }
}
