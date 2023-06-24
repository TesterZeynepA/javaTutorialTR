package tasks12;

public class _07_array_max_value {

    public static void main(String[] args) {

        /*
            int Array oluşturun ve elemanları : 12,2,5,15,8
            En büyük değeri yazdırınız.
         */

        // code start here


        int [] arr = {12, 2, 5, 15, 8};

        int enBuyuk = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i]>enBuyuk) {

                enBuyuk=arr[i];
            }

        }
        System.out.println("Array deki en büyük değer = " + enBuyuk);

    }
}

