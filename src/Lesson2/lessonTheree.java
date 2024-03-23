package Lesson2;

public class lessonTheree {
    public static void main(String[] args) {
        int a = 5;
        int i2 = 11;
        double d1 = 5.5;
        double d2 = 1.3;
        long l = 20l;
        double res = 0;
        res = i2/d1+d2%a -l;
        System.out.println(res);

        int a1 = a-- - --a + ++a + a++ +a;
        int c = 8;
        int c1 = ++c - c++ + ++c - --c;
        System.out.println(a1+" "+c1);
    }
}
