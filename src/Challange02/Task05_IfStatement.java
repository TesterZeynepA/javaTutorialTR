package Challange02;

import java.util.Locale;
import java.util.Scanner;

public class Task05_IfStatement {
    public static void main(String[] args) {
/* Task->
        Girilen jobTitle data için : Eger jobTitle
        qa ise print "is unvaniniz Quality Analyst."
        dev ise print "is unvaniniz Developer."
        ba ise print "is unvaniniz Business Analyst."
        pm ise print "is unvaniniz Project Manager."
        code create ediniz...
       */

        Scanner input = new Scanner(System.in);
        System.out.println("bir jobTitle giriniz");
        String jobTitle = input.next();

        if (jobTitle.equalsIgnoreCase("qa")) {

            System.out.println("Is unvaniniz Quality Analyst");

        } else if (jobTitle.equalsIgnoreCase("dev")) {

            System.out.println("Is unvaniniz Developer");

        }else if (jobTitle.equalsIgnoreCase("ba")) {

            System.out.println("Is unvaniniz Business Analyst");
        } else if (jobTitle.equalsIgnoreCase("pm")) {

            System.out.println("Is unvaniniz Project Manager");

        }else System.out.println("yanlış giriş yaptınız");


    }
}
