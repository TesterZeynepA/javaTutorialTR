package InterviewQuestions;

import java.util.Scanner;

public class Q54_AlphabetCheck {

    public static void main(String[] args) {
        // Task->
        // Check if the character is among a-z or A-Z
        // girilen karakterin a-z or A-Z arasında olmasını kontrol eden code create ediniz

        Scanner input = new Scanner(System.in);
        System.out.println("agam bi karakter giresen : ");
        char ch = input.next().charAt(0);
        System.out.println((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') ?
                "girilen karakter ALPHABET :) " :
                "girilen karakter ALPHABET değil :( ");

    }

}
