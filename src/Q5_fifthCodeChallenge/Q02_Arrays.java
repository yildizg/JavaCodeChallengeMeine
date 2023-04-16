package Q5_fifthCodeChallenge;

import java.util.Arrays;

public class Q02_Arrays {

    public static void main(String[] args) {//easy
        /*
         *  Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
         *      String cumle ="Egitimde ter dokmeyen, savAsta kan doker";
         */

        String cumle ="Egitimde ter dokmeyen, savAsta kan doker";//35

       //1. yol
        System.out.println("cumle.replace(\" \",\"\").length() = " + cumle.replace(" ", "").length());
                            //cumle.replace(" ","").length() = 35

        //2.yol
        String [] arr=cumle.//cumle alindi
                replace(" ","").//cumledeki bosluklar hiclig e cevrifil
                split("");      //bu String array e hiclikten  cevrildi

        System.out.println("arr.length = " + arr.length);//arr.length = 35


        //3.yol
        String [] kelime=cumle.split(" ");
        System.out.println("Arrays.toString(kelime) = " + Arrays.toString(kelime));

        int boslukSayisi= kelime.length -1;
        System.out.println("boslukSayisi = " + boslukSayisi);//boslukSayisi = 5

        String [] tumKarakterler=cumle.split("");
        System.out.println("tumKarakterler.length-boslukSayisi = " + (tumKarakterler.length - boslukSayisi));
                                //tumKarakterler.length-boslukSayisi = 35

    }


}
