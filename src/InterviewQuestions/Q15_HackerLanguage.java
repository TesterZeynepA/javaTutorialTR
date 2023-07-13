package InterviewQuestions;

import java.util.Scanner;

public class Q15_HackerLanguage {

// Task->Girilen bir metni, 'hacker'ların konuşma diline çeviren bir method(method ismi hackerDili) create ediniz.
//
//    s -> 5
//    a -> 4
//    e -> 3
//    i -> 1
//    o -> 0
//    Test data
//    hackerDili("java ile hersey guzel")
//    j4v4 1l3 h3r53y guz3l
//    İpucu harfleri değiştirin ve ekrana yazdırın.(Array ve String Manipulation)

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bir string giriniz");
        String str = input.nextLine();
        hackerDili1(str);
        hackerDili1("javaCan javvaNur javaSu javaTar javaNaz javaHan");



    }

    private static void hackerDili1(String str) {
        System.out.println( str.
                replaceAll("s", "5").
                replaceAll("a", "4").
                replaceAll("e", "3").
                replaceAll("i", "1").
                replaceAll("o", "0"));

    }
}