package tasks03;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        /* TASK->
		 Ask user to enter mid-term grade, final grade, and project grade
		 Calculate the general grade (mid-term : 30% , project : 20%, final : 50%)

		  Example:
		      INPUT: mid-term grade=78
		      		 final grade = 66
		      		 project grade = 90
		      OUTPUT: "Your grade is : 81,6"

		 */

        Scanner scan = new Scanner(System.in);

        System.out.print("mid-term grade: "); int midTermGrade = scan.nextInt();
        System.out.print("final grade: "); int finalGrade = scan.nextInt();
        System.out.print("project grade: "); int projectGrade = scan.nextInt();
        double result = midTermGrade*0.3 + finalGrade*0.5 + projectGrade*0.2;
        System.out.println("result = " + result);


    }
}
