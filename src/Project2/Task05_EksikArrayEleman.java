package Project2;

public class Task05_EksikArrayEleman {
    /*
    Task-> 1 den 10 a kadar sayılar oluşan dizide eksik olan sayıyı return eden  metod create ediniz..

     ([1, 2, 3, 5, 6, 7, 8, 10,9]) ➞ 4
    ([7, 2, 3, 10, 5, 9, 1, 4, 8]) ➞ 6
    ([7, 5, 1, 2, 4, 6, 8, 3, 9]) ➞ 10

     */

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 5, 6, 7, 8, 10, 9};
        int[] arr1 = {7, 2, 3, 10, 5, 9, 1, 4, 8};
        int[] arr2 = {7, 5, 1, 2, 4, 6, 8, 3, 9};
        int[] arr3 = {7, 5, 10, 2, 4, 6, 8, 3, 9};


        int eksikSayi = eksikSayiyiBulma(arr);

        System.out.println("Eksik sayı: " + eksikSayi);
    }

    public static int eksikSayiyiBulma(int[] arr) {
        int n = arr.length + 1; // 1'den 10'a kadar 10 adet sayı var, bu yüzden n = 11
        int toplam = (n * (n + 1)) / 2; // 1'den n'e kadar olan sayıların toplamı

        int arrToplam = 0;

        for (int i = 0; i < arr.length; i++) {

            arrToplam += arr[i];

        }

        int eksikSayi = toplam - arrToplam; // Eksik sayı, toplamdan dizideki sayıların toplamını çıkartarak bulunur
        return eksikSayi;
    }
}