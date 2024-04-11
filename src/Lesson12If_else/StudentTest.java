package Lesson12If_else;

public class StudentTest {
    void comparsion(Student st , Student st2){
        System.out.println("Cравниваем студентов по средней арифметической:");
        if (st.sredneeArif()>st2.sredneeArif()){
            System.out.println("Средняя оценка у первого студента больше");
        } else if (st.sredneeArif()==st2.sredneeArif()) {
            System.out.println("Средняя оценка у студентов равная");
        } else {
            System.out.println("Средняя оценка у первого студента меньше");
        }
    }
    //Сравнение студентов по всем параметрам
    void fullcomparsion(Student st , Student stTwo){
        System.out.println("Сравнение студентов по имени:");
        if (st.name.equals(stTwo.name)){
            System.out.println("Имя первого студента длинее");
            if (st.surname.equals(stTwo.surname)){
                System.out.println("Фамилия первого студениа длинее");
            }
        }else{
            System.out.println("Имя второго студента длинее");
        }

        if (st.math_middle>stTwo.math_middle){
            System.out.println("Оценка по матиматеке Первного студента больше");
        } else if (st.math_middle== stTwo.math_middle){
            System.out.println("Оценка по матиматеке y студентov равны");
        } else {
            System.out.println("Y второго студента big");
        }
        if (st.economy_middle>stTwo.economy_middle){
            System.out.println("Оценка по economy Первного студента больше");
        } else if (st.economy_middle== stTwo.economy_middle){
            System.out.println("Оценка по economy y студентov равны");
        } else {
            System.out.println("Y второго студента big");
        }
        if (st.lingo_middle>stTwo.lingo_middle){
            System.out.println("Оценка по lingo Первного студента больше");
        } else if (st.lingo_middle== stTwo.lingo_middle){
            System.out.println("Оценка по lingo y студентov равны");
        } else {
            System.out.println("Y второго студента big");
        }

    }
}
//информация о студенте
class Student {
    int ID_billet; // номер зачетки
    String name; //имя
    String surname; // фамилия
    double math_middle; //средняя оценка по математике
    double economy_middle; //средняя оценка по экономике
    double lingo_middle; //средняя оценка по языку

    Student (int id,String name, String surname,double math_middle,double economy_middle,double lingo_middle){
        this.ID_billet = id;
        this.name = name;
        this.surname = surname;
        this.math_middle = math_middle;
        this.economy_middle = economy_middle;
        this.lingo_middle = lingo_middle;
    }

   public double sredneeArif(){
        return (math_middle + economy_middle + lingo_middle)/3;
    }
}

class TestClassStudent{
    public static void main(String[] args) {
        Student st1 = new Student(1,"Tatiana","Osykova",4,5,3.0);
        Student st2 = new Student(2,"Anastasia","Osykova",3,3,5);


        StudentTest sT = new StudentTest();
        sT.comparsion(st1,st2);

        sT.fullcomparsion(st1,st2);
    }
}