package seventhCodeChallenge;
public class Q01_OddEvenNumber {
    public static void main(String[] args) {
        //Math.random() kullanarak cikan sayinin cift ya da tek sayi olup olmamasini kontrol edin
        //Cift sayi ise cift sayi oldugunu, tek ise tek sayi oldugunu yazdiriniz
        int min=55;
        int max=125;
        int randomNumber= (int) (Math.random() * ((max-min+1 )) + min);
        System.out.println("randomNumber = " + randomNumber);
        System.out.println(randomNumber % 2 == 0 ? "sayi Cift" : "tek sayi");
        //sureyya hanim
        int rastgeleSayi = (int)(Math.random() * (max - min + 1)) + min;
        if (rastgeleSayi % 2 == 0) {
            System.out.println(rastgeleSayi + " Çift sayı");
        } else {
            System.out.println(rastgeleSayi + " Tek sayı");
        }
        //2 .yol
        int random=(int) (Math.random()*100);
        System.out.println("random = " + random);
        System.out.println(random % 2 == 0 ? "sayi Cift" : "tek sayi");
    }
}