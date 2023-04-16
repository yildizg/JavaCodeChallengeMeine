package Q5_fifthCodeChallenge;

import java.util.Scanner;

public class T01_TopZiplamaMesafesi {
    public static void main(String[] args) {
           /* HAFTANIN TASK'iiii :-)
    Bir top belirli yükseklikten atılmaktadır.
    Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
    Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
    Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do while code blogu create ediniz.

    */
        Scanner input =new Scanner(System.in);
        System.out.println("topun atildidigi mesafeyi metre cinsinden gir");
        double yukseklik=input.nextDouble();
        double ziplamaYukseklik = yukseklik*0.75;
        double topunToplamYolu = yukseklik ;//ilk atilan yukseklik atandi toplam yol a
        int yereVurmaSayisi=0;

        do {
            yereVurmaSayisi++;
            yukseklik = ziplamaYukseklik;//
            topunToplamYolu += yukseklik * 2;
            ziplamaYukseklik *= (0.75);
            System.out.println("yukseklik = " + yukseklik);
            System.out.println("topunToplamYolu = " + topunToplamYolu);

        }while (ziplamaYukseklik>=1.0);
        System.out.println("yereVurmaSayisi = " + yereVurmaSayisi);
        System.out.println("girilien = " );
        System.out.println("topunToplamYolu = " + (topunToplamYolu));//dsadadqaFDewfewq


        /*
        chatGPT
               double yukseklik = 10.0; // atıldığı yükseklik
        double ziplamaYuksekligi = yukseklik * 0.5; // zıplama yüksekliği
        double toplamYol = yukseklik; // ilk yükseklik atıldığı mesafedir
        int vurmaSayisi = 0; // top yere her vurduğunda artacak sayı

        do {
            yukseklik = ziplamaYuksekligi;
            toplamYol += yukseklik * 2; // iki kez zıplıyor
            ziplamaYuksekligi *= 0.5;
            vurmaSayisi++;
        } while (ziplamaYuksekligi >= 1.0); // zıplama yüksekliği 1 metrenin altına düştüğünde durdur

        System.out.println("Toplam Yol: " + toplamYol + " metre");
        System.out.println("Vurma Sayısı: " + vurmaSayisi);

Asiye hanim
      int ilkAtYuk = 10;
        double ziplamaOrani = 0.75;
        double toplamYol = ilkAtYuk;
        int vurmaSayisi = 0;
        double ziplamaYuksekligi = ilkAtYuk * ziplamaOrani;

        while (ziplamaYuksekligi > 1.0) {
            toplamYol += 2 * ziplamaYuksekligi;
            ziplamaYuksekligi *= ziplamaOrani;
            vurmaSayisi++;
        }


        toplamYol += ziplamaYuksekligi;

        System.out.println("Toplam yol: " + toplamYol);
        System.out.println("Vurma sayısı: " + vurmaSayisi);

    }

    Ahmet bey
    double yukseklik = 10;
double ziplamaMesafesi = yukseklik * 0.75;
double toplamYol = yukseklik;
int vurmaSayisi = 0;

do {
    toplamYol += ziplamaMesafesi * 2;
    vurmaSayisi++;
    ziplamaMesafesi *= 0.75;
} while (ziplamaMesafesi >= 1);

System.out.println("Alinan toplam yol: " + toplamYol + " metre");
System.out.println("yere vurma sayısı: " + vurmaSayisi);


Gulhan hanim
Scanner input = new Scanner(System.in);

System.out.println("Top hangi yükseklikten birakiliyor : ");
double yukseklik = input.nextDouble();

double yukariZiplama = yukseklik*0.75;

int count =0;
double toplamYol =0;

while(yukariZiplama>1){

    yukariZiplama = yukariZiplama*0.75;
    toplamYol += yukariZiplama*2;
    count++;
}

System.out.println("Toplam yol = " + (toplamYol+yukseklik));
System.out.println("Yere vurma sayisi = " + (count+1));


         */

    }
}
