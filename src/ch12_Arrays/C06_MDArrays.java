package ch12_Arrays;

import java.util.Arrays;

public class C06_MDArrays {
    public static void main(String[] args) {
/*
      Çok Boyutlu Diziler
Java'da Çok Boyutlu Diziler varsayılan bir veri tipi olarak bulunmazlar ve matris olarak adlandırılırlar.
 Dizilerin 2 boyutlu halleri şeklinde tanımlanırlar. Matrisler satır ve sütun şeklinde tablo verisi
 formatındaki verileri tutmak için kullanılır. Diziler liste halinde veriler için uygunken,
 matrisler tablo şeklindeki veriler için uygundur. Oluşturulan tabloda bir değere ulaşmak istersek
 satır ve sütun sayısını girmemiz yeterli olacaktır.
* TRICK :)İki boyutlu dizilerde tek boyutlu diziler gibi indis değeri 0'dan başlar.
Dizide tutulacak veri tipleri aynı olmak zorundadır farklı veri tiplerini aynı matriste tutamayız.

       * 1- Ic Icice olusturulan  array'lerde   disardaki ana array'e outer-> Kat  array
       *  icerdeki  array'lere  inner->Daire array denir
       * 2- TRICK->  icerdeki array'lerin boyutlari birbirinden farkli ise
       *  Array'i ancak tum elemenlari atanarak declare edilmeli
       * 3- Multi dimensional array'de bir elemanin indexi icin
       *  en distaki array haric, elemania kadar ic ice olan tum arraylerin indexlerini yazmak gerekir
       */

//MD array tanimla

        int [] arr = new int[3];

        int [][] arr1 = new int[3][5]; // 3 satir ve her satirda 5 sutun olacak
        //3 katli bina ve her katında 5 daire olacak


        System.out.println("Arrays.toString(arr1) = " + Arrays.toString(arr1));

        //Arrays.toString(arr1) = [[I@19dfb72a, [I@17c68925, [I@7e0ea639]

        System.out.println("Arrays.deepToString(arr1) = " + Arrays.deepToString(arr1));

        //Arrays.deepToString(arr1) = [[0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0]]


        int [][][] arr2 = new int [2][3][5];

        // site de apt. daire örneği olabilir 5'er tane daire 3 katlı herbiri 2 tane bina

        System.out.println("Arrays.deepToString(arr2) = " + Arrays.deepToString(arr2));

        //Arrays.deepToString(arr2) = [[[0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0]], [[0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0]]]


        // task 24 kişilik 3 sınıf ve 21 kişilik 5 sınıfı olan okul nasıl array olarak tanımlanır

        int sinif24 [][] = new int[3][24];
        int sinif21 [][] = new int[5][21];

        // MD array e eleman ekleme

        arr1[0][3]=35; // 0. kat 3. daireye 35 ekledik

        System.out.println("Arrays.deepToString(arr1) = " + Arrays.deepToString(arr1));
        //Arrays.deepToString(arr1) = [[0, 0, 0, 35, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0]]


        //task atadığınız 35 değeriniz print ediniz

        System.out.println("arr1[0][3] = " + arr1[0][3]);//arr1[0][3] = 35

        //manuel olarak MD array oluşturma

        int [][] mdArr = {
                {1,2,3},// 0. kat //inner array
                {10,20}, //1. kat //inner array
                {103}//2. kat //inner array
        };//outer array

        System.out.println("mdArr.length = " + mdArr.length);//mdArr.length = 3

        // outer arrayindeki son arrayin son elemanını print ediniz

        System.out.println("mdArr[mdArr.length-1][mdArr[mdArr.length-1].length-1] = "
                + mdArr[mdArr.length - 1][mdArr[mdArr.length - 1].length - 1]);//103

        System.out.println("mdArr[1] = " + mdArr[1]);//mdArr[1] = [I@3f2a3a5

        System.out.println("Arrays.toString(mdArr[1]) = " + Arrays.toString(mdArr[1]));//Arrays.toString(mdArr[1]) = [10, 20]

        System.out.println("Arrays.deepToString(mdArr) = " + Arrays.deepToString(mdArr));//Arrays.toString(mdArr[1]) = [10, 20]


    }
}
