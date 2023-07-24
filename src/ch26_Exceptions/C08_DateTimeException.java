package ch26_Exceptions;

import java.time.DateTimeException;
import java.time.LocalDate;

public class C08_DateTimeException {
    public static void main(String[] args) {

        //LocalDate date = LocalDate.of(2023,4,33);

       //RTE  System.out.println("date = " + date);
        //Exception in thread "main" java.time.DateTimeException: Invalid value for DayOfMonth (valid values 1 - 28/31): 33

        try {
            LocalDate date = LocalDate.of(2023,4,33);
            System.out.println("try sorunsuz çalisti");

        }catch (DateTimeException e){

            System.out.println("catch block yakaladı exception i. ay sayisi fazla girildi.");

            System.out.println(e.getMessage());
        }
        System.out.println("sorun çözüldü devam et");

    }
}
