package InterviewQuestions;

import java.util.Random;

public class Q57_RandomCiftSayi {

    public static void main(String[] args) {
        //task->0-20 arasında  Math.random() kullanarak cikan sayinin cift ya da tek olmasını kontrol eden code create ediniz

        //Math.random()* ((max-min)+1)+min);-> max ile min arası rastgele sayi üreten komut

    int rastgele = (int) (Math.random()*((20-0)+1)+0);

        System.out.println("rastgele = " + rastgele);
        System.out.println(rastgele % 2 == 0 ? "cift sayi" : "tek sayi");
    }
}
