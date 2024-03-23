package Lesson6Peregryz;


class Student {
    int ID_billet; // номер билета
    String name;
    String surname; // фамилия
    int date; // год обучения
    double math_middle;
    double economy_middle;
    double lingo_middle;
    //Конструктор
    Student(int id1, String name1, String surname1, int date1, double math_middle1, double economy_middle1, double lingo_middle1) {
        ID_billet = id1;
        name = name1;
        surname = surname1;
        date = date1;
        math_middle = math_middle1;
        economy_middle = economy_middle1;
        lingo_middle = lingo_middle1;
    }
    Student(int id2, String name2, String surname2, int date2) {
        this(id2, name2, surname2, date2, 0, 0, 0);

    }
    Student() {
    }
}
    class StudentSrednaa {
        double srednaa(Student st) {
            double srednaa = (st.math_middle + st.economy_middle + st.lingo_middle) / 3;
            System.out.println("Учащийся " + st.surname + " " + st.surname + " Средняя оценка " + srednaa);
            return srednaa;
        }
    }


    class StudentTest {
        public static void main(String[] args) {
            Student student = new Student(10, "Peta", "Petrov", 2020, 7, 5, 6);
            Student student1 = new Student(11, "Kola", "Sokolov", 2021);
            Student student2 = new Student();

            StudentSrednaa studentSrednaa = new StudentSrednaa();
            studentSrednaa.srednaa(student);
            studentSrednaa.srednaa(student1);
            studentSrednaa.srednaa(student2);

        }
    }

