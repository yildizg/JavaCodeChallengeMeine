    package Q7_seventhCodeChallenge;

    import java.util.Random;
    import java.util.Scanner;

    public class Q03_ZarSorusu {
        /*
    Iki tane atilan zarin toplamlarinin 9 olmasi durumanda "Kazandiniz"
    yazisini yazdirin,
     aksi takdirde "Tekrar deneyiniz" yazisi yazmali

     */
        public static void main(String[] args) {
//           int  min=1;
//           int max=6;
//           int zar1= (int) (Math.random()* (max-min+1)+min);
//          // int toplam=zar1+zar2;
//            System.out.println("toplam = " + toplam);
//            if (toplam==9){
//                System.out.println("kazandin");
//            }else System.out.println("tekrar dene");


            //Ahmet bey
            Scanner input=new Scanner(System.in);
            System.out.println("1-6 ya kadar bir sayi gir");
            int sayi= input.nextInt();
            System.out.println("1-6 ya kadar bir sayi gir");
            int sayi1= input.nextInt();

            int random1=(int)(Math.random()*(sayi-sayi1+1)+sayi);
            int random2=(int)(Math.random()*(sayi-sayi1+1)+sayi);
            if (random1+random2==9){
                System.out.println("kazandiniz");
            }else System.out.println("tekrar dene");

            //gülhan hnm
            int randomNumber = (int) (Math.random() * ((6 - 1 + 1) + 1));
            System.out.println("randomNumber = " + randomNumber);
            int randomNumber2 = (int) (Math.random() * ((6 - 1 + 1) + 1));
            System.out.println("randomNumber2 = " + randomNumber2);
            if(randomNumber+randomNumber2 ==9){
                System.out.println("Kazandiniz");
            }else System.out.println("Kaybettiniz");
    }
}
