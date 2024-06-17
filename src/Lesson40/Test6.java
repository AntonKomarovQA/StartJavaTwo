package Lesson40;

public class Test6 {
    String bookName;
    Test6(){
        Test6 t = new Test6();
        t.bookName = "Java Oca";
    }
}

class Book{
    public static void main(String[] args) {
        Test6 t6 = new Test6();
        t6.bookName = "JavaOCP";
        System.out.println(t6.bookName);
    }
}