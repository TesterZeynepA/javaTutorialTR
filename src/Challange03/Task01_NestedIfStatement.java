package Challange03;

import java.util.Scanner;

public class Task01_NestedIfStatement {
    public static void main(String[] args) {
        /* Task->
   Girilen  yas data için
	    oy kullanma yasi :
	 	age >= 18  ==> oy kullanmaya uygun
	 	age >= 70  ==> uc kez oy kullanabilir
	 	70 > age >=50 ==> iki kez oy kullanabilir
	 	50 > age >=18 ==> bir kez oy kullanabilir,
	 	print eden code create ediniz...
	 */

        Scanner input = new Scanner(System.in);
        System.out.println("Yasinizi giriniz");
        int yas = input.nextInt();
        String result = yas < 18 ? "yasinizi oy kullanmak için uygun degil" : yas >= 18 && yas < 50 ? "yasiniz oy kullanmaya uygun ve 1 oy kullanabilirsiniz"
                : yas >= 50 && yas < 70 ? "iki kez oy kullanabilirsiniz" : yas >= 70 ? "uc kez oy kullanabilirsiniz": "gecersiz bir sayi girdiniz";

        System.out.println("result = " + result);


    }
}
