package tasks06;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        // Kullanıcının girdiği gün sayısına karşılık gelen gün adını yazınız.
        // 1.gün Pazartesi olsun

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen yaşadığınız güne atanan numarayı giriniz ="+"\n"+"1. Gün Pazartesi\n" +
                "2. Gün Salı\n" +
                "3. Gün Carsamba\n" +
                "4. Gün Persembe\n" +
                "5. Gün Cuma\n" +
                "6. Gün Cumartesi\n" +
                "7. Gün Pazar");
        int gün =input.nextInt();

        switch (gün) {

            case 1:
                System.out.println("Pazartesi günündesiniz");
                break;
            case 2:
                System.out.println("Sali günündesiniz");
                break;
            case 3:
                System.out.println("Carsamba günündesiniz");
                break;
            case 4:
                System.out.println("Persembe günündesiniz");
                break;
            case 5:
                System.out.println("Cuma günündesiniz");
                break;
            case 6:
                System.out.println("Cumartesi günündesiniz");
                break;
            case 7 :
                System.out.println("Pazar günündesiniz");
                break;
            default:
                System.out.println("Geçersiz bir sayi girdiniz");
                break;






    }}}