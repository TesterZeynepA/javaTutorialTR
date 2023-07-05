package InterviewQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class Q01_CountsOfCharactersWithArray {
   /* Task->
     Girilen bir String'de var olan her character'in sayisini print eden code create ediniz.
     Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
            abaa   ==> a=3  b=1
    */
   public static void main(String[] args) {


      Scanner input = new Scanner(System.in);
      System.out.println("String bir ifade giriniz");
      String str = input.next();

      karakterSayaci(str);
   }

   public static void karakterSayaci(String str) {

      // Karakterlerin sayısını saklamak için bir dizi oluşturulur

      int[] karakterList = new int[256]; // ASCII karakter setine göre 256 karakter

      // Alternatif olarak, Unicode karakter seti için `new int[Character.MAX_VALUE + 1]` kullanılabilir

      // String üzerindeki her bir karakter gezilir

      for (int i = 0; i < str.length(); i++) {

         char c = str.charAt(i);

         // Karakterin ASCII değeri kullanılarak dizideki ilgili indeks bulunur

         int index = (int) c;

         // Karakterin sayısı bir artırılır

         karakterList[index]++;
      }

      // Her bir karakterin sayısı ekrana yazdırılır
      for (int i = 0; i < karakterList.length; i++) {
         if (karakterList[i] > 0) {
            System.out.println((char) i + ": " + karakterList[i]);
         }
      }


      }

   }
