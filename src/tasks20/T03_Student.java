package tasks20;

import java.util.ArrayList;
import java.util.List;

public class T03_Student {

    String studentName;
    int maxCredit;

    List<T03_Lesson> dersList = new ArrayList<>();

    public int toplamKredi(){
        int toplamKredi=0;
        for (T03_Lesson dersler : dersList){

            toplamKredi+=dersler.credit;
        }
        return toplamKredi;
    }

    public T03_Student(String studentName, int maxCredit) {
        this.studentName = studentName;
        this.maxCredit = maxCredit;
    }
}

