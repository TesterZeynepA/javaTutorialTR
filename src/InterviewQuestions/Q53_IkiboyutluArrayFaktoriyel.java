package InterviewQuestions;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;


public class Q53_IkiboyutluArrayFaktoriyel {


    public static void main(String[] args) {
        // task-> girilen 3x3 iki boyutlu arrayin elemanlarının faktoriyelini print eden method create ediniz
        Scanner input = new Scanner(System.in);
        int arr[][] = new int[3][3];
        int i = 0, j = 0;

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print("dizinin elemanını giriniz : ");
                arr[i][j] = input.nextInt();
            }
        }

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        faktoriyel(arr);
    }

    private static void faktoriyel(int[][] arr) {
        int f = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                f *= arr[i][j];
            }

        }

        System.out.println(f);


    }
}
