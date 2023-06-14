package Challange05;

public class Q02_ForLoop {
    public static void main(String[] args) {

        //Interview Question
        // 0-255 e kadar olan harflerin , sayı ve harf değerini ekrana yazdırınız.

        System.out.println("***** for ile çözüm *****");

        for (int i = 0; i <=255 ; i++) {

            char karakter= (char)i;
            System.out.println(i + " 'nin karakter değeri " + karakter);

        }

       System.out.println("***** while ile çözüm *****");

       int a=0;

       while (a<=255) {

           char c = (char)a;

           System.out.println(a + " 'nın karakter değeri " + c);

           a++;

        }


        System.out.println("***** do while ile çözüm *****");
        int x=0;
        do {
            char d = (char)x;
            System.out.println(x + "'nin karakter değeri " +d);
            x++;
        }
        while (x<=255);




    }


}
