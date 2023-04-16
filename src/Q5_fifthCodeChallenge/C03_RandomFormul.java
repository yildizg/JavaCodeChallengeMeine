package Q5_fifthCodeChallenge;

import java.util.Random;

public class C03_RandomFormul {
    public static void main(String[] args) {

        //verilen max ve min degerler arasi random sayi ureten code yaziniz

        int min = 55;
        int max = 72;


        double sayi= Math.random();
        System.out.println("sayi = " + sayi);
        System.out.println("sayi = " + (sayi*50));

        System.out.println("Math.random() = " + Math.random());//0.0 ile 1.0 arasinda deger uretir

        //gulhan hanim
        Random rand = new Random();
        System.out.println("(rand.nextInt(max)+min) = " + (rand.nextInt(   (max - min ) + 1 ) + min  ));

        int randomNumber= (int) (Math.random() * (( max - min ) + 1 ) + min );
        int randomNumber2= (int) (Math.random() * (( max  + 1 )+ min  ));



        System.out.println("randomNumber = " + randomNumber);
        System.out.println("randomNumber2 = " + randomNumber2);


    }
}
