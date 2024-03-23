package Lesson5CreateObject;

public class Homework5BankAccount {
    private double balance;
    //Конструктор который принимает начальный баланс
    Homework5BankAccount(double balance1){
        balance = balance1;
    }
    //Метод для пополнения счета
    void poplenenieDep(double balancePop){
         balance += balancePop;
        System.out.println("Баланс после пополнения "+balance);
    }
    //Метод для Снятия счета
    void snatDep(double balanceSnat){
        balance -= balanceSnat;
        System.out.println("Баланс после снятия "+balance);
    }
}
class StudentTask{
    int ID_billet; // номер билета
    String name;
    String surname; // фамилия
    int date ; // год обучения
    int math_middle;
    int economy_middle;
    int lingo_middle;
    StudentTask(int math_middle1, int economy_middle1, int lingo_middle1, String name1, String surname1){
        math_middle = math_middle1;
        economy_middle = economy_middle1;
        lingo_middle = lingo_middle1;
        name = name1;
        surname = surname1;

        int sred = (math_middle+economy_middle+lingo_middle)/3;
        System.out.println("Учащийся "+name1+" "+surname1+ " со средней арифметической: " + sred );
    }
}

 class Employee{
     //переменные
    int id;
    String surname;
    int age;
    double salary;
    String departamen;

    //Конструктор
     Employee(int id,String surname,int age,double salary,String departamen){
         this.id = id;
         this.surname = surname;
         this.age = age;
         this.salary = salary;
         this.departamen = departamen;

     }
    // метод Увеличение зарплаты
    double YvelichenitZP() {
            System.out.println("Значение старой зарпланы "+salary);
             return salary *=  2;
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        //Пополнение баланса
        Homework5BankAccount homework5BankAccount = new Homework5BankAccount(50);

        homework5BankAccount.poplenenieDep(20);
        homework5BankAccount.snatDep(30);
        homework5BankAccount.poplenenieDep(11);

        //Класс студентов
       StudentTask studentTask1 = new StudentTask(7,6,5,"Peta","Petrov");
        studentTask1.ID_billet = 10;
        studentTask1.date = 2020;
        //Класс студентов
        StudentTask studentTask2 = new StudentTask(9,4,5,"Kola","Sokolov");
        studentTask2.ID_billet = 10;
        studentTask2.date = 2020;
        //Класс студентов
        StudentTask studentTask3 = new StudentTask(2,3,4,"Svkola","Morkov");
        studentTask3.ID_billet = 10;
        studentTask3.date = 2020;


        Employee employee1 = new Employee(1,"Kot",20,25,"Home");
        Employee employee2 = new Employee(2,"Kot2",40,35,"Home2");
        System.out.println("Значение новой зарплаты "+employee1.YvelichenitZP());
        System.out.println("Значение новой зарплаты "+employee2.YvelichenitZP());


    }
}