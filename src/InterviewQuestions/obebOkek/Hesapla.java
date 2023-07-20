package InterviewQuestions.obebOkek;

public class Hesapla {



    ObebOkek obj1= new ObebOkek(3,12);

    public static int obeb(ObebOkek eleman){

        int obeb=0;

        int ks =Math.min(eleman.getS1(), eleman.getS2());
        for (int i = ks; i >1 ; i--) {

            if (eleman.getS1()%i==0&& eleman.getS2()%i==0){

               obeb=i;
               break;

            }
        }
          return obeb;

    }

   // public static int okek(ObebOkek eleman){


  //  }

}
