package InterviewQuestions;

public class Q64_MountainArray {
/*
 Bir Array'in Mountain Array olup olmadiğini kontrol eden bir kod yaziniz.
 Mountain Array: Element degerleri bir noktaya kadar surekli artip o noktadan sonra surekli azalan Array.
 arr[0] < arr[1] < arr[i] >arr[i+1] > arr[i+2] > arr[n-1]

----------------------------------------------------------------------------------------------------------------------*/
    public static void main (String[] args) {
        int arr[] = { 1, 2, 3, 4, 9, 8, 7, 6, 5 };
        System.out.println("arr1 is a Mountain Array: " + isMountainArray(arr));

    }

    public static boolean isMountainArray(int[] arr) {
        
        boolean mountainArrayMi= true;

        if (arr.length < 3) {
            return false; // Mountain Array en az 3 elemandan oluşmalı
        }

        int maxEleman = arr[0], index=0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > maxEleman) {

                maxEleman=arr[i];//arraydeki max elemanı verir.->9
                index=i;//arraydeki max elemanı veren array index'i ->4
            }
        }
        for (int i = 0; i < index; i++) {

            if (arr[i]< arr[i+1]) {

                continue;


            }else {
                mountainArrayMi= false;
                break;
            }
        }
        if (mountainArrayMi) {
            for (int i = index; i < arr.length - 1; i++) {//max elemandan son elemana  duzenli azalıyor mu kntrolu
                if (arr[i] > arr[i + 1]) {
                    continue;
                } else {
                    mountainArrayMi = false;
                    break;
                }
            }
        }

        return mountainArrayMi;
     }
}//Class sonu