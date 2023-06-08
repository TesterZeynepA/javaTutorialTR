package tasks05;

import java.util.Scanner;

public class IfElseIf04 {

	public static void main(String[] args) {
		/*
		 Kullanıcıdan bir yıl alın eğer yıl 1000’e bulunuyorsa ekrana “Milenyum�? yazdırın.
Eğer yıl 100’e bulunuyorsa ekrana “Yüzyıl�? yazdırın.
Eğer yıl 10’a bulunuyorsa ekrana “Onyıl�? yazdırın
		 */
		Scanner input =new Scanner(System.in);
		System.out.println("Bir yil giriniz");
		int yil=input.nextInt();
		if(yil%1000==0) {
			System.out.println("Milenyum");
		}else if(yil%100==0) {
			System.out.println("Yüzyıl");
		}else if(yil%10==0) {
			System.out.println("Onyıl");
		} else System.out.println("Girdiğiniz yil milenyum, yüzyil ya da onyil değildir");


}
}

	

