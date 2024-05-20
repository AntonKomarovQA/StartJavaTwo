package Lesson25.Homework2;

public class Animal {
    //конструтор
    public Animal(){
        System.out.println("I am animal");
    }
    private int eyes; //кол-во глаз

    public void setEyes(int i){
         eyes = i;
        System.out.println("Кол-во глаз "+eyes);
    }
    //метод выводящий на экран
    void eat(){
        System.out.println("Animals eats");
    }
    //метод выводящий на экран
    void drink(){
        System.out.println("Animals drinks");
    }

}
