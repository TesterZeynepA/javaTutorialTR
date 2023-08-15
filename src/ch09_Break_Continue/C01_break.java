package ch09_Break_Continue;

import java.util.Scanner;

public class C01_break {
    public static void main(String[] args) {
//break
      /*
break loop'u istenen yerden sonlandırmak için döngüyü kontrol edebiliriz.Bir loop'u, loop'un koşul bölümüne bağlı
kalmaksızın sona erdirmek için break komutu kullanılır. break komutu loop'a bağlı kod bloğunun
 herhangi bir işlem satırında yer alabilir. Program kod bloğunda break komutu'nu görür görmez,
 loop başlangıç koşulu sağlanmış olsa bile, loop'dan çıkar ve loop'dan sonra gelen ilk işlem
 satırından çalışmasına devam eder. İç içe(nested) looplarda break komutu kullanıldığında sadece
  içinde kullanıldığı loop'dan çıkışı sağlar:


 temelde döngüden atlamak için kullanılır, çoğunlukla if-else deyimi ile kullanılır
 */
        //break

        // Task -> girilen bir mail hesabının @ sembolune kadar olan karakterlerini print eden code create ediniz.

        Scanner input = new Scanner(System.in);
        System.out.println("mail hesabınızı giriniz");
        String mail = input.next();

        for (int i = 0; i < mail.length(); i++) {// girilen mail in sonuna kadar git

            if (mail.charAt(i) == '@'){ // herbir karakterin '@' ile eşit olmasına bakar
                break;
            }
            System.out.print(mail.charAt(i));
        }

}}