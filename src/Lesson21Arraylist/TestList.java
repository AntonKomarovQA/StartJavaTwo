package Lesson21Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class TestList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("poka");
        list.add("ok");
        list.add("privet");
        list.add(3,"help");

        String a = "A";
        String b = "B";
        String c = "C";
        String d = "D";





        Test_Home21 testHome21 = new Test_Home21();
        //System.out.println(testHome21.abc("ane","two","three","fore","one"));
        //System.out.println(testHome21.abc("apple", "banana", "cherry", "apple", "banana"));
        testHome21.abc2("one","two","three","fore","one");


        int a1 =7;
        System.out.println(a1>2?a1<5?3:6:9);
    }
}
