package Q7_seventhCodeChallenge;

import java.util.Scanner;

public class Q02_ConsoleMinMax {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Min sayi girin");
        int min= scn.nextInt();
        System.out.println("Min sayi girin");
        int max= scn.nextInt();


        int random= (int) (Math.random()* (max-min+1)+min);


    }
}
