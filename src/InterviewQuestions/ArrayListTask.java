package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListTask {


		public static void main(String[] args) {
			/* Task->
			create an array list of cars and retrieve all the value using 3 different ways
			3 elemanlı bir araba listi tanımlayıp 3 farklı yontem ile elemanları print eden code create ediniz.
			 */
			

				/*
				 * Create an arrayList of drinks. 
				 * If any drink has letter 'a' or 'e' replace it with water.
				 */

			List<String> arabaList = new ArrayList<>(Arrays.asList("Volvo", "Audi", "Mercedes"));

			System.out.println("arabaList = " + arabaList);
			// Yöntem 1: For döngüsü ile elemanları yazdırma
			System.out.println("Yöntem 1 - For döngüsü ile elemanları yazdırma:");
			for (int i = 0; i < arabaList.size(); i++) {
				System.out.println(arabaList.get(i));
			}
			System.out.println();

			// Yöntem 2: For-each döngüsü ile elemanları yazdırma
			System.out.println("Yöntem 2 - For-each döngüsü ile elemanları yazdırma:");
			for (String car : arabaList) {
				System.out.println(car);
			}
			System.out.println();

			// Yöntem 3: forEach metodu ile elemanları yazdırma (Java 8 ve sonrası)
			System.out.println("Yöntem 3 - forEach metodu ile elemanları yazdırma:");
			arabaList.forEach(System.out::println);
		}
}
