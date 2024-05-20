package Lesson25.Homework1;

public class Student {
    private StringBuilder name ;
    private int course ;
    private int grade;
    public Student(){
        this.name = new StringBuilder(); // Инициализация пустого StringBuilder
        this.course =0; // Инициализация курса по умолчанию
        this.grade =0; // Инициализация оценки по умолчанию
    }

    public StringBuilder getName(){
        StringBuilder sb = new StringBuilder(name);
        return sb;
    }
    public void setName(StringBuilder name){
        if (name.length() < 3){
            System.out.println("Введите имя более 3 букв");
        }else {
            this.name = name;
        }
    }


    public int getCourse(){
        return course;
    }
    public  void setCourse(int i){
        if (i>=1 && i<=4){
            course = i;
        }else {
            System.out.println("Введите курс с 1 по 4 включительно");
        }
    }

    public int getGrade(){
        return grade;
    }
    public  void setGrade(int i){
        if (i>=1 && i<=10){
            grade = i;
        }else {
            System.out.println("Введите оценки с 1 по 10 включительно");
        }
    }

    //метод который воводит всю информацию о студенте не используя переменные класса на прямую
    public void showInfo(){
        //получаем информацию о курсе
        System.out.println("Студент "+name+" Обучается на курсе "+ course+" и имеет оценку "+ grade);
    }
}