package tasks07;

public class task14 {
    public static void main(String[] args) {
        /* Harflerden oluşan bir Stringin içindeki tüm 'a' ları 'e' ve tüm 'e' leri 'a' yapınız



         */
     String str = "elalem".toLowerCase();

    str = str.replace("a", "*");
    str = str.replace("e", "a");
    str = str.replace("*", "e");
        System.out.println("str = " + str);


    }
}
