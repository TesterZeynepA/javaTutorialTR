package Project2;

public class Task07_RomaRakamlari {
    /*  TASK :
		 	Create a method to convert Roman numerals to numbers
		 	Romen rakamlarını sayılara dönüştürmek için bir method create ediniz
		 	Input:
		 		System.out.println(romanNumbers(805));
		   		System.out.println(fromRomans("DCCCV"));
		   	Output: DCCCV   805


		   		M + [C M] + [X L] + V   ---->   1945
		   		The chars in the brackets are in ascending order.
		   		 Parantez içindeki karakterler artan sıradadır (C-100, M-1000) ---> [C M]=900
		*/
    public static void main(String[] args) {

         String sayi = "MCMXLV";
        // String sayi = "DCCCV";

        System.out.println("romaRakamlari(sayi) = " + romaRakamlari(sayi));

    }

    private static int romaRakamlari(String sayi) {

        int rakamToplam =0;

        for (int i = 0; i <sayi.length()-1 ; i++) {

            if (romaRakam(sayi.charAt(i)) < romaRakam(sayi.charAt(i+1))) {

              rakamToplam += romaRakam(sayi.charAt(i+1)) - romaRakam(sayi.charAt(i));

              sayi = sayi.replace(sayi.substring(i,i+2), "");//CM handle edildi

                i--;
            }

        }

        for (int i = 0; i < sayi.length(); i++) {

            rakamToplam+= romaRakam(sayi.charAt(i));

        }

return rakamToplam;

    }

    public static int romaRakam(char a) {

            if (a == 'I') return 1;
            if (a == 'V') return 5;
            if (a == 'X') return 10;
            if (a == 'L') return 50;
            if (a == 'C') return 100;
            if (a == 'D') return 500;
            if (a == 'M') return 1000;

            return 0;

    }//main
}//class
