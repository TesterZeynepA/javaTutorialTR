package tasks05;

import java.util.Scanner;

public class _15_if_else_statement_with_logic_operators4 {

    public static void main(String[] args) {

        /*   String number oluşturulmuştur.
             Eğer String € karakterini kapsıyorsa "This is euro" yazdırın.
             Eğer String $ karakterini kapsıyorsa "This is dollar" yazdırın.
             Aksi halde (else) "no money" yazdırın.   */

        Scanner input = new Scanner (System.in);
        System.out.println("Para miktarı giriniz");
        String number = input.nextLine();
    if (number. contains("€")) {
        System.out.println("This is euro");
    }else if (number.contains("$")) {
        System.out.println("This is dollar");
    } else {
        System.out.println("no money");
    }


    }
}
