package Lesson40;

public class Test10 {
    public static void main(String[] args) {
        boolean flag = false;
        while (flag =true){
            Emp.id++;
        }
        System.out.println(Emp.id);
    }
}
class Emp {
    static int id = 0;

}
