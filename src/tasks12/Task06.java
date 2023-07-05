package tasks12;

import java.util.Arrays;
import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        // Task-> verilen bir int arrayi elemanlrını buyukten kucuge siralayip return eden METHOD create ediniz

        Scanner input = new Scanner(System.in);
        System.out.println("Array in boyutunu giriniz");

        int boyut = input.nextInt();

        int [] arr = new int [boyut];

        System.out.println("Array in elemanlarını giriniz");

        for (int i = 0; i < boyut; i++) {

            arr[i] = input.nextInt();
        }

        Arrays.sort(arr);

        System.out.println("Array elemanlarının büyükten küçüğe sıralaması:");

        terstenArray(arr);

        int[] buyuktenKucugeArr = tersCevrilmisArray2(arr);

        System.out.println("Büyükten küçüğe sıralanan array: " + Arrays.toString(buyuktenKucugeArr));

    }

    public static void terstenArray(int[] arr) {
        int bas = 0;
        int son = arr.length - 1;

        while (bas < son) {
            int yeniArr = arr[bas];
            arr[bas] = arr[son];
            arr[son] = yeniArr;
            bas++;
            son--;


        }

        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));



    }



    public static int[] tersCevrilmisArray2(int[] array) {

        Arrays.sort(array);

        // Array i terse çeviriyoruz

        int[] buyuktenKucugeArr = new int[array.length];
        int index = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            buyuktenKucugeArr[index] = array[i];
            index++;
        }

        return buyuktenKucugeArr;

      // System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
      // int []buyuktenkucuge= buyuktenkucuge(arr);
      // System.out.println("Arrays.toString((buyuktenkucuge)) = " + Arrays.toString((buyuktenkucuge)));

      // public static int[] buyuktenkucuge(int[] arr) {
      //     Arrays.sort(arr);
      //     int[] buyuktenkucuge = new int[arr.length];
      //     for (int i = 0; i < arr.length; i++) {
      //         buyuktenkucuge[i]=arr[arr.length-1-i];
      //     }
      //     return buyuktenkucuge;
      //

        }}




