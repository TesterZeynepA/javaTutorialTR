package Challange08;

public class Task07 {
    public static void main(String[] args) {
        /* task->
         * verilen  {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}} int 2D arrayini için
         *  2D arrayinden min number print den code create ediniz.
         */

        int arr[][] = {{1, 2, 3}, {2, 3, 1}, {5, 5, 5}, {2, -1}};

        int minNumber = arr[0][0]; // array'in ilk elemanini başlangıçta en küçük eleman kabul edersek

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < minNumber) {
                    minNumber = arr[i][j];
                }
            }
        }

        System.out.println("En küçük sayı: " + minNumber);
    }

}
