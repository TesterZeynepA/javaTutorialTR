package tasks05;

import java.util.Scanner;

public class NestedIfSoru01 {

	public static void main(String[] args) {
		/*
		 Kullanıcıdan cinsiyetini girmesini isteyin.
Erkek ise yaşını kontrol edin. Yaşı 18 den küçük ise ekrana “Erkek çocuk” yazdırın.
Yaşı 18 den büyük eşit ise ekrana “Adam” yazdırın.
Kadin ise yasini kontrol edin. Yaşı 18 den küçük ise ekrana “Kız çocuk” yazdırın.
Yaşı 18 den büyük eşit ise ekrana “Kadın” yazdırın.
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("Lütfen cinsiyetinizi Erkek ise 'E', Kadın ise 'K' olarak giriniz");
		String cinsiyet =input.next();
		System.out.println("Lütfen yaşınızı giriniz");
		int yaş = input.nextInt();

		String result = cinsiyet.equals("E") ? (yaş >= 18 ? "Adam" : "Erkek cocuk"):(yaş<18 ? "Kız çocuk" : "Kadın") ;
		System.out.println("result = " + result);


	}
}
