package ch16_DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class C03_LocalDateTime {
    public static void main(String[] args) {

        // LocalDateTime -> tarih ve zaman bilgilerini tutar


        LocalDateTime ldt = LocalDateTime.now();

        System.out.println("ldt = " + ldt);//ldt = 2023-07-06T20:55:55.214152700

        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();

        LocalDateTime dt = LocalDateTime.of(date, time);

        System.out.println("dt = " + dt);//dt = 2023-07-06T20:57:57.535846300

        System.out.println("dt.plusYears(3) = " + dt.plusYears(3));//dt.plusYears(3) = 2026-07-06T21:01:55.713346900





    }
}
