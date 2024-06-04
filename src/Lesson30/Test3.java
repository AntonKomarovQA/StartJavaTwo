package Lesson30;

public class Test3 {
    static String s ="";
    {
        s+="A";
    }
    static 
        { s +="B";}
        { s +="C";}
}
class Z{
    public static void main(String[] args) {
        System.out.println(Test3.s);
        System.out.println(Test3.s);
        new Test3();
        new Test3();
        System.out.println(Test3.s);
    }
}