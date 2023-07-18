package tasks20;

public class T03_Lesson {

    //fields

    String ders;
    int credit;

    public T03_Lesson() {

    }

    public T03_Lesson(String name, int credit) {
        this.ders = name;
        this.credit = credit;
    }

    @Override
    public String toString() {
        return "T03_Lesson{" +
                "ders='" + ders + '\'' +
                ", credit=" + credit +
                '}';
    }
}
