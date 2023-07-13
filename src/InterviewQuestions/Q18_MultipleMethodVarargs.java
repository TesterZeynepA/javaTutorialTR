package InterviewQuestions;

public class Q18_MultipleMethodVarargs {
    /* Task->
	farklı 4 öğrencinin sırasıyla 6,4,3 ve 5 yazılı notlarının ortalamasını
	print eden  parametreli method create ediniz.
 */
    public static void main(String[] args) {

        int not1= 6;
        int not2=4;
        int not3=3;
        int not4=5;

       double ortalama = ortalamaHesabı(6,4,3,5);

        System.out.println("ortalama = " + ortalama);

        //2. yol
            notHesapla("zeynep hanım", 78, 81, 90, 66, 83);
            notHesapla("sefil haluk", 45, 53, 61);
            notHesapla("aytekin bey", 79, 85, 91, 71);
            notHesapla("Meryem hanım", 75, 84, 92, 69, 78, 99);

        }//main sonu

        public static void notHesapla(String name, double... notes) {
            double toplam = 0;
            for (double w : notes) {
                toplam += w;
            }
            System.out.println(name + " not ortalaması : " + Math.round(toplam / notes.length));
        }

    private static double ortalamaHesabı(int ... notlar) {

        int toplam =0;

        for (int not : notlar) {

            toplam+=not;
        }
        double ortalama = (double) toplam/notlar.length;
        return ortalama;
    }
}
