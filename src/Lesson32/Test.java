package Lesson32;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Test {
    // Первый шаблон "2016,01-января || 09:00"
    private static final DateTimeFormatter FORMATTER1 = DateTimeFormatter.ofPattern("yyyy,dd-MMMM || HH:mm");

    // Второй шаблон "09:00 03/фев/16"
    private static final DateTimeFormatter FORMATTER2 = DateTimeFormatter.ofPattern("HH:mm dd/MMM/yy");

    public static void smena(LocalDateTime start, LocalDateTime end, Period period, Duration duration) {
        LocalDateTime current = start;

        while (current.isBefore(end)) {
            // Форматирование текущей даты по двум шаблонам
            String formattedDate1 = current.format(FORMATTER1);
            String formattedDate2 = current.format(FORMATTER2);

            // Вывод отформатированных дат
            System.out.println(formattedDate1);
            System.out.println(formattedDate2);

            // Добавление периода и длительности к текущей дате
            current = current.plus(period).plus(duration);
        }
    }

    public static void main(String[] args) {
        // Пример использования метода smena
        LocalDateTime start = LocalDateTime.of(2016, 1, 1, 9, 0);
        LocalDateTime end = LocalDateTime.of(2016, 2, 1, 9, 0);
        Period period = Period.ofDays(1);
        Duration duration = Duration.ofHours(2);

        smena(start, end, period, duration);
    }
}

