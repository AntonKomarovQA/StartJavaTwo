package Lesson33;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Homework {
    public static void main(String[] args) {
        Employ em = new Employ("Anton","IT",210);
        Employ em1 = new Employ("Kote","Azov",70);
        Employ em2 = new Employ("Tatyxa","Ostrov",90);
        Employ em3 = new Employ("Omlet","Omlet",200);
        Employ em4 = new Employ("Baget","Sota",50);
        Employ em5 = new Employ("Enot","Sota",50);

        ArrayList<Employ> arrayList = new ArrayList<>();

        arrayList.add(em);
        arrayList.add(em1);
        arrayList.add(em2);
        arrayList.add(em3);
        arrayList.add(em4);
        arrayList.add(em5);

        TestEmp tE = new TestEmp();
        //salary должна быть больше 200
        tE.filtraciyaRabotnikov(arrayList, (Employ rabot) -> {return rabot.salary >= 200; });
        System.out.println("________________________________________________________________");
        //name должна start E salary < 450
        tE.filtraciyaRabotnikov(arrayList, rabot-> rabot.name.startsWith("E") && rabot.salary <450);
        System.out.println("________________________________________________________________");
        //name должна == department
        tE.filtraciyaRabotnikov(arrayList, rabot-> rabot.name.equals(rabot.department));


    }
}

class Employ{
    String name ;
    String department;
    int salary;

    //Задаю значения этим переменным при создании обьекта
    Employ(String name,String department,int salary){
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}
//метод printEmploy принимает параметр обьект класса Employ и выводит на экран всю информацию о работнике
class TestEmp {
    void printEmploy(Employ emp) {
        System.out.println("Name: " + emp.name + " Dep " + emp.department + " salary " + emp.salary);
    }

    //вывод на экран инф о всех работниках из ArrayList
    void filtraciyaRabotnikov(ArrayList<Employ> employArrayList, Predicate<Employ> p) {
//        for (Employ employ : employArrayList) {
//            if (p.test(employ)) {
//                printEmploy(employ);
//            }
//        }
        employArrayList.stream().filter(p).forEach(this::printEmploy);
    }
}
