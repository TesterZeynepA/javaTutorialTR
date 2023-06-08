package tasks05;

public class _17_if_else_if_statement_find_max {

    public static void main(String[] args) {

      /* Oluşturulan bu 3 int içinde en yüksek değerli olanı bulun.
         Bu en yüksek numarayı yazdırın.

         Not: Num1 = 18 veya Num2 = 25 değerini değiştirdiğinizde kodunuz maksimum değeri yazmalıdır.
         Tüm farklı senaryolarda maksimum sayıyı yazdırmalıdır  */

    int num = 35;
    int num2 = 27;
    int num3 = 25;

    if (num > num2 && num >num3) {
        System.out.println(num);

    } else if (num2 >num && num2 >num3) {

        System.out.println(num2);

    } else if (num3 >num && num3 >num2){

        System.out.println("num3 = " + num3);
    }



    }
}
