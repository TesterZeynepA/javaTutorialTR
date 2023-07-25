package task24.task02;

import javax.naming.InvalidNameException;
import java.util.Scanner;

public class Main {

/* TODO
    Burada iki adet class vardır. Biri Main diğeri ise rentApartments
    rentApartments'ın içinde;
    Bu variable'ları private olarak oluşturun;
    String name
    int roomCount
    boolean balconyOrNo

   Bütün variable'lar için getter ve setter oluşturunuz.

    4 farklı Apartment(apartman dairesi) vardır. 0, 1, 2, 3 rooms(odalı)
    -----------------------------------------------------------------
    Bir method oluşturun;
    Eğer room sayısı 0 ise,
    rent(kira) 1400
    Eğer oda sayısı 1 ise,
    rent  1700
    Eğer oda sayısı 2 ise,
    rent 2200
    Eğer oda sayısı 3 ise,
    rent 2700
    rent'i return'leyin.
    ----------------------------------------------------------------
    Bir method oluşturun.
    Eğer balconyOrNo  true ise,
    rent'e 200 dollar ekleyin.

    Main class'ın içinde;
    userName rent is amountOfRent
     */

    public static void main(String[] args) {
       Scanner input =new Scanner(System.in);

        String userName= null;

        while (true) {
            try {
                System.out.print("Enter your name: ");
                userName = input.nextLine();
                if (!userName.matches("[A-Za-z\\s]+")) throw new InvalidNameException();
                else break;
            } catch (InvalidNameException e) {
                System.out.println("İsim sadece harflerden oluşur.");
            }
        }

        System.out.println("Which apartment do you want (0 room,1 room,2 rooms,3 rooms): ");
        int room= input.nextInt();
        System.out.println("Would you like to have a balcony in your apartment?\nYes-->(Y)\t****No-->(N)");
        boolean balconyOrNo= input.next().toUpperCase().charAt(0) == 'Y';

        rentApartments rentApartments=new rentApartments(userName, room,balconyOrNo);
        System.out.println(rentApartments);

    }
}