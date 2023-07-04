package ch14_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task02 {
    public static void main(String[] args) {
         /* TASK :
bir int Array elemanlarinin işaretini(+-)degistiren  bir method create ediniz.
input : 1,2,-3,4,-5,-6
output :-1,-2,3,-4,5,6

 */


        int [] arr= {1,2,-3,4,-5,-6};

        isaretDegisim(arr);

        isaretDegisim2(arr);

        isaretDegisim3(arr);

        System.out.println("Array elemanlarinin işaretlerinin değişmiş hali: " + Arrays.toString(arr));
    }

    // 3. yol
    private static void isaretDegisim3(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int each : arr) {

            each*= -1;
            list.add(each);
        }
        System.out.println("list: " + list);
    }

    //2. yol
    public static void isaretDegisim2(int[] arr) {
        for (int num : arr) {
            num = -num;
        }
    }

// 1. yol

    private static void isaretDegisim(int [] arr) {

        for (int i = 0; i < arr.length; i++) {

            arr[i] = -arr[i];

        }

        System.out.println(Arrays.toString(arr));
    }
}



