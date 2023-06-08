package Challange03;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Task04_SwitchCase {
    public static void main(String[] args) {

            /*
    switch() de long kullanilmaz, float kullanilmaz, double kullanilmaz, boolean kullanilmaz.
	switch() de int, byte, short, char, String kullanilir.
     */
 /*  Task->
    gunleri gösterebilen bir program yazın
    gun Pazartesi veya Sali ise:
    Java dersi gunleri

    gun Persembe veya Cuma ise:
    Selenyum dersi gunleri

    gun carsamba veya cumartesi ise:
    SQL dersi gunleri

    aksi halde: izin gunu
    (if deyimini KULLANMAYIN)
*/

        Scanner input = new Scanner(System.in);
        System.out.println("lütfen bir gün adı giriniz");
        String gün = input.nextLine().toLowerCase();


        switch (gün) {

            case "pazartesi":
            case "sali" :
                System.out.println("Java dersi günleri");
                break;
            case "perşembe":
            case "cuma":
                System.out.println("Selenyum dersi günleri");
                break;
            case "çarşamba":
            case "cumartesi":
                System.out.println("SQL dersi günleri");
                break;
            default:
                System.out.println("izin günü");
                break;







        }

















    }
}
