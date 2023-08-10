package Lambda_StreamApi.LambdaTutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_LambdaExpression {
 /*
   1) Lambda "Functional Programming"-->mathod(action) kullanan pr dili.
      Lambda --> mathod create  etme değil mevcut method'ları(library)secip kullanmaktır...
      Lambda  kendi başına tanımlanabilen parametre alıp gönderebilen fonksiyonlardır.
      Lambda'lar sayesinde daha az kod ve hızlı geliştirme sağlanabilmektedir.
      Java 8 ile gelen bu özellik, Java 8’in en önemli özelliğidir.

      "Functional Programming" de "Nasil yaparim?" degil "Ne yaparim?" dusunulur.
   2) "Structured Programming" de "Ne yaparim?" dan cok "Nasil Yaparim?" dusunulur
   3) "Functional Programming" hiz, code kisaligi, code okunabilirligi
       ve hatasiz code yazma acilarindan cok avantajlıdır(Çoooğ iyi ...  :) ).
   4) Lambda sadece collections'larda(List, Queue ve Set) ve Array'lerde kullanilabilir ancak map'lerde kullanılmaz.
         Lambda kullanmak hatasız code kullanmaktır.

              "Functional Programming"--> CINCIX Programming
              "Structured Programming"--> AMELE Programming

          Collections Nedir?
          Çoğu yazılım tek tek öğeler yerine öğelerden oluşan toplulukları depolar ve onlar üzerinde işlem
          yapar. Array'ler onlardan birisidir. Java Collections Framework, arraylerle yapılan işleri daha kolay
          yaptığı gibi, daha fazlasını da yapar.
          Java'da bir koleksiyon (collection - bazen container, ambar diye adlandırılır) nesnelerden oluşan bir
          topluluğu bir arada tutan bir yapıdır. 'Collections Framework' ise arayüzler ve onların kurgularından
          (implementations) oluşur.

           API:Uygulama programlama arayüzü
           (İngilizce: Application Programming Interface, kısaca API), bir yazılımın başka bir yazılımda tanımlanmış işlevlerini
           kullanabilmesi için oluşturulmuş bir tanım bütünüdür.
           API, yazılım bileşeniyle olan etkileşimlerin bir özelliğidir.
           Bu da örnek olarak şu anlama gelir. Bir arabanın bir yazılımı olduğunu hayal edin.
           Bu arabanın API'si arabanın neler yapabileceği hakkında bilgi içerir; hızlanma, frenleme, camları açma, vs.
           Ayrıca bunların nasıl yapabileceğine dair bilgiler de içerir.
           Örneğin hızlanmak için ayağınızı gaz pedalına koyup itersiniz.
           API, ayağınızı gaza bastığınızda motorun içinde neler olduğunu açıklamak zorunda değildir.
           Bu nedenle, içten yanmalı motorlu bir araba kullanmayı öğrendiyseniz, tamamen
           yeni bir dizi beceri öğrenmek zorunda kalmadan API sayesinde elektrikli bir arabayı rahatlıkla kullanabilirsiniz.

*/
 public static void main(String[] args) {

     List<Integer> sayiList = new ArrayList<>(Arrays.asList(7,58,17,54,33,3,13,35,65,18,61,46,25,16,6));
     System.out.println("    *** task 01 ***   ");

     printElstructured(sayiList);//7 58 17 54 33 3 13 35 65 18 61 46 25 16 6

     System.out.println("\n   *** task 02 ***   ");

     printElFunctional(sayiList);//7 58 17 54 33 3 13 35 65 18 61 46 25 16 6

     System.out.println("\n   *** task 03 ***   ");

     printElFunctional2(sayiList);//758175433313356518614625166

     System.out.println("\n   *** task 04 ***   ");

     printElFunctional3(sayiList);//7 58 17 54 33 3 13 35 65 18 61 46 25 16 6

//task 01->  "Structured Programming"--> AMELE Programming kullanarak list elemanlarını aynı satırda
// aralarında bosluk olacak şekilde print ediniz.
 }


    private static void printElstructured(List<Integer> sayiList) {

        for (Integer sayi : sayiList) {
            System.out.print(sayi+ " ");
        }
    }
    //task 02->  "Functional Programming"--> CINCIX Programming kullanarak
    // list elemanlarını aynı satırda aralarında bosluk olacak şekilde print ediniz.

    private static void printElFunctional(List<Integer> sayiList) {

     sayiList.//action a girecek akış kaynağı call edildi
             stream().//call edilen collection elemanları akışa alındı
             forEach((t)-> System.out.print(t + " "));// akışdaki collection  her bir elemanı print actionuna alındı.
     /*
    stream() : datalari yukaridan asagiya akis sekline getirir. Stream bir interface olduğundan dolayı doğrudan nesne almaz.
    forEach() :datanin parametresine gore her bir elemanı isler
    t-> : Lambda operatoru
     Lambda Expression-->(parameter list) -> {action body}
         Parameter list: Fonksiyonun parametreleri tanımlanır. Hiç parametre geçirmeden boşta olabilir.
         -> Arrow-token: Argüman listesi(parameter list) ile expression gövdesini(action body) birbirine bağlamak için kullanılır.
         Body: Expressionları ve statementları içerir.

        Bir kod bloğundan oluşan bir body...
        Bu tip lambda body, block body olarak bilinir. Blok gövdesi, lambda gövdesinin birden çok ifade içermesine izin verir.
        Bu ifadeler parantez içine alınır ve parantezlerden sonra noktalı virgül eklemeniz gerekir.

            () -> {
             double pi = 3.1415;
                return pi;
            };
   ahanda trick köşeşinde bugun :   Lambda Expression  yapisi cok tavsiye edilmez daha cok METHOD REFERENCE kullanilir

    */
    }
    private static void printElFunctional2(List<Integer> sayiList) {

        sayiList.//action a girecek akış kaynağı call edildi
                stream().//call edilen collection elemanları akışa alındı
                forEach(System.out::print);// akışdaki collection  her bir elemanı method refere edilerek  print actionuna alındı.

        //method reference -> method kaynağı :: method
    }

    private static void printElFunctional3(List<Integer> sayiList) {

        sayiList.//action a girecek akış kaynağı call edildi
                stream().//call edilen collection elemanları akışa alındı
                forEach(SeedMethods::intYazdir);// akışdaki collection  her bir elemanı method refere edilerek  print actionuna alındı.

        //method reference -> method kaynağı :: method

    }

}
