package Lesson31;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test2 {
    File f = new File("test.txt");
    FileInputStream a;

    {
        try {
            a = new FileInputStream(f);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
