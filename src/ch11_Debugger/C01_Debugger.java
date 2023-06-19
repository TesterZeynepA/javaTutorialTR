package ch11_Debugger;

public class C01_Debugger {

    /*
Debug yapiyorsan, kodu anlamadin demektir.
Debug yaparken kodu anlamiyorsan, nasil debug yapilir, onu anlamadin demektir.
Debug yaparken kodu anladigini dusunuyorsan, aslinda debuga ihtiyacin olmadigini anladin demektir.
Debug etmek kodun mental bir modelinin eksikligine isarettir...



    iki durumda debugger gerekli olabilir;
    * mevcut kod devralindiğinda
    * yeni kod yazıldığında
    her iki durumda da debugger çalıştırmamaya dikkat edilmeli.
    amac sıfır debug aktivitesi ile uygulamayı istenilen seviyeye getirebilmek.
     */




    public static void main(String[] args) {

        String str = "bunu ilerde kullanın hocam 'korku iyidir diri tutar";
        System.out.println(str.substring(10)); //e kullanın hocam "korku iyidir diri tutar

        System.out.println(str.substring(str.length()-6));//tutar











    }
}
