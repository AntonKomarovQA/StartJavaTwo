package Lesson11Primetiv;

class Car {
    String color;
    String motor ;
    int dver;

    //Конструктор класса Car который задает значения данным переменным
    Car (String color, String motor,int dver){
        this.color =color ;
        this.motor = motor ;
        this.dver = dver ;
    }


}

class CarTest{
    // Метод для изменения количества дверей у автомобиля
    static void changeNumb(Car car1,int num){
        car1.dver = num;
    }

    static void swap(Car car1, Car car2){
        Car car3 = car1;
        car1 = car2;
        car2 = car3;
        System.out.println("Новый цвет "+car1.color);
    }


    public static void main(String[] args) {
        Car car = new Car("Black", "v4", 4);

        changeNumb(car,3);
        System.out.println("Новое кол-во дверей "+car.dver);

        Car car2 = new Car("RED", "v4", 4);
        Car car3 = new Car("Blue", "v4", 4);

        swap(car2,car3);
        swap(car3,car);

    }
}
