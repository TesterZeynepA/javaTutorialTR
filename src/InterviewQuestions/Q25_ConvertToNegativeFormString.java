package InterviewQuestions;

import java.util.Arrays;

public class Q25_ConvertToNegativeFormString {
    /*  Task->
      Convert the given Array to negative form sentence into a String.

      Input:
      String[] arr={"J","a","v","a","I","s","D","i","f","f","i","c","u","l","t"};

      Output:
      String output ="JavaIsNOTDifficult";
       */

    public static void main(String[] args) {
        String[] arr = {"J", "a", "v", "a", "I", "s", "D", "i", "f", "f", "i", "c", "u", "l", "t"};

        String str = "";

        System.out.println("**** for i ile *****");

        for (int i = 0; i < arr.length; i++) {

            str += arr[i];

        }

        System.out.println("str = " + str);//str = JavaIsDifficult

        System.out.println("str.replace(\"Is\", \"IsNOT\") = " + str.replace("Is", "IsNOT"));
        //str.replace("Is", "IsNOT") = JavaIsNOTDifficult

        System.out.println("*** for each ile *****");

        for (String w: arr) {

            str+= w;

        }

        System.out.println("str.replace(\"Is\", \"IsNOT\") = " + str.replace("Is", "IsNOT"));

    }

}
