package InterviewQuestions;

import java.util.Scanner;

public class Q28_OddIndexNumber {
    // Task-> girilen str'deki indexi tek olan karakterleri pr,nt eden code create ediniz.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Stirng bir ifade giriniz");
        String str = input.next();

        for (int i = 0; i < str.length(); i++) {

            if(i%2==1){

                System.out.println("str.charAt(i) = " + str.charAt(i));
            }
        }
    }
}