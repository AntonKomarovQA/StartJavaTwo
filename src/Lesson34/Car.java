package Lesson34;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Car {
    String name;
    String color;
    double engine;

    public Car(String name, String color,double engine){
        this.name = name;
        this.color = color;
        this.engine = engine;
    }

    public String toString(){
        return "Name car: " + name + " Color : "+ color + " Engine: " + engine;
    }
}

class Test {
    public  static ArrayList<Car> createThreeCars(Supplier<Car> carSupplier){
        ArrayList<Car> carAL = new ArrayList<>();
        for (int i = 0; i< 3 ; i ++){
            carAL.add(carSupplier.get());
        }
        return carAL;
    }

    public  static void changeCar(Car car, Consumer<Car> cons){
        cons.accept(car);
    }

    public static void main(String[] args) {
        ArrayList<Car> ourCar = createThreeCars(()-> new Car("Nissan Tilda","silver metalic",1));
        System.out.println("OurCar: " + ourCar);

        changeCar(ourCar.get(1),car -> {car.color = "red"; car.engine = 2.4;
            System.out.println("update car:" + car);});

        System.out.println("OurCar car: " + ourCar );
    }
}