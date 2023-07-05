package tasks12;

import java.util.Arrays;
import java.util.Scanner;

public class Task05 {


    public static void main(String[] args) {
        // Task-> girilen int değeri tersten print eden code create ediniz.


        Scanner input = new Scanner(System.in);
        System.out.println("Array in boyutunu giriniz");

        int boyut = input.nextInt();

        int [] arr= new int[boyut];

        System.out.println("Array in elemanlarını giriniz");

        for (int i = 0; i < boyut; i++) {

            arr[i] = input.nextInt();

        }

        System.out.println("Arrayin ters hali:");
        tersArr(arr);
    }

    public static void tersArr(int[] arr) {
        int baslangic = 0;
        int son = arr.length - 1;

        while (baslangic < son) {
            int yeniArr = arr[baslangic];
            arr[baslangic] = arr[son];
            arr[son] = yeniArr;
            baslangic++;
            son--;
        }

            System.out.print(Arrays.toString(arr));






        //2. yol

      // String tersNumber="";
      // String numStr=Integer.toString(num);//"12345"
      // String [] numArray=numStr.split("");//{1,2,3,4,5}

      // System.out.println("Arrays.toString(numArray) = " + Arrays.toString(numArray));

      // for (int i = numArray.length-1; i >=0; i--) {
      //     System.out.print(numArray[i]+ " ");
      //     tersNumber+=numArray[i];
      // }
      // //System.out.println("Arrays.toString(tersArray) = " + Arrays.toString(tersArray));
      // System.out.println("tersNumber = " + Integer.parseInt(tersNumber));

//3. yol

     //   System.out.println("bir sayı giriniz...");
     //   int sayi= input.nextInt();
     //   System.out.print("girdiğiniz syının tersi: ");
     //   while (sayi!=0) {
     //       int b = sayi % 10;
     //       sayi = sayi / 10;
     //       System.out.print(b);
//
     //   }
    }

}
