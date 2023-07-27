package InterviewQuestions;

import java.util.Scanner;

public class Q62_PrintPrimeNumbers {

	public static void main(String[] args) {
		/* Task->
		 * Print prime numbers which are less than the given number
		 *  Girilen sayıya kadar asal sayıları print eden code create ediniz
		 * input : 10
		 * output : 2 3 5 7
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("bir sayı giriniz");
		int sayi = input.nextInt();

		printPrimeNumber(sayi);
	}

	private static void printPrimeNumber(int sayi) {

		for (int i = 2; i <sayi ; i++) {

			if (isPrime(i)) {

				System.out.println(i+ " ");
			}
		}
	}

	private static boolean isPrime(int a) {

		if(a<=1){
			return false;
		}
		for (int i = 2; i <a ; i++) {

			if (a%i==0) {

				return false;
			}
		}
		return true;
	}

}
