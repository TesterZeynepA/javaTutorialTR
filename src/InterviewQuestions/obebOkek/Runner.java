package InterviewQuestions.obebOkek;

import static InterviewQuestions.obebOkek.Hesapla.obeb;
import static InterviewQuestions.obebOkek.Hesapla.okek;

public class Runner {
    public static void main(String[] args) {

       ObebOkek obj1 = new ObebOkek(24,36);

        System.out.println("obeb(obj1) = " + obeb(obj1));
        System.out.println("okek(obj1) = " + okek(obj1));


    }
}
