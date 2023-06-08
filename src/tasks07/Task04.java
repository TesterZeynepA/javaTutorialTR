package tasks07;

public class Task04 {
    public static void main(String[] args) {

        /*
         Task->
         Girilen iki kelimeden ilki çift sayıda kaqrakter içeriyorsa 2. kelimeyi 1. kelimenin ortasına print eden
         ilk kelime tek sayıda karakter içeriyorsa "kelime2 kelime1 eklenemez" print eden code create ediniz
         name1= mehmet
         name2= ahmet
         Print ==> mehahmetmet
         */

        String name1 ="mehmet";
        String name2 ="ahmet";

        if ((name1.length())%2==0) {

            String sonİsim = name1.replace("h", "hahmet");
            System.out.println("sonİsim = " + sonİsim);
        } else if ((name1.length())%2!=0) {
            System.out.println("name2 name1'e eklenemez");
        }

        //hocanın çözümü
        String kelime1 = "mehmet";
        String kelime2 = "CANAN";
        int kelime1uzunluk=kelime1.length();
        if (kelime1uzunluk%2==0)
            System.out.println(kelime1.substring(0,kelime1uzunluk/2)+kelime2+
                    kelime1.substring(kelime1uzunluk/2));
        else System.out.println("kelime2 kelime1 eklenemez");


    }
}
