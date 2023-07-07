package InterviewQuestions;

import java.util.*;

public class Q13_UniqeArray {
    /* task->
     * Verilen array deki tekrar eden sayilari, ilki haric silip, tekrarsiz
     * sayilardan olusan bir array print eden code create ediniz.
     *
     * INPUT : {1,2,2,3,1,4,2,-2,5,6,8,7,5,6,-2,9,3,10}
     * OUTPUT : [1, 2, 3, 4, -2, 5, 6, 8, 7, 9, 10]
     */
    public static void main(String[] args) {

      //  int[] number = {1, 2, 2, 3, 1, 4, 2, -2, 5, 6, 8, 7, 5, 6, -2, 9, 3, 10};

         Scanner input = new Scanner(System.in);
         System.out.println("Array in boyutunu giriniz");
         int boyut= input.nextInt();
//
         int [] number = new int[boyut];
//
         System.out.println("Array in elemanlarını giriniz");
//
         for (int i = 0; i < boyut; i++) {
//
             number[i] = input.nextInt();
//
         }

        ArrayList<Integer> tekrarsızSayilar = new ArrayList<>();

        for (int i = 0; i < number.length; i++) {
            boolean yinelenenSayi = false;
            for (int j = i + 1; j < number.length; j++) {
                if (number[j] == number[i]) {
                    yinelenenSayi = true;
                    break;
                }
            }
            if (!yinelenenSayi) {
                tekrarsızSayilar.add(number[i]);
            }
        }

        int[] yeniArr = new int[tekrarsızSayilar.size()];

        for (int i = 0; i < tekrarsızSayilar.size(); i++) {

            yeniArr[i] = tekrarsızSayilar.get(i);


        }
        //Yeni diziyi yazdıralim

        for (int num : yeniArr) {

            System.out.println(num + " ");

        }


    }


}







