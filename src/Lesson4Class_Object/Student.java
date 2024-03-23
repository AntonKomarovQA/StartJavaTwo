package Lesson4Class_Object;

public class Student {
    int ID_billet; // номер билета
    String name;
    String surname; // фамилия

    int date ; // год обучения

    int math_middle;
    int economy_middle;
    int lingo_middle;
}
class StudentSrednaa{
    double srednaa(Student st){
        double srednaa = (st.math_middle+st.economy_middle + st.lingo_middle)/3;
        System.out.println("Учащийся "+st.surname + " "+st.surname +" Срелняя оценка " + srednaa);
        return srednaa;
    }
}

class StudentTest{
    public static void main(String[] args) {
        Student one = new Student();
        Student two = new Student();
        Student three = new Student();

        one.ID_billet = 10;
        one.name = "Peta";
        one.surname = "Petrov";
        one.date = 2020;
        one.math_middle = 7;
        one.economy_middle = 5;
        one.lingo_middle = 6;


        two.ID_billet = 11;
        two.name = "Kola";
        two.surname = "Sokolov";
        two.date = 2020;
        two.math_middle = 9;
        two.economy_middle = 4;
        two.lingo_middle = 5;


        three.ID_billet = 12;
        three.name = "Svkola";
        three.surname = "Morkov";
        three.date = 2020;
        three.math_middle = 2;
        three.economy_middle = 3;
        three.lingo_middle = 4;

        StudentSrednaa studentSrednaa = new StudentSrednaa();
        studentSrednaa.srednaa(one);
        studentSrednaa.srednaa(two);
        studentSrednaa.srednaa(three);
    }
}
