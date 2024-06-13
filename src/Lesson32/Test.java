package Lesson32;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Test {
    // Первый шаблон "2016,января-01 || 09:00"
    private static final DateTimeFormatter FORMATTER1 = DateTimeFormatter.ofPattern("yyyy,MMMM-dd || hh:mm");

    // Второй шаблон "09:00 03/фев/16"
    private static final DateTimeFormatter FORMATTER2 = DateTimeFormatter.ofPattern("HH:mm dd/MMM/yy");

    public void smena(LocalDateTime start, LocalDateTime end, Period period, Duration duration) {
        LocalDateTime current = start;

        // Форматирование текущей даты по двум шаблонам
        while (current.isBefore(end)) {
            System.out.print("Work is: " +current.format(FORMATTER1));
            current = current.plus(period);
            System.out.println(" Work do:" + current.format(FORMATTER1));
            System.out.println(" ");
            System.out.print("Pausa is: " + current.format(FORMATTER2));
            current = current.plus(duration);
            System.out.println("Pausa do: " + current.format(FORMATTER2));

        }
    }

    public static void main(String[] args) {
        // Пример использования метода smena
        LocalDateTime start = LocalDateTime.of(2016, 1, 1, 9, 0,0);
        LocalDateTime end = LocalDateTime.of(2016, 10, 31, 18, 0,0);
        Period period = Period.of(0,1,2);
        Duration duration = Duration.ofMinutes(600);
        Test t = new Test();
        t.smena(start, end, period, duration);
    }
}

