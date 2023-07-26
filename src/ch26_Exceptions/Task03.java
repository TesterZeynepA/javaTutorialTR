package ch26_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {

        //'ortalama' isminde bir method create ediniz ve int v  - int f  isminde 2 adet parametresi olsun.
        //int v = vize
        //int f = final

        //Eğer  vize 100 den büyük, veya final 100'den büyük, veya vize 0'dan küçük, veya final 0'dan küçük ise,
        //Sistem ArithmeticException hatası versin ve "Notlar 0-100 arasında olmalı" mesajını döndürsün.

        //Diğer durumlarda ise,
        //vizenin yüzde 40 ını, finalin yüzde 60 ını alsın ve toplasın.(ortalama =)

        //Programın çalışmasını sağlayın. (handle edin)


        Scanner input = new Scanner(System.in);
        int vizeNot = 0;
        int finalNot = 0;

        /*Tabii, hasNextInt() metodu Scanner sınıfının bir metodu olup, bu metot,
        Scanner nesnesinin girdi akışında bir tamsayı olup olmadığını kontrol eder.
        Eğer girdi akışında bir tamsayı varsa true, yoksa false değeri döndürür.

Bu metot, genellikle kullanıcıdan girdi alırken kullanılan önemli bir kontrol mekanizmasıdır.
 Çünkü kullanıcı bazen beklenmeyen tipte veri girebilir ve bu durumda programın hata vermeden
 çökmesini engellemek için girişin geçerli olup olmadığını kontrol etmek önemlidir.

hasNextInt() metodu, kullanıcı tarafından girilen değerin tamsayı olup olmadığını kontrol
 eder ve eğer tamsayı ise, nextInt() metodu ile bu değeri almak güvenli olur. Eğer hasNextInt() true döndürürse,
  nextInt() metodu ile tamsayı değeri alabiliriz. Eğer hasNextInt() false döndürürse, nextInt() metodu yerine next() metodu
   kullanılabilir ve geçersiz giriş değeri tüketilebilir ya da kullanıcıya hatalı giriş yapıldığı bildirilebilir.

Bu şekilde, hasNextInt() ve nextInt() yöntemlerini birlikte kullanarak kullanıcı girişlerini kontrol etmek
ve hatasız bir şekilde programın çalışmasını sağlamak mümkündür. */

        while (true) {
            try {
                System.out.println("vize gir");
                if (input.hasNextInt()) {
                    vizeNot = input.nextInt();

                    if (vizeNot < 0 || vizeNot > 100) {
                        throw new ArithmeticException();
                    } else break;
                } else {
                    input.next();
                    throw new InputMismatchException();
                }

            } catch (ArithmeticException e) {
                System.out.println(" not 0 ile 100 arasinda olmali");
            } catch (InputMismatchException e) {
                System.out.println("hatali giris yaptin");
            }
        }
        while (true) {
            try {
                System.out.println("final gir");
                if (input.hasNextInt()) {
                    finalNot = input.nextInt();
                    if (finalNot < 0 || finalNot > 100) {
                        throw new ArithmeticException();
                    } else break;
                }
                else {
                    input.next();
                    throw new InputMismatchException();
                }
            } catch (ArithmeticException e) {
                System.out.println(" not 0 ile 100 arasinda olmali");
            } catch (InputMismatchException e) {
                System.out.println("hatali giris yaptin");
            }

        }

        ortalama(vizeNot, finalNot);
    }//main sonu

    private static void ortalama(int v, int f) {
        double ortalama = (v * 0.4 + f * 0.6);
        System.out.println("ortalama = " + ortalama);

        if (ortalama >= 65) System.out.println("basarilisin");
        else System.out.println("kaldin");
    }
}