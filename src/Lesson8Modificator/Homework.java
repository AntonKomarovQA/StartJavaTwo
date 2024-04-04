package Lesson8Modificator;

//Второе задание
public class Homework {
    final static   double PI = 3.14;

    // Нестатический метод для вычисления площади круга
    double ploshad(double rad){
        double ploshad = PI*rad*rad;
        return ploshad;
    }
    // Статический метод для вычисления длины окружности
    static double dlinaOkr(double rad){
        double dlinaOkr = 2*PI*rad;
        return dlinaOkr;
    }
    void rad(double rad){
        System.out.println("радиус = "+rad);
        System.out.println("Площадь круга = "+ ploshad(rad));
        System.out.println("Длина окружности = "+ dlinaOkr(rad));
    }

}
class HomeworkTest{
    public static void main(String[] args) {
        Homework homework =new Homework();
        homework.rad(3);

        System.out.println(homework.ploshad(5));
        double dlina = Homework.dlinaOkr(4);
        System.out.println(dlina);
    }
}
