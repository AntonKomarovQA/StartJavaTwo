package Lesson29;

public class Test3 {
    public static void main(String[] args) {
        Employ e = new Employ();
        e.sleep();

        Employ e1 = new Doc();
        e1.sleep();

        //Doc d = new Employ();
        Doc d1 = new Doc();
        d1.sleep();
        //Employ exp = (Doc)new Employ();
        //exp.sleep();
        //Doc d3 = (Doc)new Employ();

    }
}
class Employ{
    void sleep(){
        System.out.println("Emp sleep");
    }
}
class Doc extends Employ{
    @Override
    void sleep() {
        System.out.println("Doc sleep");
    }
}