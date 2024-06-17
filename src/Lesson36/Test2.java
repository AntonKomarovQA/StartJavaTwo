package Lesson36;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(10);
        al1.add(20);
        al1.add(30);
        int a = GenMedod.getSecondEl(al1);
        System.out.println(a);
    }

    public void abc (Info<String> s ){
        String test = s.getValue();
    }
//    public void abc (Info<Integer> s ){
//        Integer i = s.getValue();
//    }
}

class GenMedod{
    public static <T> T getSecondEl(ArrayList<T> al){
        return al.get(1);
    }
}
