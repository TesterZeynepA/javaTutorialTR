package tasks12;

public class _17_2d_Array {

    public static void main(String[] args) {

        /*
        Şu şekilde olan bir 2D int Array'î oluşturunuz.  [{2,3,2} , {4,1,5} , {7,2,5}]
        Bütün 2'leri 6'yla değiştirin.
        Array'i yazdırınız.
         */

        //Kodu aşağıya yazınız.


        int[][] multiArr = {{5, 2, 1}, {10, 2, 3, 6}, {1, 2}};//  3*4

        int toplam = 0;

        for (int i = 0; i < multiArr.length; i++) {

            for (int j = 0; j < multiArr[i].length; j++) {

                toplam+=multiArr[i][j];
            }
        }
        System.out.println("toplam = " + toplam);




    }
}