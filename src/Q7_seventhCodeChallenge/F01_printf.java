package Q7_seventhCodeChallenge;

public class F01_printf {
    public static void main(String[] args) {
        int sayi=233;
        String str="Bütün staticler esittir ,main daha az esittir";
        double db=3.5565;
        System.out.println(sayi+""+ str+""+db);

        System.out.printf("sayi:%d,str:%s,db:%f \n",sayi,str,db);

        System.out.printf("sayi:%d,str:%S,db:%f \n",sayi,str,db);

        System.out.printf("sayi:%10d,str:%-20.10S,db:%-5.3f \n",sayi,str,db);

    }
}
