package Lesson27.Work;

public class Test2 {
    public static void main(String[] args) {


Jump j1 = new Human();
Jump j2 = new Animal();
 j2.jump();
 j1.jump();
}
}
class Human implements  Jump{
    @Override
    public void jump() {
        System.out.println("Human jump");
    }
}
class Animal implements  Jump{
    @Override
    public void jump() {
        System.out.println("Animal jump");
    }
}

interface Jump{
    void jump();
}
