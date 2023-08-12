package Lambda_StreamApi.LambdaTutorial;

import java.util.*;
import java.util.stream.Collectors;

public class C10_LambdaObject {
         /*
      TASK :
      fields --> Universite (String)
                 bolum (String)
                 ogrcSayisi (int)
                 notOrt (int)
                 olan POJO clas craete edip main method içinde 5 farklı obj'den List create ediniz.
       */
        public static void main(String[] args) {
            C10_University u01 = new C10_University("Bogazici", "Matematik", 571, 73);
            C10_University u02 = new C10_University("Istanbul", "Matematik", 622, 77);
            C10_University u03 = new C10_University("Marmara", "Hukuk", 1453, 52);
            C10_University u04 = new C10_University("Itu", "uçak muh.", 333, 63);
            C10_University u05 = new C10_University("Yıldız Teknik", "Gemi ", 216, 55);

            List<C10_University> unv = new ArrayList<>(Arrays.asList(u01, u02, u03, u04, u05));

            System.out.println("   Task01  ");

            System.out.println(kontrolnotOrt74Byk(unv));//unv not ortalama 74 ten büyük değil

            System.out.println("   task02  ");
            System.out.println(kontrolOgrncSayi110Byk(unv));//unv ögrenci sayisi 110 dan buyuk

            System.out.println("   task03  ");
            System.out.println(kontrolMatBolum(unv));//unv en az bir matematik bolum var

            System.out.println("   task04  ");
            System.out.println(printOgranciSayiTersSira(unv));
            //[university='Marmara', bolum='Hukuk', ogrncSayisi=1453, notOrt=52,
            // university='Istanbul', bolum='Matematik', ogrncSayisi=622, notOrt=77,
            // university='Bogazici', bolum='Matematik', ogrncSayisi=571, notOrt=73,
            // university='Itu', bolum='uçak muh.', ogrncSayisi=333, notOrt=63,
            // university='Yıldız Teknik', bolum='Gemi ', ogrncSayisi=216, notOrt=55]

            System.out.println("   task05  ");

            System.out.println(printNotOrtalamaTersSiraIlk3(unv));
            //[university='Istanbul', bolum='Matematik', ogrncSayisi=622, notOrt=77,
            // university='Bogazici', bolum='Matematik', ogrncSayisi=571, notOrt=73,
            // university='Itu', bolum='uçak muh.', ogrncSayisi=333, notOrt=63]

            System.out.println("   task06  ");

            System.out.println(printOgrncSayiMin2(unv));

            System.out.println("   task07  ");
            System.out.println(printNotOrt63BykUnvOgrnciSayiToplam(unv));//1193

            System.out.println("   task08  ");
            System.out.println(printOgrncSayi333BykNotOrtOrtalama(unv));//OptionalDouble[67.33333333333333]

            System.out.println("   task09  ");
            System.out.println(printMatBolumSayi(unv));//2

            System.out.println("   task10  ");
            System.out.println(printOgrncByk571UnvMaxNotOrt(unv));//OptionalInt[77]

            System.out.println("   task11  ");
            System.out.println(printOgrncKck1071UnvMinNotOrt(unv));//OptionalInt[55]

        }//main sonu

        // Task01-> notOrt'larının 74'den buyuk oldg control eden code create ediniz...

    public static String kontrolnotOrt74Byk(List<C10_University> unv){

         return unv.stream().allMatch(t->t.getNotOrt()>74)? "unv  not ortalama 74 ten büyük"
                 : "unv not ortalama 74 ten büyük değil";
    }

        //task02->ogrc sayilarinin   110 den az olmadigini  kontrol eden code create ediniz.

    public static String kontrolOgrncSayi110Byk(List<C10_University> unv){

          return unv.stream().allMatch(t->t.getOgrncSayisi()>=110)? "unv ögrenci sayisi 110 dan buyuk"
                  : "unv ögrenci sayisi 110 dan az";
    }

        //task03->universite'lerde herhangi birinde "matematik" olup olmadigini  kontrol eden code create ediniz.
        public static String kontrolMatBolum(List<C10_University> unv){

            return unv.stream().anyMatch(t->t.getBolum().contains("Mat"))? "unv en az bir matematik bolum var"
                    : "unv en az bir matematik bolum yok";
        }

        //task04->universite'leri ogr sayilarina gore b->k siralayiniz.
        public static List<C10_University> printOgranciSayiTersSira(List<C10_University> unv){

           return unv.stream().sorted(Comparator.comparing(C10_University::getOgrncSayisi).reversed()).collect(Collectors.toList());
        }

        //task05-> universite'leri notOrt gore  b->k siralayip ilk 3 'unu print eden code create ediniz...

        public static List<C10_University> printNotOrtalamaTersSiraIlk3(List<C10_University> unv){

            return unv.stream().sorted(Comparator.comparing(C10_University::getNotOrt).reversed()).limit(3).collect(Collectors.toList());
        }
        //task06-> ogrc sayisi en az olan 2. universite'yi  print eden code create ediniz...

    public static List<C10_University> printOgrncSayiMin2(List<C10_University> unv){

        return unv.stream().sorted(Comparator.comparing(C10_University::getOgrncSayisi)).limit(2).skip(1).collect(Collectors.toList());
    }
        //task07-> notOrt 63 'den buyuk olan universite'lerin ogrc sayilarini toplamini print eden code create ediniz...
    public static int printNotOrt63BykUnvOgrnciSayiToplam(List<C10_University> unv){

         return unv.stream().filter(t->t.getNotOrt()>63).mapToInt(t->t.getOgrncSayisi()).//unv obje akışını parametre girilen unv
        // obj ögrenci sayisi olarak update edip akışa alır.
        sum();//akış elemanları toplandı.
        }
        //task08-> Ogrenci sayisi 333'dan buyuk olan universite'lerin notOrt'larinin ortalamasini print eden code create ediniz...
    public static OptionalDouble printOgrncSayi333BykNotOrtOrtalama(List<C10_University> unv){

            return unv.stream().filter(t->t.getOgrncSayisi()>333).mapToDouble(C10_University::getNotOrt).average();//akış elemanların ortalaması alındı
    }
        //task09-> "matematik" bolumlerinin sayisini  print eden code create ediniz...

    public static long printMatBolumSayi(List<C10_University> unv) {

        return unv.stream().filter(t->t.getBolum().contains("Mat")).count();
    }
        //task10-> Ogrenci sayilari 571'dan fazla olan universite'lerin en buyuk notOrt'unu print eden code create ediniz...

    public static OptionalInt printOgrncByk571UnvMaxNotOrt(List<C10_University> unv) {

       return unv.stream().filter(t->t.getOgrncSayisi()>571).mapToInt(t->t.getNotOrt()).max();
    }
        //task11-> Ogrenci sayilari 1071'dan az olan universite'lerin en kucuk notOrt'unu print eden code create ediniz...
        public static OptionalInt printOgrncKck1071UnvMinNotOrt(List<C10_University> unv) {

            return unv.stream().filter(t->t.getOgrncSayisi()<1071).mapToInt(t->t.getNotOrt()).min();
        }

    }