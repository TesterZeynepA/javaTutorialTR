package Challange04;

public class Task03 {
    public static void main(String[] args) {
        // Task-> asagidaki fiyatlarin toplamini print eden code create ediniz.
        // String  str 1= "$13.99"
        // String str 2= "$10.55"
        // ipucu: Double parseDouble() methodunu kullanabilirsiniz.

     /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
		 1) \\d    ==> tum rakamlar
		  	 \\D    ==> tum rakam disi character ler
		 2) \\w   ==> A->Z		a->z			0->9    _
		 	 \\W  ==> A->Z		a->z			0->9    _ disindaki hersey
		 3) \\s   ==> space
		 	 \\S   ==> space disindaki hersey  */

        String str1 = "$13.99";
        String str2 = "$10.55";
        String str3 =str1.replaceFirst("\\D", "");
        String str4 = str2.replaceFirst("\\D", "");

        double d1 = Double.parseDouble(str3);
        double d2 = Double.parseDouble(str4);
        double sonuç = d1 +d2;
        System.out.println("sonuç = " + sonuç);


    }
}
