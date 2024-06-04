package Lesson30;

public class Test1 {
    public static void main(String[] args) {
        Car c1 = new Car("rev","v4");
        Car c2 = new Car("rev","v4");
        Car c3 = new Car("black","v8");
        System.out.println(c1.equals(c3));
    }
}
class Car {

    String color;
    String engine;

    public Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }

    public boolean equals(Car c ) {
        return (color.equals(c.color) && engine.equals(c.engine));
    }
}
