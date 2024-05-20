package Lesson25.Homework2;

import Lesson25.Homework1.Student;

public class Pet extends Animal {
    String name;
    int tail = 1;
    int paw = 4;
    public Pet(String name){
        this.name = name;
    }
    /*public Pet(int tail,int paw ){
        this.tail = tail;
        this.paw = paw;
    }*/
    public Pet() {
        System.out.println("I am pet");
        setEyes(2);
    }

    void run(){
        System.out.println("Pet runs");
    }
    void jump(){
        System.out.println("Pet jumps");
    }

}
