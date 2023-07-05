package InterviewQuestions;

public class Q06_FrequencyWithStringVaalueOf {
      /* Task->
    Count the frequency of the letters in a given String as the format below:
    Input: String str = "Java is so Good";
    Output: String strOutput = "J1 a2 v1 i1 s2 o3 G1 d1";
    "Java is so Good" stringi için kullanılan harflern tekrarını print eden code create ediniz.
     */
      public static void main(String[] args) {

          String str = "Java is so Good";

          harfSayaci(str);

      }

      private static void harfSayaci(String str) {

            int [] harfList = new int[Character.MAX_VALUE +1 ];

            for (int i = 0; i < str.length(); i++) {

                  char ch = str.charAt(i);

                  int index = (int) ch;

                  harfList[index] ++;
            }

            for (int i = 0; i < harfList.length; i++) {

                  if (harfList[i]>0) {

                        System.out.println((char) i + "= " + harfList[i]);
                  }

            }


      }


}
