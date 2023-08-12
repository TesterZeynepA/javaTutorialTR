package Lambda_StreamApi.LambdaTutorial;

    import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

    public class C12_FlatMap {
        public static void main(String[] args) throws IOException {
       /*
   Stream.flatMap, adıyla tahmin edilebileceği gibi, bir map ve flat işleminin birleşimidir. Bu, ilk önce elemanlarınıza bir
   fonksiyon uyguladığınız ve daha sonra düzleştirdiğiniz anlamına gelir.
   Stream.map yalnızca akışı düzleştirmeden bir işlevi uygular.

   Bir akışın düzleştirme'in neyi içerdiğini anlamak için, "iki seviye" olan [ [1,2,3],[4,5,6],[7,8,9] ] gibi bir yapı düşünün.
   Bunun düzleştirilmesi, "bir seviye" yapısında dönüştürülmesi anlamına gelir: [ 1,2,3,4,5,6,7,8,9 ].
   flatMap yöntemi, bir akışın her bir değerini başka bir akışla değiştirmenizi sağlar
   ve ardından oluşturulan tüm akışları tek bir akışa birleştirir.

 */
            Path erisilecekDosya = Path.of("src/Lambda_StreamApi/LambdaTutorial/Text01");//erişilecek dosya yolu tanımlandı.
            Stream<String> dosyaAkisi= Files.lines(erisilecekDosya);//erişilen dosya dataları satır olarak akışa alındı.



            //TASK 05 -> HalUk dosyasindaki farkli kelimeleri  print ediniz..
            System.out.println("\n TASK 05 -> HalUk dosyasindaki farkli kelimeleri print ediniz..");
            Files.lines(erisilecekDosya).
                    map(t->t.split(" ")).//akıştaki satır elemanları " " göre parçalandı.
                    flatMap(Arrays::stream).//" " göre parçalanan elemanlar Array elemanı olarak akışa alındı.
            distinct().//akıştaki kelimeler benzersiz yapıldı.
            forEach(System.out::println);

            //TASK 06 -> HalUk dosyasindaki tum kelimeleri natural order  print ediniz..
            System.out.println("\nTASK 06 -> HalUk dosyasındaki tum kelimeleri natural order print ediniz..");
            Files.lines(erisilecekDosya).map(t-> t.split(" ")).flatMap(Arrays::stream).sorted().forEach(System.out::println);

            //TASK 07 -> HalUk dosyasinda "basari" kelimesinin kac kere gectigini buyuk harf kucuk harf bagımsız print ediniz.
            System.out.println("\nTASK 07 -> HalUk dosyasinda \"basari\" kelimesinin kac kere gectigini buyuk harf kucuk harf bagımsız print ediniz.");
            System.out.println(Files.lines(erisilecekDosya).map(t -> t.toLowerCase().split(" ")).flatMap(Arrays::stream).filter(t -> t.contains("basari")).count());


            //TASK 08 -> HalUk dosyasinda "a" harfi gecen kelimelerin sayisini print eden  programi create ediniz.
            System.out.println("\nTASK 08 -> HalUk dosyasinda \"a\" harfi gecen kelimelerin sayisini print eden  programi create ediniz.");
            System.out.println(Files.lines(erisilecekDosya).map(t -> t.split(" ")).flatMap(Arrays::stream).filter(t->t.contains("a")).count());


            //TASK 09 -> HalUk dosyasinda icinde "a" harfi gecen kelimeleri print ediniz.
            System.out.println("\nTASK 09 ->HalUk dosyasinda icinde \"a\" harfi gecen kelimeleri print ediniz.");
            System.out.println(Files.lines(erisilecekDosya).map(t -> t.split(" ")).flatMap(Arrays::stream).
                    filter(t -> t.contains("a")).collect(Collectors.toList()));


            //TASK 10 -> HalUk dosyasinda kac /farklı harf kullanildigini print ediniz.
            System.out.println("\nTASK 10-> HalUk dosyasinda kac /farklı harf kullanildigini print ediniz");
            System.out.println(Files.lines(erisilecekDosya).map(t -> t.replaceAll("\\W","").split("")).flatMap(Arrays::stream).distinct().count());


            //TASK 11 -> HalUk dosyasinda kac farkli kelime kullanildigini print ediniz.
            System.out.println("\nTASK 11 -> HalUk dosyasinda kac farkli kelime kullanildigini print ediniz.");
            System.out.println(Files.lines(erisilecekDosya).map(t -> t.replaceAll("[.!,:)\\-]", "").split(" ")).flatMap(Arrays::stream).distinct().count());

            //TASK 12 -> HalUk dosyasinda  farkli kelimeleri print ediniz.
            System.out.println("\nTASK 12 -> HalUk dosyasinda farkli kelimeleri print ediniz.");
            System.out.println(Files.lines(erisilecekDosya).map(t -> t.replaceAll("[.!,:)\\-]", "").
                    split(" ")).flatMap(Arrays::stream).distinct().collect(Collectors.toList()));
        }
    }
