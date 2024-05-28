package Lesson27.Work;

public class Test1 {
    public static void main(String[] args) {
Hepl_able h = new Driver();
Swim_able s = new Driver();
Emploee e = new Driver();
        System.out.println(h.a);
        h.pomosh();
        h.tushitPojar("XXX");
        s.swim();
    }
}

class Emploee{
    double salary = 1000;
    String name = "Kola";
    int age;
    int experience;
    void eat(){
        System.out.println("Kyshat");
    }
    void sleep(){
        System.out.println("Spat");
    }
}
class Driver extends Emploee implements Hepl_able, Swim_able {
    String nazvanieMashin;
    void vodit(){
        System.out.println("Vodit");
    }
    @Override
    public void pomosh() {
        System.out.println("Voditel okaz pomosh");
    }
    @Override
    public void swim() {
        System.out.println("Vodit plavaet");
    }
    @Override
    public void tushitPojar(String predmet) {
        System.out.println("Vodit tushitPojar");
    }
}


class Teacher extends Emploee implements Hepl_able {

    int kolUch;
    void  uchit(){
        System.out.println("Uchit");
    }
    public void pomosh(){
        System.out.println("Uchitel okazivaet pomosh");
    }

    @Override
    public void tushitPojar(String s) {
        System.out.println("Uchitel tushitPojar" +s );
    }
}



interface Hepl_able{
    public abstract void pomosh();
    void tushitPojar(String predmet);
    public final static int a = 10;
}

interface Swim_able{
    void swim();
}

abstract class Y implements Swim_able{}
abstract class X extends Y{}
class Z extends Y{
    public void swim(){}
}