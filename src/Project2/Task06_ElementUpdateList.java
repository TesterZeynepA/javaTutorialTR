package Project2;

import java.util.Arrays;
import java.util.List;

public class Task06_ElementUpdateList {
/* Task->
     If the list has 12 as element, change all 12s to 21
     Listteki 12 elemanını 21 olarak update eden code create ediniz
     Example: (12, 11, 12, 15, 12, 34, 43) ==> Output is (21, 11, 21, 15, 21, 34, 43)
 */

    public static void main(String[] args) {

    List<Integer> list = Arrays.asList(12, 11, 12, 15, 12, 34, 43);
    System.out.println(list);

        for (int avuc: list) {

            if (avuc == 12){

                list.set(list.indexOf(12),21);
            }

        }
    
    System.out.println(list);
}

}
