package ch02_DataTypes_WrapperClass;

public class C03_Concatination {
    public static void main(String[] args) {

   /*
        Not: char variable'lari matematiksel islemlerde kullanirsaniz, Java onlarin ASCII degerlerini kullanir.
             Ornegin; System.out.println('A' + 'C'); ekrana AC yerine 132 yazdirir
        Note: Java'da "+" sembolunun iki anlami vardir.
        i) Toplama islemi
        ii) Birlestirme Islemi(Concatenation)
              Java "+" sembolu gorunce once toplama yapmaya calisir, yapamazsa birlestirme islemi yapmaya
              calisir, o da olmazsa hata verir.
     */
char ch = 'A';
char ch2 = 'C';

        System.out.println(ch + ch2); //132
        System.out.println('A' + 'C'); //132
        System.out.println("A" +"C"); // AC  cift tirnak String olduğu icin java bu iki ifadeyi concat eder birlestirir.

        String name = "Zeynep hanim";
        String lastName = "Fitnat";
                int a = 7;
                        int b = 11;
        System.out.println(name + lastName + a + b); // ZeynephanimFitnat711
        //stringden sonra sını tam sayi olsa bile concat eder.

        System.out.println(a + name+ lastName);// 7Zeynep hanimFitnat11

        System.out.println(a+b + name+ lastName);// 18Zeynep hanimFitnat
        // başlangic int değerler olduğu için java bunlari önce toplama işlemine alır. string gördükten sonrakileri concat eder

//birden cok data tipinde variable + ile isleme alindiginda islem önceliğine göre sonucu alırız.
        //bastakinin data tipine göre ilk islem yapılır
        //bastaki string ise sonrkiler int dahi olsa concat işlemi yapılır matematiksel toplama islemi yapılmaz

        System.out.println(name + lastName + (a+b)); //Zeynep hanimFitnat18

        //TRİCK: aritmetik islemlerde string kullanılırsa aritmetik islem önceliğine göre java bunu derler
        //ona göre islem yapar cikti string variable gibi olur concatination yapar

        System.out.println(name+ (a-b) + (a-b)); //Zeynephanim -4-4
        System.out.println(name+ ((a-b)+ (a-b))); //Zeynep hanim -8

            char num = '1';
            System.out.println(name+num);//Zeynep hanim1
            System.out.println(  a + num  + name);// 56Zeynep hanim
            //'1' in ascii degeri 49 dur. yukarida 7 + 49 = 56 islem sonucu alindi
            //int + char olursa sonuc toplama islemine gore deger alinir
            System.out.println(name  + (num + b));//Zeynep hanim60
            System.out.println(a+ name+ num);//7Zeynep hanim1
/*
   String name = "Zeynep hanim";
        String lastName = "Fitnat";
        int a = 7 ;
        int b = 11 ;
 */



    }
}
