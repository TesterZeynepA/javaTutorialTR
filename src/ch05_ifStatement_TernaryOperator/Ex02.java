package ch05_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
       /*
Kullanicidan 100 uzerinden notunu isteyin.
Not'u harf sistemine cevirip yazdirin.
50’den kucukse "D",->1,2,3..49
=50  <60 arasi "C",->50,51,52,..59
=60  <80 arasi "B",->60,61,62,63..79
=80’nin uzerinde ise "A"->80,81..100
*/

Scanner scanner = new Scanner (System.in);
        System.out.println("notu giriniz");
        int not= scanner.nextInt();

        if (not < 0) { // negatif girme ihtimali calısıldı

            System.out.println("girdiğiniz not negatif ve geçersiz");
        }

          else if (not <50) { //50den küçükse "D",->1,2,3
            System.out.println("D");
        }
                else if (not>= 50 && not < 60) { // =50 < 60 arasi "C", -> 50, 51,52,..59
            System.out.println("C");
        }
                    else if (not>=60 && not <80) { // =60 < 80 arasi "B" -> 60, 61, 62
            System.out.println("B");
        }
                        else if (not>=80 && not <=100) { // =80 < 100 arasi "A" -> 80, 81,...100,
                            System.out.println("A");
                        }

else {
            System.out.println("Girdiğiniz not geçersiz");
        }



    }
}
