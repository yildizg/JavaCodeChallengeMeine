package Q6_sixthCodeChallenge;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Q05_NumberOfDaysInMonths {
    public static void main(String[] args) {
             /*
        Bir aydaki gün sayısını hesaplayan bir Java programı yazınız.

        INPUT:
        Ay Numarasi:
        2
        Yil :
        2016
        OUTPUT :
        Subat 2016 29 Gundur.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("ay numarasi giriniz");
        int ay= input.nextInt();
        System.out.println("yil numarasi giriniz");
        int yil= input.nextInt();
        LocalDate date=LocalDate.of(yil,ay,1);
        System.out.println(date.lengthOfMonth());


    }
}
