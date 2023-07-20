package tasks20;

import java.util.ArrayList;
import java.util.List;

public class T03_Lesson {

    //fields

    String name;
    int credit;

    public T03_Lesson(String name, int credit) {

        this.name = name;
        this.credit = credit;
    }

    @Override
    public String toString() {
        return "T03_Lesson{" +
                "name='" + name + '\'' +
                ", credit=" + credit +
                '}';
    }
    static List<T03_Lesson> listDersler=new ArrayList<>();

}
