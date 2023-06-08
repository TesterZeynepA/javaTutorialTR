package tasks07;

public class Task08 {
    public static void main(String[] args) {
        /*  TASK :
   Asagidaki String degiskenini kullanarak  konsolda isminizi yazdiriniz.
   String  harfDepo = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    */
        String  harfDepo = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        System.out.println(harfDepo.substring(25,26)
                +harfDepo.substring(4,5)
                +harfDepo.substring(24,25)
                +harfDepo.substring(13,14)
                +harfDepo.substring(4,5)
                +harfDepo.substring(15,16));

        System.out.print(harfDepo.charAt(25));
        System.out.print(harfDepo.charAt(4));
        System.out.print(harfDepo.charAt(24));
        System.out.print(harfDepo.charAt(13));
        System.out.print(harfDepo.charAt(4));
        System.out.println(harfDepo.charAt(15));






    }
}
