package tasks20;

import java.util.ArrayList;
import java.util.List;

public class T03_Student {
    String studentname;

    int maxCredit;

    List<T03_Lesson> secilenDersler=new ArrayList<>();

    public int toplamKredi() {
        int toplamKredi=0;
        for (T03_Lesson dersler : secilenDersler) {
            if (toplamKredi <= maxCredit) {
                toplamKredi+=dersler.credit;
            }
        }
        return toplamKredi;
    }

    public T03_Student(String studentname, int maxCredit) {
        this.studentname = studentname;
        this.maxCredit = maxCredit;
    }
}
