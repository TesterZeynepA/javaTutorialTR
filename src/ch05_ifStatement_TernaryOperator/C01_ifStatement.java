package ch05_ifStatement_TernaryOperator;

public class C01_ifStatement {
    public static void main(String[] args) {

       int yasMeryem = 35;
       int yasAhmet = 33;

       if(yasMeryem == yasAhmet) { // meryem ve ahmetin yaslari birbirine esit mi? esit ise bu if calisir degilse calismaz

           // condition 'yasMeryem == yasAhmet' is always 'false'

           System.out.println("ayni yastasiniz");

       }
    if (yasMeryem > 40) { // burada meryemin yasi 40 dan büyük mü kontrol edildi.


        System.out.println("yasi 40 dan büyük");

    }

    if (yasMeryem + yasAhmet>50) {

        System.out.println("ikisinin yası 50 den buyuktur");

        // if else bloklarında her zaman süslü pazantezler olmayabilir.{}
        // if in scope u ilk ;  noktali virgüle kadardır.


    }









    }
}
