package tasks06;

import java.util.Scanner;

public class Task05 {

    public static void main(String[] args) {
		/*
		TASK :
		Kullanıcıdan notunu alın ve aşağıdaki kurallara göre console'a A, B, C veya D yazdırın.
		1. 0(dahil) ile 50 arasi - D
		2. 50(dahil) ile 60 arası - C
		3. 60(dahil) ile 80 arası - B
		4. 80(dahil) ustu- A
		Yanlis not girilirse ekrana "Gecerli not giriniz" yazdirin

		 */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen aldığınız notu giriniz");
        int not = input.nextInt();

         if (not>=0 && not <50) {
             System.out.println("D");
         }else if (not >=50 && not <60) {
             System.out.println("C");
         }else if (not >=60 && not <80) {
             System.out.println("B");
         }else if (not >=80 && not <=100) {
             System.out.println("A");
         }else
             System.out.println("Geçerli bir not giriniz");



    }


}
