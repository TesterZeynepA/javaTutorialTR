package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q55_ArrayListTask {


		public static void main(String[] args) {
			/* Task->
			create an array list of cars and retrieve all the value using 3 different ways
			3 elemanlı bir araba listi tanımlayıp 3 farklı yontem ile elemanları print eden code create ediniz.
			 */
			

				/*
				 * Create an arrayList of drinks. 
				 * If any drink has letter 'a' or 'e' replace it with water.
				 */

			List<String> araba = new ArrayList<>(Arrays.asList("Volvo", "Ford", "Honda"));

			for (int i = 0; i <araba.size(); i++) {

				System.out.println(araba.get(i) + ", ");

			}

			System.out.println("\n *****");
			for (String a: araba) {
				System.out.println(a+ ", ");

			}
			System.out.println("\n *****");
			int index = 0;

			while (index<araba.size()){

				System.out.println(araba.get(index)+ ", ");
				index++;
			}



			
	}

}
