package ch06_SwitchStatement;

import java.util.Scanner;

public class C06_SwitchCase {

    //data base mantigina bankada tutulan sifre create edin
    static String password ="12345"; // kullanicinin bankada kayitli olan sifresi gibi dusunun.

    public static void main(String[] args) {


         /*
Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma ve cekme,
 çıkış işlemlerinin yapıldıgı bir
 ATM app. code create ediniz
 */
        Scanner input = new Scanner (System.in);
        System.out.println("***** Java Bank Atm sine hoşgeldiniz *****");
        System.out.println("sifreni gir");
        String sifre =input.nextLine();
    if (sifre.equals(password)) {
        System.out.println("sifreniz eslesti devam edebilirsiniz");

        System.out.println("bakiye sorgulama icin 1\npara yatirma icin 2\n +" +
                "para cekme icin 3\ncikis icin 4 tuslarina basiniz");

        int secim = input.nextInt();
        //baslangi bakiyesi create edildi
        int bakiye = 1000;
        switch (secim) {

            case 1:
                System.out.println("bakiye = " + bakiye);
                break;

            case 2:
                System.out.println("ne kadar yatirmak istersin");
                int yatirilacakMiktar = input.nextInt();
                bakiye +=yatirilacakMiktar;
                System.out.println("güncel bakiyeniz: " + bakiye);
                break;
                case 3:
                    System.out.println("ne kadar cekmek istersiniz");
                    int cekilecekMiktar = input.nextInt();
                    if(cekilecekMiktar<= bakiye) {//bakiye yeterli olma senaryosu
                        bakiye -= cekilecekMiktar;
                        System.out.println("cekilen miktar = " + cekilecekMiktar);
                        System.out.println("kalan bakiyeniz = " + bakiye);

                    } else System.out.println("bakiyeniz yetersiz oldugu icin cekme isleminiz başarisiz bakiyeniz =" +bakiye);
                    break;
                    case 4:
                        System.out.println("cikis yapiyorsunuz yine bekleriz");
                        break;
                        default:
                            System.out.println("hatali bir secim yaptiniz");
                            break;


        }

    }else
        System.out.println("hatali sifre girdiniz 2 hakkiniz kaldi");



    }
}
