package Tasks08_forLoop;

public class Odev04 {

    public static void main(String[] args) {


//        1
//        2 6
//        3 7 10
//        4 8 11 13
//        5 9 12 14 15


        int kenar =5;
        int sayi =1;
        for (int i = 1; i <= kenar; i++) {
        sayi = i;
            for (int j = 1; j <= i; j++) {

                System.out.print(sayi+ " ");
                sayi += (kenar -j);

            }
            System.out.println();


        }








    }
    }