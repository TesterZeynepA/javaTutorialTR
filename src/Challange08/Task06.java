package Challange08;

public class Task06 {
    public static void main(String[] args) {
        /* task->
         * arr1 = { {0,2,-1}, {3,8,9}, {7} }  ve  arr2 = { {-7,6,-9}, {0,12}, {19} }  veriliyor.
         * Bu iki array'in tum elemanlarinin toplamini print eden code create ediniz.

         */

        int arr1[][] = { {0,2,-1}, {3,8,9}, {7} };
        int arr2[][] = { {-7,6,-9}, {0,12}, {19} };

        int toplam = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                toplam += arr1[i][j];
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                toplam += arr2[i][j];
            }
        }

        System.out.println("İki array'in bütün elemanlarının toplamı: " + toplam);
    }
}