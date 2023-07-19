package InterviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class Q32_2D_CollectionsTask {
    // Create 2D ArrayList which can store String ArrayLists
    // Create 3 ArrayLists which are Employees, Employers, Companies
    // Store this 3 ArrayList in 2D ArrayList

    // String ArrayList'leri depolayabilen 2D ArrayList oluşturun
    // Çalışanlar, İşverenler, Şirketler olmak üzere 3 DiziListesi oluşturun
    // Bu 3 ArrayList'i 2D ArrayList'te saklayın

    public static void main(String[] args) {

            List<List<String>> listDepo = new ArrayList<>();

            List<String> calisanlar = new ArrayList<>(List.of("Zeynep", "Esra", "Azra"));
            List<String> isverenler = new ArrayList<>(List.of("Haluk", "Elly"));
            List<String> sirketler = new ArrayList<>(List.of("Clarusway"));

            listDepo.add(calisanlar);
            listDepo.add(isverenler);
            listDepo.add(sirketler);

            System.out.println("listDepo = " + listDepo);

            for (List<String> w : listDepo) {
                for (String x : w) {
                    System.out.print(x + " ");
                }
                System.out.println();
            }
        }
    }