package Challange08;

public class Task08 {
    public static void main(String[] args) {
        /* task->
         *  String 2D array olustur
         *  {{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}}
         *  String de $ varsa 3.2 ile carp
         *  String de € varsa 4.2 ile carp
         *  elemanlarin toplamini double olarak yazdir
         */

        String [][] arr = {{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}};

        double toplam = 0;//paranın toplanacagı boş kutu tanımlandı

        for (int i = 0; i < arr.length; i++) {//kat tekrarı
            for (int j = 0; j < arr[i].length; j++) {//daire tekrarı
                if (arr[i][j].contains("$")) {//döngüdeki  her bir arr elemanını $ bulundurma şartı

                    toplam += Double.parseDouble(arr[i][j].replace("$", "")) * (3.2);
                } else {//döngüdeki  her bir arr elemanını € bulundurma şartı
                    toplam += Double.parseDouble(arr[i][j].replace("€", "")) * (4.2);
                }
            }

        }
        System.out.println("toplam = " + toplam);

    }
}
