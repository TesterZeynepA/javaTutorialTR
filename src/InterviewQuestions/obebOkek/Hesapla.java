package InterviewQuestions.obebOkek;

public class Hesapla {

    public static int obeb(ObebOkek eleman){

        int obeb=1;

        int ks =Math.min(eleman.getS1(), eleman.getS2());
        for (int i = ks; i >1 ; i--) {

            if (eleman.getS1()%i==0&& eleman.getS2()%i==0){

               obeb=i;
               break;

            }
        }
          return obeb;

    }

    public static int okek(ObebOkek eleman) {

        int okek = (eleman.getS1() * eleman.getS2()) / obeb(eleman);
        return okek;
    }

    //okek 2. yol

    public static int okekBul(int sayi1, int sayi2) {
        int okek = 1;
        int buyukSayi = Math.max(sayi1, sayi2);
        while (true) {
            if (buyukSayi % sayi1 == 0 && buyukSayi % sayi2 == 0) {
                okek = buyukSayi;
                break;
            }
            buyukSayi++;
        }
        return okek;
    }


    public static int okek2(ObebOkek eleman){//eleman s1=12, s2=18

        int bs = Math.max(eleman.getS1(), eleman.getS2());//18

        int okek= eleman.getS1()* eleman.getS2();

        for (int i = bs; i < eleman.getS1()* eleman.getS2() ; i++) {

            if (eleman.getS1()==0 && eleman.getS2()==0){//tekrardaki her bir eleman s1 ve s2 ye tam bölünme şartı s1 ve s2 nin ortak katı

                okek=i;
                break;
            }
        }

        return okek;
    }
}
