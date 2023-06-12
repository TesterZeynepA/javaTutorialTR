package Tasks08_forLoop;

public class Odev01 {

    public static void main(String[] args) {

        //    0 ile 100 arasındaki bütün çift sayıları print eden code create ediniz.
        //Not: 0 ve 100 dahildir.

        //Kodu aşağıya yazınız.

        for (int i = 0; i <= 100; i++) {

            System.out.print((i % 2 == 0 ? i + " " : ""));

        }


    }
}
