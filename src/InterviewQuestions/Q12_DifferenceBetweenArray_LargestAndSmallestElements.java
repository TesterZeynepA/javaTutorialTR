package InterviewQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class Q12_DifferenceBetweenArray_LargestAndSmallestElements {
    /*
 Create a function that takes an array and the difference between the largest
 and the smallest numbers.
 Ask user to enter array elements.
    Girilen  bir array'in en buyuk elemani ile
    en kucuk elemanının  farkını return eden  method create ediniz.
 */
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Array in boyutunu giriniz");
        int boyut = input.nextInt();

        int [] arr = new int [boyut];

        System.out.println("Array in elemanlarını giriniz");

        for (int i = 0; i < boyut; i++) {

            arr[i] = input.nextInt();
        }

        Arrays.sort(arr);

        System.out.println("enBuyukEnKucukFarki(arr) = " + enBuyukEnKucukFarki(arr));

    }

    private static int enBuyukEnKucukFarki(int[] arr) {

        int enKucuk= arr[0];
        int enBuyuk= arr[arr.length-1];

        int fark = enBuyuk - enKucuk;


        return fark;
    }
}