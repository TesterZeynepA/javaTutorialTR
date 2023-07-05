package ch15_Varargs;

public class C02_Varargs {
    public static void main(String[] args) {

        /*
array ve varargs method:
 */
//task1 verilen bir array deki elemanlari toplayan method create ediniz

        int [] arr ={ 1,2,-3,4,-5,-6 } ;

        arrTopla(arr);

        varargstopla(arr);

    }

    private static int varargstopla(int... var) {

        int toplam=0;
        for (int w : var ) {

            toplam+= w;

        }
        System.out.println(" sayilarin toplami varargs ile = " + toplam);
        return toplam;


    }

    private static void arrTopla(int[] arr) {

       int toplam =0;

        for (int w : arr) {

            toplam += w;
        }

        System.out.println("toplam = " + toplam);

    }
}
