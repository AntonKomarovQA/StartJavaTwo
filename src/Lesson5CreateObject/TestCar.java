package Lesson5CreateObject;

public class TestCar {
    //Констурктор
    TestCar(String cvet,String motor){
        color = cvet;
        engine = motor;
    }
    BankAkk bankAkk = new BankAkk(5,10);
    String color;
    String engine;
    int speed;

    //создание методов
    int gaz(int skorost){
        speed +=skorost;
        return speed;
    }
    int tormoz (int skorost){
        speed -=skorost;
        return speed;
    }


    void showInfo(){
        System.out.println("cvet: "+color+" motor: "+engine+" Скорость машины "+speed+" Баланс банковского счета "+ bankAkk.bal2);
    }
}

class BankAkk{
    double bal2;
    int id2 ;

    BankAkk(int id, double balance){
        bal2 = balance;
        id2 = id;
    }
}

class Car2Test{
    public static void main(String[] args) {
        TestCar testCar = new TestCar("bleu","V4");
        testCar.showInfo();
        testCar.speed = 60;
        testCar.color = "red";
        testCar.showInfo();
        testCar.tormoz(40);
        testCar.showInfo();
        testCar.gaz(140);
        testCar.showInfo();
    }
}