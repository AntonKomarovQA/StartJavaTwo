package Lesson29;

public class Test2 implements  interface1,interface2 {

    @Override
    public void abc() {
        System.out.println("OK");
    }
    public static void main(String[] args) {
        Test2 t = new Test2();
        ((interface1)t).abc();
    }
}
interface  interface1{
    int a =5;
    void abc();
}
interface  interface2{
    int a = 10;
    void abc();
}

