package Lesson31;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test6 {
    public static void main(String[] args) {
        try {
            File a = new File("text2.txt");
            FileInputStream a1 = new FileInputStream(a);
        }catch (FileNotFoundException e ){
            System.out.println("Error poyman");
        } catch (NullPointerException e){
            System.out.println("Error poyman");
        }
    }
}
