package tasks07;

import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {

		/*  TASK :
				StringMethods:
				girilen  bir strngin ilk yarisini print eden code create ediniz
	    	    ORNEK:
		     	INPUT :istanbul
				OUTPUT :ista
	    */
        Scanner input = new Scanner(System.in);
        System.out.print("Bir String giriniz: ");
        String str = input.nextLine();

        System.out.println(str.substring(0,str.length()/2));




    }
}
