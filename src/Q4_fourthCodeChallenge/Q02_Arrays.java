package Q4_fourthCodeChallenge;

import java.util.Arrays;

public class Q02_Arrays {
    public static void main(String[] args) {
        /*  you have a string "HeySiri"
         * with arrays change it to "ByeSiri" and write changing array
         *(String iniz: "HeySiri"  Diziyi "ByeSiri" ye cevirin )
         *
         */
        String str="HeySiri";
        //array ile cozumu
         String [] arr= str.split("y");// [He,Siri]
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        arr[0]="Bye";
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));

        str = arr[0] + arr[1];
        System.out.println("str = " + str);


    }
}
