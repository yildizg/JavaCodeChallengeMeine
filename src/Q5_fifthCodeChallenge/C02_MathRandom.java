package Q5_fifthCodeChallenge;

import java.util.Random;
import java.util.Scanner;

public class C02_MathRandom {
    public static void main(String[] args) {
         /*
    Ask user to enter a number and print on console number by number matrix.
    Example:
    Input: 10

    Output:
    1 0 0 1 1 0 0 0 1 1
    0 0 1 0 1 0 1 0 0 0
    0 1 0 1 0 0 0 0 0 1
    1 1 1 0 0 0 0 1 1 1
    1 1 0 1 1 1 0 1 0 0
    1 0 0 0 1 1 0 0 0 0
    0 0 1 0 0 0 0 1 1 1
    1 1 0 1 0 1 0 0 1 0
    0 0 1 0 0 0 0 1 1 0
    1 1 1 0 0 1 1 1 1 0

    */

        Scanner input =new Scanner(System.in);
        Random random = new Random();

        System.out.println("matrisin bouyutu ne olsun");
        int boyut =input.nextInt();

        for (int i = 0; i < boyut ; i++) {
            for (int j = 0; j < boyut; j++) {
              //  System.out.print( (int) ( Math.random() * 2 ) + " ");
                System.out.print( random.nextInt(2)+" ");
            }
            System.out.println();
        }


        //chatGPT





    }
}
