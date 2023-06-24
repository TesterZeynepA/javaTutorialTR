package Project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MarketProject {
    /* TASK :
     * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
     * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
     *
     * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
     * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
     * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
     * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
     * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
     * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     * 			 ortalama kazançtan yüksekse o günleri return yap.
     * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
     * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     * 			 ortalama kazançtan aşağıysa o günleri return yap.
     * */

    static ArrayList<String> gunler = new ArrayList<>(Arrays.asList("p.tesi", "salı", "çarşamba", "perşembe", "cuma", "c.tesi", "pazar"));//1. adım
    static ArrayList<Double> gunlukKazanclar = new ArrayList<>();//2. adım
    static Scanner input = new Scanner(System.in);
    static double haftaninToplamKazanci = 0;
    public static void main(String[] args) {
        int gun = 0;
        while (gun < 7) {//3. adım...
            System.out.println("Agam hele " + gunler.get(gun) + " gunu hasılatını giresen :");
            double gununKazanci = input.nextDouble();
            gunlukKazanclar.add(gununKazanci);//tekrardan gelen her bir gunun hasılatı gunlukKazanclar liste eklendi
            haftaninToplamKazanci += gununKazanci;//tekrardan gelen her bir gunun hasılatı haftalık toplam kazaca eklendi
            gun++;
        }
        System.out.println(haftaninToplamKazanci);
        System.out.println(gunlukKazanclar);
        System.out.println("haftanın ortalama kazancı: " + getOrtalamaKazanc());//meth call.
        System.out.println("ortalama kazancın ustundeki gunler : " + getOrtalamaninUstundeKazancGünleri());
        System.out.println("ortalama kazancın ustundeki gunler : " + getOrtalamaninAltindaKazancGünleri());
    }//main sonu
    private static ArrayList<String> getOrtalamaninAltindaKazancGünleri() {
        ArrayList<String> ortalamaAltıGun = new ArrayList<>();
        for (int i = 0; i < gunlukKazanclar.size(); i++) {
            if (gunlukKazanclar.get(i) < getOrtalamaKazanc()) {
                ortalamaAltıGun.add(gunler.get(i));
            }
        }
        return ortalamaAltıGun;
    }
    private static ArrayList<String> getOrtalamaninUstundeKazancGünleri() {//5. adım
        ArrayList<String> ortalamaUstuGun = new ArrayList<>();
        for (int i = 0; i < gunlukKazanclar.size(); i++) {
            if (gunlukKazanclar.get(i) > getOrtalamaKazanc()) {
                ortalamaUstuGun.add(gunler.get(i));
            }
        }
        return ortalamaUstuGun;
    }
    private static double getOrtalamaKazanc() {//4. adım
        return haftaninToplamKazanci / 7;
    }
}//Class sonu












