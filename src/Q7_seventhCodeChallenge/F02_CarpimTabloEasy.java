package Q7_seventhCodeChallenge;

public class F02_CarpimTabloEasy {
    public static void main(String[] args) {
        /* verilen sayi icin carpim tablosu olusturun
    Ornek :
        input  : 5
        output : 1  2  3  4  5
                 2  4  6  8 10
                 3  6  9 12 15
                 4  8 12 16 20
                 5 10 15 20 25

 */
//        for (int i = 1; i <=5 ; i++) {
//
//            for (int j = 1; j <=5 ; j++) {
//                System.out.print(i*j+" ");
//
//            }
//
//        }

        int tableInput=5;
        for (int i = 1; i <=tableInput ; i++) {
            for (int j = 1; j <=tableInput; j++) {
                System.out.printf("%-3d",i*j);

            }
            System.out.println();
        }

    }
}
