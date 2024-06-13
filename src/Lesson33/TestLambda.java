package Lesson33;

import java.util.ArrayList;

public class TestLambda {
}
class Student1{
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;
     Student1(String name,char sex,int age,int course,double avgGrade){
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }
}

class StudentInfo1 {
    void printStudent(Student1 st) {
        System.out.println("Name: " + st.name + " pol: " + st.sex + " vozrast: " + st.age + " course " + st.course + " avgGrade = " + st.avgGrade);
    }

    void testStudent(ArrayList<Student1> al, StidentCheck sc) {
        for (Student1 s : al) {
            if (sc.test(s)) {
                printStudent(s);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Student1> list = new ArrayList<>();
        Student1 st =  new Student1("Kot",'k',10,0,5.5);
        Student1 st1 = new Student1("Anton", 'm', 25, 4, 10.0);
        Student1 st2 = new Student1("Igor", 'm', 22, 3, 7.0);
        Student1 st3 = new Student1("Illa", 'm', 25, 4, 6.0);
        Student1 st4 = new Student1("Ira", 'g', 18, 1, 5.0);

        list.add(st);
        list.add(st1);
        list.add(st2);
        list.add(st3);
       list.add(st4);

        StudentInfo1 stInfo = new StudentInfo1();

        // Лямбда выражение
        stInfo.testStudent(list, st10 ->  st10.avgGrade > 8.5);
        System.out.println("_______________________________________");
        stInfo.testStudent(list,(Student1 st10) -> {return st10.age > 20;});
        System.out.println("_______________________________________");
        stInfo.testStudent(list,(Student1 st10) -> {return st10.course > 3;});
        System.out.println("_______________________________________");
        stInfo.testStudent(list,(Student1 st10) -> {return st10.sex == 'g';});
        System.out.println("_______________________________________");
        stInfo.testStudent(list,(Student1 st10) -> {return st10.sex == 'm'&& st10.course < 4;});
    }


    interface StidentCheck {
        boolean test(Student1 UserStudent);
    }
}