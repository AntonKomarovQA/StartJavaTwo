package Lesson14While;

public class While {
    public static void time() {
        int chas = 0;
        do {
            int min = 0;
            do {
                int sec = 0;
                do {
                    if (chas > 1 && min % 10 == 0) {
                        break;
                    }
                    if (sec * chas > min) {
                        continue;
                    }
                    System.out.printf("%02d:%02d:%02d%n", chas, min, sec);
                    sec++;
                } while (sec < 60);
                min++;
            } while (min < 60);
            chas++;
        } while (chas < 24);
    }


    public static void main(String[] args) {
        time();
    }
}