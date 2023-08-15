package ch05_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        /*
 TASK -> girilen bir ifadenin ilk karakterinin harf  olup olmadığını  kontrol eden code create ediniz..

*/
        Scanner input = new Scanner (System.in);
        System.out.print("bir ifade gir ");
        char ilkKarakter =input.next().charAt(0); // girilen ifadenin ilk karakteri charAt (0) ile alinip atandi.
        // önemli bir hatırlatma. char variable lar matematiksel ve karsilastirmali islemlerde ASCII degerine göre islem yapar.

       //ilk karakter A ascii değerinden büyük Z ascii değerinden küçükse harftir


        if (ilkKarakter>= 'A' && ilkKarakter <= 'Z' ||ilkKarakter<= 'a' && ilkKarakter <= 'z') {
            System.out.println("girdigin ifadenin ilk karakteri harf değildir " + ilkKarakter);

        } else System.out.println("girdigin ifadenin ilk karakteri harftir " + ilkKarakter);










    }
}
