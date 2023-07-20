package tasks20;


import java.util.Scanner;

public class T03_Runner {
    /*
    Task 03 ->
    T03_Lesson Class :  fields : name, credit (1-10 arasında değer almalı)
    T03_Student Class : fields : name, maxCredit, dersleri(T03_Lesson class obj) saklayacak list
                   derslerin toplam kredi miktarını return eden  toplamKredisi method
    T01_Runner Class :  3 adet  ders ve 1 adet öğrc (maxCredit=10) obj create ederek öğrencinin alabileceği ve
                       alamayacagı dersleri print eden code create ediniz
     */
    public static void main(String[] args) {

        T03_Lesson ders1 = new T03_Lesson("matematik", 4);
        T03_Lesson ders2 = new T03_Lesson("fizik", 6);
        T03_Lesson ders3 = new T03_Lesson("turkce", 8);
        T03_Student ogrenci = new T03_Student("zeynep", 10);
        T03_Lesson.listDersler.add(ders1);
        T03_Lesson.listDersler.add(ders2);
        T03_Lesson.listDersler.add(ders3);
        System.out.println("ogrenci.studentname = " + ogrenci.studentname);
        System.out.println(T03_Lesson.listDersler);
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("ders giriniz:");
            int ders = input.nextInt();
            int toplamKredi = ogrenci.toplamKredi();
            toplamKredi += T03_Lesson.listDersler.get(ders - 1).credit;
            if (toplamKredi <= ogrenci.maxCredit) {
                System.out.println(ogrenci.secilenDersler);

                ogrenci.secilenDersler.add(T03_Lesson.listDersler.get(ders - 1));

                System.out.println("ogrenci.toplamKredi() = " + ogrenci.toplamKredi());

            } else {
                System.out.println("toplam kredi 10 dan fazla olamaz");
                System.out.println(ogrenci.secilenDersler);
                break;
            }

        }
    }
}