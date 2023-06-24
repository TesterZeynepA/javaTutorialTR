package Challange08;

public class Task09 {
    public static void main(String[] args) {
        /*
         * Girilen Multidimensional arraydeki cift sayilari toplayan bir method
         * create ediniz.
         * INPUT : {{1,3,6},{2,8},{5,7,9,14}}
         *
         * OUTPUT : Arraydeki cift sayilarin toplami : 30
         */


        int multiArr [][] = {{1,3,6},{2,8},{5,7,9,14}};

        int ciftSayiToplami =ciftSayiToplam(multiArr);

        System.out.println("Array deki çift sayilarin toplami = " + ciftSayiToplami);



    }

    private static int ciftSayiToplam(int [][] arr) {


        int toplam = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j]%2==0){

                    toplam+=arr[i][j];


                }

            }

        }

         return toplam;




    }

}