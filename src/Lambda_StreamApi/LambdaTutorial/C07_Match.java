package Lambda_StreamApi.LambdaTutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C07_Match {
    public static void main(String[] args) {
        //anyMatch() --> enaz bir eleman sarti saglarsa true aksi durumda false return eder
        //allMatch() --> tum  elemanlar sarti saglarsa true en az bir eleman sarti saglamazsa false return eder.
        //noneMatch()--> hic bir eleman sarti SAGLAMAZSA true en az bir eleman sarti SAGLARSA false return eder.

        List<String> yemahhh = new ArrayList<>(Arrays.asList("küşleme",  "soğanlı", "trileçe", "bicibici",
                "büryan", "Welemen", "cacix", "kokereç", "yağlama", "güveç", "arabAşı", "tantuni"));

        System.out.println("\n   Task01   ");

       kontrolElKarakterSayiYediAz(yemahhh);//en az bir yemahhh 7 karakter barındırır

        System.out.println(kontrolElKarakterSayiYediAzTernary(yemahhh));//en az bir yemahhh 7 karakter barındırır

        System.out.println("\n   task02   ");
        kontrolElemanWbaslamama(yemahhh);//false

        System.out.println("\n   task03   ");
    }//main sonu

// Task01->  List elemanlarinin karakter sayisini 7 ve 7 'den az olma durumunu kontrol eden code create ediniz.

    private static void kontrolElKarakterSayiYediAz(List<String> yemahhh) {

        yemahhh.stream().anyMatch(t-> t.length() <=7);

        if (yemahhh.stream().anyMatch(t-> t.length() <=7)) {

            System.out.println("en az bir yemahhh 7 karakter barındırır");

        }else{
            System.out.println("hiç bir yemahhh 7 karakter barındırmaz");
        }
    }
    private static String kontrolElKarakterSayiYediAzTernary(List<String> yemahhh) {
       return yemahhh.stream().anyMatch(t-> t.length() <=7)? "en az bir yemahhh 7 karakter barındırır":
               "hiç bir yemahhh 7 karakter barındırmaz";
    }
// Task02-> List elemanlarinin "W" ile baslamamasını kontrol eden code create ediniz...->noneMatch

    private static String kontrolElemanWbaslamama(List<String> yemahhh) {

        //return yemahhh.stream().noneMatch(t -> t.startsWith("W")) ?
        return yemahhh.stream().noneMatch(t -> t.toString().substring(0,1).equalsIgnoreCase("W")) ?
                "mönü de w ile başlayan yemahhh yok"
                : "mönüde en az bir yemahhh w ile başlıyor";

    }
    // Task03-> List elemanlarinin "x" ile biten en az bir elemanın varlığını kontrol ediniz eden code create ediniz...->

    private static String kontrolElemanXileBiten(List<String> yemahhh) {

        return yemahhh.stream().anyMatch(t->t.toString().endsWith("x")) ?
                "menüde x ile biten yemahhh var"
                :"menüde x ile biten yemahhh yok";
    }









}
