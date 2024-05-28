package Lesson27.Homework;

public class Test {
    public static void main(String[] args) {
        Mechenosec m1 = new Mechenosec("Kryg");
        System.out.println(m1.name) ;
        m1.eat();
        m1.swim();
        m1.sleep();

        System.out.println();

        Speakble p1 = new Pingvin("Kovalskii");
        p1.speak();
        System.out.println();

        Animal l = new Lev("Leo");
        System.out.println(l.name);
        l.eat();
        l.sleep();
        System.out.println();

        Mammal l1 = new Lev("Leo_dva");
        System.out.println(l1.name);
        l1.run();
        l1.speak();
        l1.eat();
        l1.sleep();
    }
}
