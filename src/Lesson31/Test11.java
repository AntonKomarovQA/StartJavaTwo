package Lesson31;

import java.util.ArrayList;

public class Test11 {
    public static void main(String[] args) {
        Samolet s = new Samolet();
        s.letet();
        s.ojidaet();
       s.otmeniPolet();
    }
}

class Samolet{
    String sostoynie = "v ojidanii";
    public  void letet(){
        sostoynie = "v vozdyxe";
        System.out.println("Samolet letit");
    }

    public void ojidaet(){
        if (sostoynie.equals("v vozdyxe")) {
            throw new IllegalStateException("Samolet uje v vozdexe");
        }
        sostoynie = "v ojidanii";
        System.out.println("Samolet ojidaet");
        }

    public void otmeniPolet(){
        if (sostoynie.equals("v vozdyxe")) {
            throw new IllegalStateException("Samolet uje v vozdexe");
        }
        sostoynie = "polet otmenen";
        System.out.println("polet Samolet otmena");
    }
}
