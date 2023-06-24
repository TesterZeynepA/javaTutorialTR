package tasks12;

import java.util.Arrays;

public class _16_Advance_Array_get_sum {

    public static void main(String[] args) {

        /*
        Bu şekilde bir String oluşturunuz.  "$12 $23 $10 $2 $5 $2"
        $ işaretlerini kaldırın ve sayıları toplayın.
        Sayıların toplamını yazdırın.
         */

        //Kodu aşağıya yazınız.


        String str = "$12, $23, $10, $2, $5, $2";

        String[] arr = new String[]{str.replace('$', ' ')};

        int toplam = 0;

        for (int i = 0; i < arr.length; i++){


            toplam += Integer.parseInt(arr[i].replaceAll("$", ""));


        }


        System.out.println("toplam = " + toplam);

    }





    }
