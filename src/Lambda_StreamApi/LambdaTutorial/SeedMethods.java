package Lambda_StreamApi.LambdaTutorial;

public class SeedMethods {

    public static void intYazdir(int a){// seed -> tohum method... hic bir özelliği yoktur...

        System.out.print(a+ " ");//parametredeki int değer bir boşluk ile print edilir

    }

    public static boolean ciftMi(int a){
        return a%2==0;
    }

    public static boolean cift35Kck(int x){

        return x<35 && x%2==0;
    }

    public static boolean tek34Byk(int x){

        return x>34 || x%2==1;
    }

    public static int kareAl(int sayi){

        return sayi*sayi;
    }
    public static boolean tekMi(int a){
        return a%2==1;
    }
public static int minBul(int a, int b){

   return a<b ? a:b;

}

}
