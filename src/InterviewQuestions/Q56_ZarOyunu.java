package InterviewQuestions;

public class Q56_ZarOyunu {
    /* Task->
    Iki tane atilan zarin toplamlarinin 9 olmasi durumanda "Kazandiniz" ,
     aksi takdirde "Tekrar deneyiniz" print eden code create ediniz

     */

    public static void main(String[] args) {
        int ilkAtıs = (int) (Math.random() * ((6 - 1) + 1)) + 1;//1-6 arası random int sayı return eder
        int ikinciAtıs = (int) (Math.random() * ((6 - 1) + 1)) + 1;//1-6 arası random int sayı return eder

        System.out.println("ilkAtıs = " + ilkAtıs);
        System.out.println("ikinciAtıs = " + ikinciAtıs);

        System.out.println("ilkAtıs+ikinciAtıs = " + (ilkAtıs + ikinciAtıs));
        System.out.println((ilkAtıs + ikinciAtıs) == 9 ? "Kazandiniz" : "Tekrar deneyiniz");

    }
}
