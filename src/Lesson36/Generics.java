package Lesson36;

import java.util.ArrayList;

public class Generics {
    public static void main(String[] args) {
        Info <String> f = new Info<>("privet");
        System.out.println(f);
        String s = f.getValue();

        Info <Integer> f1 = new Info<>(100);
        System.out.println(f1);
        Integer s1 = f1.getValue();
    }
}

class Info <T> {
    private T value;

    public Info(T value){
        this.value = value;
    }

    public String toString(){
        return "["+value+"]";
    }

    public T getValue(){
        return value;
    }
}