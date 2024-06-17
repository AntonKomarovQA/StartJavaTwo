package Lesson40;

public class Test11 {
    static  int b = 3;
    public static void main(String[] args) {
        String a1[] = new String[][]{new String[]{"privet","poka","ok"},{new String()},{null}}[2];
        String a2[] = {null};
        String a3[] = null;

        //System.out.println(a1[0]);
       // System.out.println(a2[0]);
//System.out.println(a3[0]);

        int i =5 ;
        if (i++<=5){
            System.out.println(i);
        }

        int c = 1+ (b=5);
        System.out.println(c);


    }
}
