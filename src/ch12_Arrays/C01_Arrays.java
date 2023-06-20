package ch12_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C01_Arrays {
    /*
    Array (Dizi): Java'da birden fazla variable store etmek icin kullanilan objelerden biridir
    Array olusturulurken 2 seyi declare etmeliyiz:
    1- data type (Bir array'in icerisinde sadece ayni data tipinden elemanlar omalıdır.)
    2- uzunluk (uzunluk array'in icerisne konul max eleman sayisini belirtir ve bundan fazlasini koymak istersek RTE verir)
    array= tepsiye benzer..
    Array'de primitive datalar veya non-primitive datalarin referanslari store edilebilir
     isimler array'inin icinde isim degerleri degil, isimlerin referanslari saklanır
     */
    public static void main(String[] args) {

// Array tanımlama

        int a;//primitive data type tanimlandi
        int[] arr;//declare edilen ama deger atanamayan int data type li ARRAY

        // System.out.println("a = " +a);
        //System.out.println("arr = " +arr); bir veriable atanmadığı için hata veriyor

        // task nameArray isminde isimleri tutan array create ediniz

        String[] nameArray = {"rumeysa", "ahmet", "zeynep", "tommy", "ali", "ömer",};
        //hem atama hem de tanımlama yapılan array

        //task number tutan array create ediniz
        int[] numArray = {11, 22, 333, 66, 55, 44, 88, 99, 55, 2, 44, 55, 6};//dublicate e izin veriyor

        int[] sayiArr = new int[5];

        System.out.println("sayiArr = " + sayiArr); //ref değeri görünür
        System.out.println("Arrays.toString(sayiArr) = " + Arrays.toString(sayiArr)); // [0, 0, 0, 0, 0] çıktısı verir

        sayiArr[0] = 35;

        System.out.println("Arrays.toString(sayiArr) = " + Arrays.toString(sayiArr));

        sayiArr[1] = 34;
        sayiArr[2] = 9;
        sayiArr[3] = 48;
        sayiArr[4] = 7;

        System.out.println("Arrays.toString(sayiArr) = " + Arrays.toString(sayiArr));// = [35, 34, 9, 48, 7]
        // RTE sayiArr[5] = 77;
        //java.lang.ArrayIndexOutOfBoundsException

        System.out.println("sayiArr.length = " + sayiArr.length);
        System.out.println("nameArray.length = " + nameArray.length);
        System.out.println("numArray.length = " + numArray.length);

        //task herbir array in son elemanını print ediniz

        System.out.println("sayiArr[sayiArr.length-1] = " + sayiArr[sayiArr.length - 1]);// sayiArr[sayiArr.length-1] = 7

        System.out.println("nameArray[nameArray.length - 1] = " + nameArray[nameArray.length - 1]);// nameArray[nameArray.length - 1] = ömer

        System.out.println("numArray[numArray.length - 1] = " + numArray[numArray.length - 1]);//numArray[nameArray.length - 1] = 44

        //task name array daki son elemani update ediniz

        nameArray[nameArray.length-1]= "QA Ömer";
        System.out.println("Arrays.toString(nameArray) = " + Arrays.toString(nameArray));
        
        // loop ile array in elemanları arasında gezinme

        for (int i = 0; i < nameArray.length; i++) {
            System.out.print(nameArray[i] + " ");


        }
        
        // task numArray deki çift index olan elemanlari print ediniz


        for (int i = 0; i < numArray.length; i+=2) {

            System.out.println(numArray[i] + " ");

        }
        System.out.println();
        // task nameArray in elemanlarindan 5 harfli olan elemanlari print ediniz


        for (int i = 0; i < nameArray.length; i++) {

            if (nameArray[i].length() == 5){
                System.out.println(nameArray[i]);


            }

        }

        System.out.println(" // sort //");

        System.out.println("Arrays.toString(nameArray) = " + Arrays.toString(nameArray));
        System.out.println("Arrays.toString(numArray) = " + Arrays.toString(numArray));
        System.out.println("Arrays.toString(sayiArr) = " + Arrays.toString(sayiArr));

        Arrays.sort(nameArray);
        Arrays.sort(numArray);
        Arrays.sort(sayiArr);

        System.out.println("Arrays.toString(nameArray) = " + Arrays.toString(nameArray));
        System.out.println("Arrays.toString(numArray) = " + Arrays.toString(numArray));
        System.out.println("Arrays.toString(sayiArr) = " + Arrays.toString(sayiArr));


    }
}
