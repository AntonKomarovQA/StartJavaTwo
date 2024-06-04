package Lesson31;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test8 {

    void abc () throws FileNotFoundException {
        try {
            File a = new File("test1.txt");
            FileInputStream fis = new FileInputStream(a);
        } catch (FileNotFoundException e){
            System.out.println("Excep poyman");
            throw e;
        } finally {
            System.out.println("eto block finaly");
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
      Test8 t = new Test8();
      t.abc();

    }
}
