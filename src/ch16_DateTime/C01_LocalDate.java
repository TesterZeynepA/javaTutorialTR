package ch16_DateTime;

import java.time.LocalDate;
import java.time.Month;

public class C01_LocalDate {
    public static void main(String[] args) {

        //LocalDate -> sadece yil, ay, gun tutar

        LocalDate bugun= LocalDate.now();


        System.out.println("bugun = " + bugun);//bugun = 2023-07-05


        System.out.println("bugun.isLeapYear() = " + bugun.isLeapYear());//bugun.isLeapYear() = false


        System.out.println("bugun.getYear() = " + bugun.getYear());//bugun.getYear() = 2023

        System.out.println("bugun.getEra() = " + bugun.getEra());//bugun.getEra() = CE

        //ce terimi, "Common Era" ifadesinin kısaltmasıdır ve Milattan Sonra (M.S.) anlamina gelmektedir

        System.out.println("bugun.getDayOfYear() = " + bugun.getDayOfYear());//bugun.getDayOfYear() = 186

        LocalDate date1 = LocalDate.of(1990, 8, 23);
        LocalDate date2 = LocalDate.of(1996, 8, 23);
        LocalDate date3 = LocalDate.of(1990, Month.AUGUST, 23);



    }
}
