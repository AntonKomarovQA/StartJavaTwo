package Lesson40;

public class Test1 extends A {
    public int a =20;
    public void abc(){
        System.out.println("child non static");
    }
    public  static void abc2(){
        System.out.println("child  static");
    }

    public static void main(String[] args) {
        Test1 t = new Test1();
        System.out.println(t.a);
        System.out.println(((A)t).a);
        t.abc();
        //(A)t.abc();
        t.abc2();
        //(A)t.abc2();

    }
}

class A {
    public int a = 10;
    public void abc (){
        System.out.println("base non-static");
    }
    public static void abc2(){
        System.out.println("static");
    }
}
