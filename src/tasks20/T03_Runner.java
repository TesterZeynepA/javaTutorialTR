package tasks20;


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
        T03_Lesson ders1 = new T03_Lesson("matematik",4);
        T03_Lesson ders2 = new T03_Lesson("fizik",5);
        T03_Lesson ders3 = new T03_Lesson("türkçe",8);
        T03_Student ogrenci = new T03_Student("zeynep", 10);
        ogrenci.dersList.add(ders1);
        ogrenci.dersList.add(ders2);
        ogrenci.dersList.add(ders3);












    }

}
