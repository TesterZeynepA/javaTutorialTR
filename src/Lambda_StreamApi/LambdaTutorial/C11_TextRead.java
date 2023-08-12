package Lambda_StreamApi.LambdaTutorial;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

    public class C11_TextRead {
        public static void main(String[] args) throws IOException {
            //TASK 01 --> Text01 dosyasini okuyunuz.(Console'a print eden code create ediniz.)

            System.out.println("\n task 01 --> Text01 dosyasini okuyunuz");
            Path erisilecekDosya = Path.of("src/Lambda_StreamApi/LambdaTutorial/Text01");//erişilecek dosya yolu tanımlandı.
            Stream<String> dosyaAkisi= Files.lines(erisilecekDosya);//erişilen dosya dataları satır olarak akışa alındı.
            dosyaAkisi.forEach(SeedMethods::strYazdir);


            //TASK 02 --> Text01.txt dosyasini map okuyunuz.(Console'a buyuk harflerle print eden code create ediniz.)
            System.out.println("\n task 02 --> Console'a buyuk harflerle print eden code create ediniz.");

            Files.lines(erisilecekDosya).map(String::toUpperCase).forEach(System.out::println);

            //TASK 03 --> Text01 dosyasindaki ilk satiri kucuk harflerle print eden code create ediniz.
            System.out.println("\n task 03 --> Text01 dosyasindaki ilk satiri kucuk harflerle print eden code create ediniz.");
            Files.lines(erisilecekDosya).map(String::toLowerCase).limit(1).forEach(System.out::println);


            //TASK 04 --> Text01 dosyasinda "basari" kelimesinin kac satirda gectiginiz print eden code create ediniz.
            System.out.println("\n task 04 --> Text01 dosyasinda \"basari\" kelimesinin kac satirda gectiginiz print eden code create ediniz.");
            System.out.println(Files.lines(erisilecekDosya).filter(t -> t.contains("basari")).count());


        }
    }

