package Lesson26;

public class Test {
    public static void main(String[] args) {
        A ca = new C();
        ca.abc(new B());
    }
}
class A {
    void abc(A a){
        System.out.println("A");
    }
}
class B extends A{

    void abc (B b1){
        System.out.println("B");
    }
}
class  C extends B{
    void abc(B b2){
        System.out.println("C");
    }
}