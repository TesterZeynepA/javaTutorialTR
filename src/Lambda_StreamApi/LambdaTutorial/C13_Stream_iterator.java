package Lambda_StreamApi.LambdaTutorial;


            import java.math.BigInteger;
import java.util.OptionalInt;
import java.util.stream.IntStream;

    public class C13_Stream_iterator {

        public static void main(String[] args) {
            System.out.println("TASK01--> amele topla : "+ sayilarToplamAmele(10));//55
            System.out.println("   ***   ");
            System.out.println("TASK01--> cincix topla : "+ sayilarToplamCincix(10));//55
            System.out.println("   ***   ");

            System.out.println("TASK02--> cincix çift topla : "+ ciftSayilarToplam(10) );//30
            System.out.println("   ***   ");

            System.out.println("TASK03--> cincix ilk 10 çift topla : " + ilkXPozitifCiftTamsayiTopla(10));//110
            System.out.println("   ***   ");

            System.out.println("TASK04--> cincix ilk 10 tek topla : " + ilkXPozitifTekTamsayiTopla(10));//100
            System.out.println("   ***   ");

            System.out.println("TASK05-->");
            ikininİlkXkuvveti(5);//2 4 8 16 32
            System.out.println("   ***   ");

            System.out.println("TASK 06 -->");
            istenenSayininİlkXkuvveti(5,3);//3 9 27 81 243
            System.out.println("   ***   ");

            System.out.println("TASK 07 -->"+ istenenSayininFaktoriyeli(5) );//120

            System.out.println("   ***   ");

            System.out.println("task08 -- > : " );
            System.out.println("   ***   ");
            istenenSayininXKuvveti(5,3);//243
        }//main sonu

        //TASK 01 --> Structured Programming ve Functional Programming ile 1'den x'e kadar tamsayilari toplayan bir code create ediniz.

        //Structured Programming(Amele coding...)
        public static int sayilarToplamAmele(int x){
            int toplam=0;

            for (int i = 1; i <=x ; i++) {
                toplam+=i;
            }
            return toplam;
        }

        //Functional Programming(cincix code...)
        public static int sayilarToplamCincix(int x){
           return  IntStream.//manual int akış tanımlandı.
                    range(1,x+1).//1,2,3,....x tamsayıları akışa aldı.
            sum();//akiştaki sayilar toplandı.
            //range(startInclusive,endExclusive);-> 1'lik artımlı bir adımla
            // startInclusive'den (dahil) endExclusive'e (exclusive) kadar sıralı bir IntStream return eder.
        }

        //TASK 02 --> 1'den x'e kadar cift tamsayilari toplayan bir code create ediniz

        public static int ciftSayilarToplam(int x){
            return IntStream.
                  //  range(1,x+1).
                    rangeClosed(1,x).
                    filter(SeedMethods::ciftMi).sum();
            //rangeClosed(startInclusive,endInclusive);-> 1'lik artımlı bir adımla startInclusive'den (dahil)
            // endInclusive'e (dahil) kadar  sıralı bir IntStream return eder.
        }

        //TASK 03 --> Ilk x pozitif cift tam sayiyi toplayan code  create ediniz.

        public static int ilkXPozitifCiftTamsayiTopla(int x){

           return IntStream.
                    iterate(2,t->t+2).//2 den başlayıp sürekli 2 artıran tekrar tanımlandı.
            limit(x).//akıştaki ilk x eleman alındı.
            sum();
        }

        //TASK 04 --> Ilk X pozitif tek tamsayiyi toplayan programi  create ediniz.
        public static int ilkXPozitifTekTamsayiTopla(int x){

            return IntStream.
                    iterate(1,t->t+2).//2 den başlayıp sürekli 2 artıran tekrar tanımlandı.
                            limit(x).//akıştaki ilk x eleman alındı.
                            sum();
        }

        //TASK 05 --> 2'nin ilk x kuvvetini ekrana yazdiran code  create ediniz.
        public static void ikininİlkXkuvveti(int x){

             IntStream.
                    iterate(2,t->t*2).//2 den başlayıp sürekli 2 artıran tekrar tanımlandı.
                            limit(x).//akıştaki ilk x eleman alındı.
                            forEach(SeedMethods::intYazdir);
        }

        //TASK 06 --> Istenilen bir sayinin ilk x kuvvetini print eden code  create ediniz.
        public static void istenenSayininİlkXkuvveti(int x, int istenenSayi){

            IntStream.
                    iterate(istenenSayi,t->t*istenenSayi).//2 den başlayıp sürekli 2 artıran tekrar tanımlandı.
                    limit(x).//akıştaki ilk x eleman alındı.
                    forEach(SeedMethods::intYazdir);
        }

        //TASK 07 --> Istenilen bir sayinin faktoriyelini hesaplayan code  create ediniz.
        public static int istenenSayininFaktoriyeli(int x){

           return IntStream. rangeClosed(1,x).//1,2,3,....x-> 1.2.3....x
            reduce(1,(a,b)->a*b);
        }

        //TASK 08 --> Istenilen bir sayinin  x. kuvvetini print eden code  create ediniz.

        public static void istenenSayininXKuvveti(int x, int istenenSayi){
            IntStream.
                    iterate(istenenSayi,t->t*istenenSayi).//2 den başlayıp sürekli 2 artıran tekrar tanımlandı.
                    limit(x).//akıştaki ilk x eleman alındı.
                   skip(x-1).//akıştaki x-1 elemanları atlayıp doğrudan x. elemanı alır
                    forEach(SeedMethods::intYazdir);
        }

    }
