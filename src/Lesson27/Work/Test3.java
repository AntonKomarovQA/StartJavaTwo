package Lesson27.Work;

public class Test3 {
}

interface I1{
    void abc();
    default void ghi(){
        System.out.println("eto metod ghi");
    }
    static void def(){
        System.out.println("eto metod def");
    }
}
class R implements I1{
    public static void main(String[] args) {
        I1.def();
        R r = new R();
        r.ghi();

    }

    @Override
    public void abc() {

    }
}

/*
class Z2 implements I1{
    @Override
    public void abc() {
        System.out.println("eto metod abc");
    }

    public static void main(String[] args) {
        Z2 z = new Z2();
        z.abc();
        z.def();
        z.ghi();
    }
}*/
