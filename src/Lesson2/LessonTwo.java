package Lesson2;

public class LessonTwo {
    public static void main(String[] args) {
        byte a = 12;
        String a2 = String.format("%d",a);
        String a3 = String.format("%x",a);
        String a4 = String.format("%o",a);
        System.out.println(a+" "+a2+" "+a3+" "+a4);
        short b = 1300;
        String b2 = String.format("%d",b);
        String b3 = String.format("%x",b);
        String b4 = String.format("%o",b);
        System.out.println(b+" "+b2+" "+b3+" "+b4);
        int c = 0;
        String c2 = String.format("%d",c);
        String c3 = String.format("%x",c);
        String c4 = String.format("%o",c);
        System.out.println(c+" "+c2+" "+c3+" "+c4);
        long d = 0;
        String d2 = String.format("%d",d);
        String d3 = String.format("%x",d);
        String d4 = String.format("%o",d);
        System.out.println(d+" "+d2+" "+d3+" "+d4);

        boolean start = true;
        boolean end = false;
        float e = 3.1f;
        float e1 = 31;

        double f = 5.5;
        double f1 = 5.;
    }
}
