package Challange05;

public class Q03_ForLoop {
    public static void main(String[] args) {


	/*	ForLoop
		print even numbers from 100 to 0 but do not use decrement(i--).

		     INPUT      :
		     OUTPUT  : 100 98 96 94 92 ....2 0
      */

        for (int i = 100; i > 0; i-=2) {

            if (i%2 ==0){

                System.out.println(i + " ");
            }

        }





    }


}
