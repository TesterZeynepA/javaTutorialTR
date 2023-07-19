package InterviewQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q33_CollectionsMethodsTask {
    // part 1: create list of 5 numbers from user input
    // sort the list in reverse order and print it
    // shuffle the list and print it
    // rotate right by 3 places and print it

    // bölüm 1: kullanıcı girişinden 5 sayı listesi oluşturun
    // listeyi ters sırada sırala ve yazdır
    // listeyi karıştır ve yazdır
    // 3 br saga kaydir ve yazdır

    // part 2: find the max number and min number, print them
    // replace all max number with min number

    // bölüm 2: maksimum sayıyı ve minimum sayıyı bulun, yazdırın
    // tüm maksimum sayıları minimum sayı ile değiştir


    public static void main(String[] args) {
        List<Integer> sayiList = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.println("5 adet sayı girin:");
        for (int i = 0; i < 5; i++) {
            int sayi = input.nextInt();
            sayiList.add(sayi);
        }

        //listeyi ters çevirme

        Collections.reverse(sayiList);
        System.out.println("Ters çevirilmiş liste: " + sayiList);

        //listeyi karışık sıralama

        Collections.shuffle(sayiList);
        System.out.println("Karışık sıralanmış liste: " + sayiList);

        //listeyi 3 birim sağa kaydırma

        Collections.rotate(sayiList, 3);
        System.out.println("3 birim sağa kaydırılmış liste: " + sayiList);

        // Maksimum sayıyı bulma
        int maxNumber = Collections.max(sayiList);
        System.out.println("Listin MAX sayisi: " + maxNumber);

        // Minimum sayıyı bulma
        int minNumber = Collections.min(sayiList);
        System.out.println("Listin MIN sayisi: " + minNumber);

        // maksimum sayı ile minimum sayıyı değiştirme
        Collections.replaceAll(sayiList, maxNumber, minNumber);
        System.out.println("Listin max sayisi ile min sayisi değişmiş hali: " + sayiList);
    }
}