package Challange08;

public class Task02 {
    public static void main(String[] args) {
        /* task->
         * dizi elemanlarinin ortalama degerini hesaplayan ve
         * ortalamadan buyuk olan elemanlari print eden code create ediniz.
         * input[]= {1,2,3,4,5,6,7}
         * Output1 : 4
         * Output2 : 5,6,7
         */

        int arr [] = {1,2,3,4,5,6,7};


        int rakamToplami = 0;
        for (int i = 0; i < arr.length; i++) {
            rakamToplami += arr[i];
        }
        double ortalama = (double) rakamToplami / arr.length;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > ortalama) {
                System.out.println(arr[i]);
            }
        }








    }
}