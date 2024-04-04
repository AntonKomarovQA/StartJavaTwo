package Lesson8Modificator;


class Modification {
    // Статический метод для умножения трех чисел
     static double ymnoenie(double a, double b, double c) {
        double sum = a * b * c;
        return sum;
    }
    // Статический метод для деления первого числа на второе и вывода результата
     static void delenie(double a, double b) {
        double otvet = a / b;
        double otvet1 = a % b;
        System.out.println("Целое число " + otvet + " Остаток " + otvet1);
    }
}

class Modtest{
    public static void main(String[] args) {
        double a = Modification.ymnoenie(5,2.2,3);
        double b = Modification.ymnoenie(6,1.5,2);
        System.out.println(a);
        System.out.println(b);
        Modification.delenie(4,5);
        Modification.delenie(46,2);
    }
}