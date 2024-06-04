package Lesson29;

public class Test {
    public static void main(String[] args) {
 Empoyee e = new Teacher();
 Empoyee e1 = new Doctor();
 Empoyee e2 = new Driver();
 e.work();
 e1.work();
 e2.work();
 Help_able h = new Teacher();
 h.help();

    }
}

abstract class Empoyee{
    void sleep(){
        System.out.println("Employee sleeps");
    }
    abstract void work();
}
 class Driver extends Empoyee{
    void work(){
        System.out.println("Driver works");
    }
}
 class Teacher extends Empoyee implements Help_able{
     void work(){
         System.out.println("Teacher works");
     }

     @Override
     public void help() {
         System.out.println("Учитель оказывает помощь");
     }
 }
class Doctor extends Empoyee {
    void work(){
        System.out.println("Doctor works");
    }
}

interface Help_able{
    void help();

}