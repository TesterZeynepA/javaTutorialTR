package J_Challange01;

import java.util.Scanner;

public class Task07_Converting {
    public static void main(String[] args) {

       /*  task->
    girilen sıcaklık değerini Fahrenhayt'tan Santigrat derecesine çeviren code create ediniz.
    formül
    c = (f-32)*5/9
*/

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sıcaklık değeri giriniz");
        double f = input.nextDouble();
        double c = (f-32)*5/9;
        System.out.println("Sıcaklık = " + c + " derecedir");


    }
}
