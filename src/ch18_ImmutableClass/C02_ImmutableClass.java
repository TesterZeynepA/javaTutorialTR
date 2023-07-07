package ch18_ImmutableClass;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class C02_ImmutableClass {
    public static void main(String[] args) {

       /*
 Boolean, Short, Integer, Long, Float, Double, Char ve String gibi tüm kapsayıcı sınıflar (Wrapper Class)
 BigDecimal, BigInteger ,LocalDate LocalTime  java'da immutable->değişmez sınıflara örnek olarak gösterilebilir.
       Date,LocalDateTime StringBuilder, StringBuffer, Arrays ve ArrayList de Mutable (değişebilir) class'lardır.
*/

//immutable

        LocalDate bugun = LocalDate.now();

        System.out.println("bugun = " + bugun);//bugun = 2023-07-07

        bugun.plusDays(5);

        System.out.println("bugun = " + bugun);//bugun = 2023-07-07

        //immutable

        LocalTime simdi = LocalTime.now();

        System.out.println("simdi = " + simdi);//simdi = 23:13:02.231555300

        simdi.plusHours(5);

        System.out.println("simdi = " + simdi);//simdi = 23:13:02.231555300

        //mutable

        Date date = new Date();

        System.out.println("date = " + date);//date = Fri Jul 07 23:14:43 EET 2023

        date.setTime(155454545645L);

        System.out.println("date = " + date);//date = Thu Dec 05 07:49:05 EET 1974


    }
}
