package ch26_Exceptions;

public class C04_NullPointerException {
    public static void main(String[] args) {

      //NullPointerException -> null ataması yapılan bir Sting de length () method run edildiğinde oluşan RTE exception

      String str ="";
        System.out.println("str.length() = " + str.length());


        String str1 =null;
       //RTE System.out.println("str1.length() = " + str1.length());
        //Exception in thread "main" java.lang.NullPointerException

        try {
            System.out.println("str1.length() = " + str1.length());
            System.out.println("bu mesaji okursan null in length ini aldın demektir");
        } catch (NullPointerException e) {

            System.out.println("null in length i olur mu");
        }


        try {
            System.out.println("str.length() = " + str.length());
            System.out.println("bu mesaji okursan \"\" in length ini aldın demektir");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
