package Lesson13for;

public class For {
    public static void time() {
        for (int chas = 0; chas < 6; chas++) {
            for (int min = 0; min < 60; min++) {
                if (chas > 1 && min % 10 == 0){
                    break;
                }
            for (int sec = 0; sec<60;sec++){
            if (sec*chas>min){
                continue;
            }
                System.out.printf("%02d:%02d:%02d%n",chas,  min, sec);
            }
            }
        }
    }


    public static void main(String[] args) {
        time();
    }
}