package InterviewQuestions.dosyaOkuma;

import java.io.FileInputStream;
import java.io.IOException;


public class dosyaOkuma {
    public static void main(String[] args) throws IOException {
        // Listede kac baslik ve
        // bu basliklar altinda kac urun oldugunu bulalim
        // listedeki urunleri vebaşlıklarını print ediniz
        // String  dosyaYolu="src/dosyaOkuma/urunler.txt";
        //FileInputStream fis =new FileInputStream(dosyaYolu);
        FileInputStream fis = new FileInputStream("src/dosyaOkuma/urunler.txt");//dosya erişimi fise atandı

        String metin = "";
        int metinSatırKontrol;
        // while ((fis.read()) != -1) {//cursor character olmayana kadar tekrar
        while ((metinSatırKontrol = fis.read()) != -1) {//cursor character olmayana kadar tekrar
            // metin += (char) fis.read();//text'teki tum characterler metine atandı
            metin += (char) metinSatırKontrol;//text'teki tum characterler metine atandı
        }
        String tumUrun[] = metin.split("-");

        //System.out.println(Arrays.toString(tumUrun));
        for (int i = 0; i < tumUrun.length; i++) {
            System.out.print(tumUrun[i] + "-");
        }
        System.out.println("listedeki urun sayısı :" + (tumUrun.length - 1));

        int baslıkSayisi = 0;
        for (int i = 0; i < metin.length(); i++) {
            if (i == 0) {
                if (Character.isDigit(metin.charAt(i))) {
                    baslıkSayisi++;
                }
            } else {
                if (Character.isDigit(metin.charAt(i)) && (!Character.isDigit(metin.charAt(i - 1)))) {
                    baslıkSayisi++;
                }

            }
        }

        System.out.println("baslıkSayisi = " + baslıkSayisi);

    }

}