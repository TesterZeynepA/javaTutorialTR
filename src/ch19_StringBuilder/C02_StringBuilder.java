package ch19_StringBuilder;

public class C02_StringBuilder {
    public static void main(String[] args) {
        // 1. bos bir sb objesi oluşturup append ile eklemek

        StringBuilder sb1 = new StringBuilder();// default capacity 16 olan value olmayan boş sb

        System.out.println("sb1.length() = " + sb1.length());//sb1.length() = 0
        System.out.println("sb1.capacity() = " + sb1.capacity());//sb1.capacity() = 16
        // Twice the old capacity, plus 2 yani kapasitenin 2 katı artı 2

        sb1.append("javAslan");//bos olan sb objesine javAslan eklendi

        System.out.println("sb1 = " + sb1);//sb1 = javAslan
        System.out.println("sb1.capacity() = " + sb1.capacity());//sb1.capacity() = 16

        sb1.append("selam ").append("nasilsin ").append(" maaslara zam isi noldu ").append(63). append(" ").append(true);

        System.out.println("sb1 = " + sb1);//sb1 = javAslanselam nasilsin  maaslara zam isi noldu 63 true
        System.out.println("sb1.capacity() = " + sb1.capacity());//sb1.capacity() = 70

        //2. yol String builder create etme

        StringBuilder sb2 = new StringBuilder("Tommy Lee jones");
        System.out.println("sb2.length() = " + sb2.length());//sb2.length() = 15
        System.out.println("sb2.capacity() = " + sb2.capacity());//sb2.capacity() = 31

        // 16 default bos olan sb objesi içindir. burda baslangıçta ekleme yapıldığı için length + 16 = capacity verir.

        //trimToSize()

        System.out.println("trimToSize()");
        System.out.println("sb2.length() = " + sb2.length());//sb2.length() = 15
        sb2.trimToSize();
        System.out.println("sb2.capacity() = " + sb2.capacity());//sb2.capacity() = 15

        System.out.println("sb2.length() = " + sb2.length());//sb2.length() = 15


        StringBuilder sb3 = new StringBuilder(11);
        System.out.println("sb3.length() = " + sb3.length());//sb3.length() = 0
        System.out.println("sb3.capacity() = " + sb3.capacity());//sb3.capacity() = 11
        sb3.append("Rumeysa hanim QA");
        System.out.println("sb3.capacity() = " + sb3.capacity());//sb3.capacity() = 24

        //girilen indexteki karakteri getirmek için
        System.out.println("sb3.charAt(4) = " + sb3.charAt(4));//sb3.charAt(4) = y

        //istenen index araliğindaki deger getirmek için subSequence

        System.out.println("sb1.subSequence(3,10) = " + sb1.subSequence(3, 10));//sb1.subSequence(3,10) = Aslanse

        System.out.println("sb1.substring(3,10) = " + sb1.substring(3, 10));//sb1.substring(3,10) = Aslanse

        //girilen iki int index arasini siler delete()

        System.out.println("sb1.delete(3,10) = " + sb1.delete(3, 10));//sb1.delete(3,10) = javlam nasilsin  maaslara zam isi noldu 63 true

        //girilen int index teki karakteri silen deleteCharAt

        System.out.println("sb1.deleteCharAt(6) = " + sb1.deleteCharAt(6));
        //sb1.deleteCharAt(6) = javlamnasilsin  maaslara zam isi noldu 63 true

        //istenen index e  istenen ifadeyi ekler

        System.out.println("sb3 = " + sb3);//sb3 = Rumeysa hanim QA
        System.out.println("sb3.insert(4, \";)\") = " + sb3.insert(7, ";)"));//sb3.insert(4, ";)") = Rumeysa;) hanim QA

        //belirli bir stringbuilder in istenen indexine verilen string in istenen index araliğini ekleme

        System.out.println("sb3.insert(0, \"hello\", 3, 7) = " + sb3.insert(15, "hello", 1, 3));
        //sb3.insert(0, "hello", 3, 7) = Rumeysa;) hanimel QA

        //belirli indexteki karakteri değiştirme

        sb3.setCharAt(5, 'S');
        System.out.println("sb3 = " + sb3);//sb3 = RumeySa;) hanimel QA

        // istenen araliktaki degeri siler ve yerine istenen string i ekler

        System.out.println("sb3.replace(7,9, \"mesgul\") = " + sb3.replace(7, 9, "mesgul"));

        //sb3.replace(7,9, "mesgul") = RumeySamesgul hanimel QA


    }
}
