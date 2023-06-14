package Challange05;

public class Q09_ForLoop {
    public static void main(String[] args) {

//Type all integers which are divisible by 4 and divisible by 6 from 120 to 11 in the same line with a space between consecutive integers

//120'den 11'e kadar 4'e bölünebilen ve 6'ya bölünebilen tüm tam sayıları aynı satıra ardışık tamsayılar arasında boşluk bırakarak yazın.

        for (int i = 120; i >11; i--) {

            if (i%12==0) {

                System.out.print(i + " ");
            }
            
        }
        
        
        



    }
}
