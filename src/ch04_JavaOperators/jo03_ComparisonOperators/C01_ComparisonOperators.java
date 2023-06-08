package ch04_JavaOperators.jo03_ComparisonOperators;

public class C01_ComparisonOperators {
    public static void main(String[] args) {


        /*
    Comparator : Karsilastirma islemleri.
    Java'da iki variable'in degeri karlilastirildiginda Java sonuc olarak boolean(true-false) return eder

    ==	    Esit	            x == y
    !=	    Esit degil	        x != y
    >	    buyuk	            x > y
    <	    kucuk	            x < y
    >=	    buyuk esit        	x >= y
    <=	    kücük esit  	    x <= y
    Unlem isareti (!) olumsuzluk anlaminda kullanilir.
     */


        int yas1 =34;
        int yas2 =55;

        //task yas1 ile yas2 nin esit olup olmadığını kontrol eden code yazınız.

        System.out.println("yas1==yas2=" + (yas1 ==yas2));
    // condition 'yas1 == yas2' is alvays "false" when reached

        //olumsuz kontrol nasıl yapılır
        System.out.println(yas1 != yas2);
        //condition 'yas1 != yas2' is always 'true'







    }
}
