package Lesson26.Homework;

public class X {
    public X(){
        System.out.println("X");
    }
    public X(int i){
        System.out.println("X"+i);
    }

    private boolean abc(){
        return false;
    }

    public static void main(String[] args) {
        X x = new Y(18);
        System.out.println(x.abc());
    }
}