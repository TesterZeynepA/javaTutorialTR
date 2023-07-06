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

        Scanner input = new Scanner(System.in);
        System.out.println("Array in boyutunu giriniz");
        int boyut= input.nextInt();

        int [] arr = new int[boyut];

        System.out.println("Array in elemanlarını giriniz");

        for (int i = 0; i < boyut; i++) {

            arr[i] = input.nextInt();

        }

        int [] yeniArr = new int[0];

        for (int i = 0; i < boyut; i++) {

            if (i==(i+1)) {


            }
        }

    }

    }




