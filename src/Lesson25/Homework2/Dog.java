package Lesson25.Homework2;

public class Dog extends Pet{
    public Dog(String name) {
        this.name = name;
        System.out.println("i am dog and my name is:"+ name);
    }
    void play(){
        System.out.println("Dog plays");
    }
}
