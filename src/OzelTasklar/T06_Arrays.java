package OzelTasklar;

import java.util.Scanner;

public class T06_Arrays {
    public static void main(String[] args) {
        /* TASK :
         kullanıcıdan alınan bir  String'deki herbir  karakterin adedini bir array içinde yazdıran bir java programı yazın.
         String  "Javacilar cook afilli" ise cevap şöyle olmalıdır:
         { =2, a=3, r=1, c=1, v=1, o=2, f=1, l=2, J=1, i=2}
         */
        Scanner input = new Scanner(System.in);

        System.out.print("String bir metin giriniz: ");
        String str = input.nextLine();

        int[] karakterSayisi = karakterSayma(str);

        System.out.println("Karakter Adetleri:");
        for (int i = 0; i < karakterSayisi.length; i++) {
            if (karakterSayisi[i] > 0) {
                System.out.println((char) (i + 'a') + ": " + karakterSayisi[i]);
            }
        }
    }

    public static int[] karakterSayma(String str) {
        int[] karakterSayi = new int[26]; // İngiliz alfabesi olduğu için 26 harf

        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            if (Character.isLetter(ch)) {
                karakterSayi[ch - 'a']++;
            }
        }
        return karakterSayi;
    }
}

    

