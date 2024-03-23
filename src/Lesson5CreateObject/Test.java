package Lesson5CreateObject;

public class Test {
    public static void main(String[] args) {
        //Создание обьекта класса  а так же конструктор
        Test5 test = new Test5();
        // Вызов метода
        System.out.println(test.summa(5,6,10));
        System.out.println(test.summaArif(10,20,30));
    }


}

class Test5{
    //создание метода
    int summa (int a, int b, int c){
        return a+b+c;
    }

    // вызов внутри метода
    int summaArif (int a1, int b2, int c3){
        int res = summa(a1,b2,c3)/3;
        return res;
    }
}
