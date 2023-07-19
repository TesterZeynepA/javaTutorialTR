package InterviewQuestions;

public class Q29_SurviveMonkey {
    /* Task->
    There is a lonely monkey in the island
    He needs to eat 4 bananas every day
    there are just 165 bananas in that island
    Create following variables and find how many days
    monkey can survive.
    Use do while loop, increment and decrement and if statements
    int numberOfBananas =165, survivalDays = 1;
    boolean monkeyAlive = true;
    */
    public static void main(String[] args) {

        int muzSayisi =165;
        int hayattaKaldığıGün =1;
        boolean maymunYasiyorMu = true;

        do {
            muzSayisi -= 4;

            if (muzSayisi >= 0) {
                hayattaKaldığıGün++;
            } else {
                maymunYasiyorMu = false;
            }
        } while (maymunYasiyorMu);

        System.out.println("Maymunun hayatta kalabileceği gün sayisi " + (hayattaKaldığıGün - 1) + " gündür.");
    }
}
