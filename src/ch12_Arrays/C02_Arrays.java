package ch12_Arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {
        // Array elemanı varlığını kontrol etme
        // istenen sayiyi arrayda var mı yok mu kontrol ediniz

        int [] numbers = {12, 13, 55, 66, 35, 3, 4, 34, 33, 63, 72};

        int istenenSayi =35;
        int count =0;
        boolean flag= false;

        for (int i = 0; i < numbers.length; i++) {

            if (istenenSayi==i){
                count++;
                flag =true;
                break;
            }

        }

        //count mantiği ile bulma

        if (count>=1){
            System.out.println("sayı mevcut " +istenenSayi);

        }else System.out.println("sayi bulunmuyor");

        System.out.println("sayi adedi " + count);

        //flag mantığı ile kontrol

        if (flag){

            System.out.println("sayi mevcut " + istenenSayi);
        }else System.out.println("sayı bulunamadi");


        Arrays.sort(numbers);
        System.out.println("numbers = " + numbers);//numbers = [I@62043840
        System.out.println("Arrays.toString(numbers) = " + Arrays.toString(numbers));
        //Arrays.toString(numbers) = [3, 4, 12, 13, 33, 34, 35, 55, 63, 66, 72]

        System.out.println("Arrays.binarySearch(numbers, istenenSayi) = " + Arrays.binarySearch(numbers, istenenSayi));

        //Arrays.binarySearch(numbers, istenenSayi) = 6


    }
}
