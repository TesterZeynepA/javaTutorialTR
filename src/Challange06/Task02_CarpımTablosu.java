package Challange06;

public class Task02_CarpımTablosu {
    // 1 x 1 = 1
    // 1 x 2 = 2
    // 1 x 3 = 3
    // 1 x 4 = 4
    // 1 x 5 = 5
    // 1 x 6 = 6
    // 1 x 7 = 7
    // 1 x 8 = 8
    // 1 x 9 = 9
    // 1 x 10 = 10
    // Task-> Yukarıdaki çarpım tablosunu 10 a kadar print eden code create ediniz.

    public static void main(String[] args) {
        int num =1;
        int i =1;
        while (i<=10){

            System.out.println("(çarpım tablosu = " + (num + "x" + i + "=" + (num * i)));
            i++;

        }
// hocanın çözümü
        for (int kat = 1; kat <=10 ; kat++) {// outer lopp-> dış döngü-> kat tekrarı
            for (int daire = 1; daire <=10 ; daire++) {// inner lopp->iç döngü-> daire tekrarı
                System.out.println(kat+" x "+daire+" = "+(kat*daire));
            }
            System.out.println();
        }


        }







    }



