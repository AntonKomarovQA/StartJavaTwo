package Lesson31;

public class Test4 {
        static void abc(){
            System.out.println("Rabotaet abc");
            abc();
        }

    public static void main(String[] args) {

            try {
                abc();
            } catch (StackOverflowError e ){
                System.out.println("Error poyman");
            }
    }
}
