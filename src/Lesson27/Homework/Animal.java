package Lesson27.Homework;

abstract  class Animal {
    // Конструктор с переменной String name
    String name;
    public Animal (String name){
         this.name = name;
     }
    //Abstraktn metod eat
    abstract void  eat();

    //Abstraktn metod eat
    abstract void  sleep();

}

 abstract  class Fish extends Animal{
     // Конструктор имеет параметр значение которого назначается переменными name
     public Fish(String name) {
         super(name);
         this.name = name;
     }
     // перезаписанный метод sleep который выводит другую запись
     @Override
     void sleep() {
         System.out.println("Vsegda interesno nabludat kak spyat ribi");
     }
     // абстрактный метод свим
     abstract void swim();
 }

abstract  class Bird extends Animal implements Speakble{
    // Конструктор имеет параметр значение которого назначается переменными name
    public Bird(String name) {
        super(name);
        this.name = name;
    }
    // абстрактный метод flay
    abstract void fly();
    public void speak(){
        System.out.println(name + "sings");
    }

}

abstract  class Mammal extends Animal implements Speakble{
    // Конструктор имеет параметр значение которого назначается переменными name
    public Mammal(String name) {
        super(name);
        this.name = name;
    }
    // абстрактный метод run
    abstract void run();
}

interface Speakble {
    //метод run
    default void speak(){
        System.out.println("Somebody speak");
    }
}

class Mechenosec extends Fish {
    public Mechenosec(String name) {
        super(name);
        this.name = name;
    }

    @Override
    void swim() {
        System.out.println("Mechenosec krasivaya riba");
    }

    @Override
    void eat() {
        System.out.println("Mechenosec ne xishnaa riba");
    }
}

class Pingvin extends Bird{

    public Pingvin(String name) {
        super(name);
        this.name = name;
    }

    @Override
    void eat() {
        System.out.println("Pingvin lyubit est ribu");
    }

    @Override
    void sleep() {
        System.out.println("Pingvin spyat prijavshis drug k drugu");
    }

    @Override
    void fly() {
        System.out.println("Pingvin ne umeyt letat");
    }

    @Override
    public void speak() {
        System.out.println("Pingvin ne umeyt pet kak solovyi");
    }
}
class Lev extends Mammal{

    public Lev(String name) {
        super(name);
        this.name = name;
    }

    @Override
    void eat() {
        System.out.println("Lev, kak lyuboy xishnik lybit myaso!");
    }

    @Override
    void sleep() {
        System.out.println("Bolshue chast dnya lev spit!");
    }

    @Override
    void run() {
        System.out.println("Lev-eto ne samay bistrya koshka");
    }
}