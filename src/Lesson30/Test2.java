package Lesson30;

public class Test2 {
    public static void main(String[] args) {
        //Animal a = new Animal();
        Lion l = new Lion();

    }
}
class Animal{
    Animal(){
        System.out.println("Construktor Animal");
    }
    static {
        System.out.println("Statik init in Animal");
    }
    {
        System.out.println("Non-static init in Animal");
    }
}
class Mammal extends Animal{
    Mammal(){
        System.out.println("Construktor of  Mammal");
    }
    static {
        System.out.println("Statik init in Mammal");
    }
    {
        System.out.println("Non-static init in Mammal");
    }
}
class Lion extends Mammal{
    Lion(){
        System.out.println("Construktor of Lion");
    }
    static {
        System.out.println("Statik init in Lion");
    }
    {
        System.out.println("Non-static init in Lion");
    }
}

