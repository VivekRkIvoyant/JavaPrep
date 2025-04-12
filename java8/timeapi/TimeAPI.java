package java8.timeapi;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class TimeAPI {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        System.out.println(today);
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);

        LocalDate specificDate = LocalDate.of(2025, Month.APRIL, 8);
        System.out.println(specificDate);

        LocalTime specificTime = LocalTime.of(10, 30, 45);
        System.out.println(specificTime);
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);

        ZonedDateTime zonedNow = ZonedDateTime.now();
        System.out.println(zonedNow);



        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatted = currentDateTime.format(formatter);
        System.out.println(formatted);
        String dateString = "2025-04-01";
        LocalDate parsedDate = LocalDate.parse(dateString);
        System.out.println(parsedDate);
        LocalDate date1 = LocalDate.of(2024, 4, 1);
        LocalDate date2 = LocalDate.of(2025, 4, 1);
        long daysBetween = ChronoUnit.DAYS.between(date1, date2);
        System.out.println(daysBetween);



        LocalDate futureDate = today.plusDays(10);
        System.out.println(futureDate);

        LocalDate pastDate = today.minusWeeks(2);
        System.out.println(pastDate);

        boolean isLeapYear = today.isLeapYear();
        System.out.println(isLeapYear);
        DayOfWeek dayOfWeek = today.getDayOfWeek();
        System.out.println(dayOfWeek);
        Month month = today.getMonth();
        System.out.println(month);
    }
}
