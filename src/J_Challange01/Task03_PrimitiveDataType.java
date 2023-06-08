package J_Challange01;

public class Task03_PrimitiveDataType { //class blok



    public static void main(String[] args) { //main block

/*
  * Primitive data type
         byte: only takes whole numbers
    short: only takes whole numbers
    int(used more often): only takes whole numbers
    long: only takes whole numbers

    float: can take decimals (MUST have F or f at the end)
    double( used more often): can take decimals

    boolean: true or false boolean expressions
    char: character within single quote ''
          also takes number
  * Range: double > float >long > int >short > byte
  * !!! soutv degeri ile yazdirma
  */
        //Her veri turuyle bir tane olmak uzere 4 degisken olusturun (float, double, char, boolean)
        //Degiskenler icin anlamli isimler kullanip, yazdiralim
  //byte, short, integer,long, double, float veri tiplerinin max ve min degerlerini prinr eden code create ediniz.



byte byteMinValue = Byte.MIN_VALUE;
        System.out.println("byteMinValue = " + byteMinValue);
        byte byteMaxValue = Byte.MAX_VALUE;
        System.out.println("byteMaxValue = " + byteMaxValue);

        short shortMinValue = Short.MIN_VALUE;
        System.out.println("shortMinValue = " + shortMinValue);
        short shortMaxValue = Short.MAX_VALUE;
        System.out.println("shortMaxValue = " + shortMaxValue);

        int intMinValue = Integer.MIN_VALUE;
        System.out.println("intMinValue = " + intMinValue);
        int intMaxValue = Integer.MAX_VALUE;
        System.out.println("intMaxValue = " + intMaxValue);

        long longMinValue = Long.MIN_VALUE;
        System.out.println("longMinValue = " + longMinValue);
        long longMaxValue = Long.MAX_VALUE;
        System.out.println("longMaxValue = " + longMaxValue);

        double doubleMinValue = Double.MIN_VALUE;
        System.out.println("doubleMinValue = " + doubleMinValue);
        double doubleMaxValue = Double.MAX_VALUE;
        System.out.println("doubleMaxValue = " + doubleMaxValue);

        float floatMinValue = Float.MIN_VALUE;
        System.out.println("floatMinValue = " + floatMinValue);
        float floatMaxValue = Float.MAX_VALUE;
        System.out.println("floatMaxValue = " + floatMaxValue);


        float boy = 1.62f;
        System.out.println("boy = " + boy);
        double num = 32.7;
        System.out.println("num = " + num);
        char character = '&';
        System.out.println("character = " + character);
        boolean veri = false;
        System.out.println("veri = " + veri);




    }//main sonu
}//Class sonu
