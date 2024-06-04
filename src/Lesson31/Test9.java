package Lesson31;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test9 {
    FileInputStream fis, fils;

    public void abc() {
        try {
            fils = new FileInputStream("test.html");
            try {
                fis = new FileInputStream("test10.html");
            } catch (FileNotFoundException e) {
                System.out.println("File test10 ne naydan");
            }
        } catch (FileNotFoundException e) {
            System.out.println("file test ne nayden");
        } finally {
            System.out.println("Eto finaly blocke");
            try {
                fis.close();
                fils.close();
            } catch (IOException e) {
                System.out.println("finaly block");
            }
        }
    }

    public static void main(String[] args) {
        Test9 t = new Test9();
        t.abc();
    }
}
