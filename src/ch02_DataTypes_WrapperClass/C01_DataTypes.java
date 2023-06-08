package ch02_DataTypes_WrapperClass;

public class C01_DataTypes {
    public static void main(String[] args) {
/*
         Java'da  2 farkli data type vardir.
         1)Primitive Data Type (8 tane)
           a)boolean: Sadece True veya False değerlerini alabilir. sadece iki farkli deger alabildigi icin
           memory'de
           az(bir bit'lik) alan kaplar
           b)char :Tek character'li (S, ?, 3, * gibi her bir sembol) ifadeler icin char data type'i kullanilir.
                her bir char memory'de 16 bit'lik yer kaplar.char deger mutlaka tek tirnak icine konulmalıdilir.
                char değerler aritmetik islemler için charlarin ASCII ("American Standard Code for Information
                 Interchange") Table'daki degerlerini alır.
           c)byte : -128'den +127 ye kadar tum tam sayi degerlerini alır.
                byte variable -> memory'de 8 bitlik alan kaplar.
           d)short : -32768'den 32767'ye kadar tum tam sayi degerlerini alır.
                short variable -> memory'de 16 bıt alan kaplar.
           e)int : -2,147,483,648'den 2,147,483,647'ye kadar tum tam sayi degerlerini alır.
                int variable -> memory'de 32 bit alan kaplar.
           f)long : -9,223,372,036,854,755,808'den 9,223,372,036,854,755,807'ye kadar tum tam sayi degerlerini
            alır.
                long variable -> memory'de 64 bit alan kaplar.
           g)float : ondalikli sayilar icin kullanilır.
                float variable -> memory'de 32 bit kullanir.
                float variable -> ondalik kisimlarinda en fazla 7 rakam barindirabilir.
                0.1234567
                Bir ondalikli sayinin float oldugunu belirlemek icin en sona(1.23f veya 1.23F) 'f' veya 'F'
                yazılmalıdır aksi halde variable double olarak tanımlanır.
           h)double : ondalikli sayilar icin kullanılır.
                double variable -> memory'de 64 bit kullanir.
                double variable -> ondalik kisimlarinda en fazla 16 rakam barindirabilirler.
                0.1234567890123456
         2)Non-Primitive Data Type
            String: Cift tirnak arasina yazilan sifir veya daha fazla character'lerden olusan variable.
         */
            /*
        1)Java'da iki turlu "memory" var
            i)Stack Memory:
                a)Kucuk memory'dir
                b)Primitve ve Non-Primitive'lerin adreslerini(Reference) icerir
           ii)Heap Memory:
                a)Buyuk Memory'dir
                b)Non-Primitive'leri icerir
        2)Java Heap Memory'ye yerlestirilen her non-primitve data icin bir address(Reference) olusturur ve bu
        adresi(Reference)
         Stack Memory'ye koyar. Herhangi bir sebeple address(Reference) silinirse Java adresi(Reference)
         olmayan Heap deki
         non-primitive data yi otomatik siler.  Memory'nin temizligini saglayan "Garbage Collector" vardir.
     */

        String name = "Zeynep" ;
        String yas = String.valueOf(38);
        int age = 50;
        int yil = 2023;
        boolean emekliMi = false;
        boolean testerMi = true;
        //char ch ='&a'; //char a tek karakter girilir yoksa Too many characters in character literal hatasi alinir
        char ch = '&';
        char harf = 'A';

        //TASK -> 1999 yılında dogan bir kisinin yasını yazdırınız...
        //variable crate ederek hesaplayiniz hepsini atama yapiniz

        int dogumYili =1999, tarih = 2023;
        int yas1= tarih - dogumYili;
        System.out.println("yas1 = " + yas1); //yas1 =24

        float f1 = 12.45f;
        float f2 = 15.45f;
        double d = 25.55;
        System.out.println("f1*f2 = " + f1*f2); //f1*f2 = 192.3525

        //TASK -> iki farklı byte tanımlayıp toplam ve farkını print ediniz
        byte sayi1 = 100;
        byte sayi2 = 29;
        byte toplam = (byte) (sayi1+ sayi2);
        System.out.println("toplam = " + toplam); //toplam = -127

        //byte -128 ile 127 arasinda deger tutar 127'yi astiginda tekrar -128 den devam eder


        byte sayi3 = 100;
        byte sayi4 = 50;
        System.out.println (sayi3 - sayi4); //50

        //Task -> iki farklı tamsayı türünde sayı  tanımlayıp toplamini print ediniz
        int c = 33;
        byte by = 120;
        System.out.println("c + by = " +( c + by));//c + by = 153
        System.out.println("c + by = " + c + by);//c + by = 33120 topmala isleminde dikkat edilmeli cunku toplama isleminin oncesinde
        // String ifadeler varsa sayisa degerler toplanmaz yanyana yazilir

        //TASK-> tamsayi ve ondalıklı sayı tanımlayip toplami print ediniz
        int sayi5 = 10;
        double sayi6 = 10.5;
        System.out.println(sayi5+sayi6); // 20.5

        //TASK -> tamsayı ve char data type iki variable tanımlayip toplam print ediniz
        int sayi7 = 45;
                char para ='$';
System.out.println(sayi7+ para); //81


//TASK -> ad ve soy adınızı ve yasınızı print ediniz.

        String ad = "Zeynep";
        String soyad = "Aytop";
        int yasim = 38;
        char cinsiyet = 'K';
        System.out.println("ad = " + ad);
        System.out.println("soyad = " + soyad);
        System.out.println("yasim = " + yasim);
        System.out.println("cinsiyet = " + cinsiyet);

        //concatination birlestirme
        System.out.println("concatination");
        System.out.println(ad + "\n"+soyad +"\n" +"\t"+ yasim );
        System.out.println( cinsiyet + 0);//ascii egerine gore islem yapar


        System.out.println(     '('    + 1   +   " "  +  1    +  ')'         );//   41 1)


        //string bir deger den oncekiler toplanir sonrakiler concat edilir

        System.out.println(  '(' + 1 + " *** " + 1 +   ')'  );//  41 *** 1)





    }
}
