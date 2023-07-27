package InterviewQuestions;

public class Q59_ArrayPair {
	
	
	 /* Task->
	   from a given array find all pairs whose sum is a  given number
	   Bir dizide istenen toplama eişt olan sayı ciftlerini print eden method create ediniz.
	   {4,6,5,-10,8,5,20}===>10
	    */
	
	public static void main(String[] args) {

		//findArrayPair(new int [] {4,6,5,-10,8,5,20},10);
		findArrayPair(new int [] {4,6,5,-10,8,5,12,7,20},12);

	}//main sonu

	private static void findArrayPair(int[] arr, int toplam) {

		for (int i = 0; i < arr.length; i++) {

			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]+arr[j] == toplam) {
					System.out.println(arr[i]+" + " + arr[j]+ " == " + toplam);


				}

			}

		}

	}


}
