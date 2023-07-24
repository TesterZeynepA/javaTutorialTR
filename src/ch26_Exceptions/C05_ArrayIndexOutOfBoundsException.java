package ch26_Exceptions;

public class C05_ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {

        //ArrayIndexOutOfBoundsException -> arraylerde olmayan bir index elemanı ile işlem yapıldığında oluşan RTE exception

        int [] arr = {22,55,35,34,33,63,21,72};
       //RTE System.out.println("arr[0] = " + arr[8]);
       // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException

        try {
            System.out.println("arr[0] = " + arr[8]);
            System.out.println("bu kodu okuduysan hata oluşmamıştır");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException hatası aldın");
        }

        System.out.println("hata handle edildi app uygun çalışmakta");


    }
}
