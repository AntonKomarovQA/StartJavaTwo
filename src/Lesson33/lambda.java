package Lesson33;

import java.util.ArrayList;

public class lambda {

}

class Student{
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;
    Student(String name,char sex,int age,int course,double avgGrade){
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }
}

class StudentInfo{
    void printStident(Student st){
        System.out.println("Имя студента "+st.name+" пол "+ st.sex+" возраст "+ st.age+" Курс "+ st.course+" средняя оценка "+ st.avgGrade);
    }
    // Вывод информации о студентах у кого наивысший avgGrade
    void printStidentOverGrade(ArrayList<Student>al,double avgGrade){
        for (Student s : al){
            if (s.avgGrade> avgGrade){
                printStident(s);
            }
        }
    }
    // Вывод информации о студентах у кого наименьший avgGrade
    void printStidentUnderGrade(ArrayList<Student>al,double avgGrade){
        for (Student s : al){
            if (s.avgGrade < avgGrade){
                printStident(s);
            }
        }
    }
    // Вывод информации о старшних Студентов
    void printStidentOverAge(ArrayList<Student>al,int age){
        for (Student s : al){
            if (s.age > age){
                printStident(s);
            }
        }
    }
    void printStidentUnderAge(ArrayList<Student>al,int age){
        for (Student s : al){
            if (s.age < age){
                printStident(s);
            }
        }
    }
    // Вывод информации по гендерному признаку
    void printStidentBySex(ArrayList<Student>al,char sex){
        for (Student s : al){
            if (s.sex == sex){
                printStident(s);
            }
        }
    }
    void printStidentConditions(ArrayList<Student>al,double avgGrade, int age , char sex) {
        for (Student s : al) {
            if (s.avgGrade > avgGrade && s.age < age && s.sex == sex) {
                printStident(s);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList <Student> list =  new ArrayList<>();
        Student st = new Student("Ivan",'m',22,3,8.0);
        Student st1 = new Student("Anton",'m',25,4,10.0);
        Student st2 = new Student("Igor",'m',22,3,7.0);
        Student st3 = new Student("Illa",'m',25,4,6.0);
        Student st4 = new Student("Ira",'g',18,1,5.0);

        list.add(st);
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);

        StudentInfo si = new StudentInfo();
        si.printStidentOverGrade(list,7);
        System.out.println("_______________________");
        si.printStidentUnderGrade(list,9);
        System.out.println("_______________________");
        si.printStidentOverAge(list,20);
    }
}