package InterviewQuestions;

public class Q44_PrintArray {
    //Task->
    // Create a method which takes String array as a parameter
    // and prints all the element

    public static void main(String[] args) {

        String [] arr = {"zeynep", "serap hanim", "haluk hoca", "aytekin bey"};

        printArr(arr);

    }

    private static void printArr(String[] arr) {
        for (String s : arr) {
            System.out.println(s+ " ");
        }

    }
}
