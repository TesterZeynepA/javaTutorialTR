package tasks20;

import java.util.Scanner;

    public class T04_Bisiklet {
        int hiz = 0;
        int vites;

        static Scanner input = new Scanner(System.in);

        void hizDegistir() {
            System.out.print("Yeni hız giriniz: ");
            this.hiz = input.nextInt();
        }
        void vitesArtir() {

            for (int i = 1;i < 6; i++) {
                vites++;
                if (i == 5) {
                    System.out.println("vitesiniz şuan en yüksek konumda. Daha fazla yükseltemezsiniz");
                }
            }
        }
        void vitesAzalt() {

            for (int i = 5; i >0 ; i--) {
                vites--;
                if (i == 1) {
                    System.out.println("vites şuan en düşük konumda. Daha fazla düşüremezsiniz");
                }
            }
        }
        void durumGöster() {
            System.out.println("hiz = " + hiz);
            System.out.println("vites = " + vites);
        }
        void dur() {
            System.out.println("Bisiklet durdu.");
        }
        void islemYap() {

            System.out.println("***** Hoşgeldiniz *****\nvites artırmak için 1\nvites azaltmak için 2\no andaki durumu görmek için 3\n" +
                    "hız değiştirmek için 4\ndurmak için 0 giriniz");
            int secim = input.nextInt();

            switch (secim) {

                case 1:
                    vitesArtir();
                    islemYap();
                    break;
                case 2:
                    vitesAzalt();
                    islemYap();
                    break;
                case 3:
                    durumGöster();
                    islemYap();
                    break;
                case 4:
                    hizDegistir();
                    islemYap();
                    break;
                case 0:
                    dur();
                    islemYap();
                    break;
                default:
                    System.out.println("yanlış giriş yaptınız lütfen tekrar deneyiniz");
                    break;
            }

        }

    }