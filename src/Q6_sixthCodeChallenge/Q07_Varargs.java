    package Q6_sixthCodeChallenge;

    public class Q07_Varargs {
    public static void main(String[] args) {
        // istedigimiz kadar sayi girdigimizde
    // toplamlari bize veren bir method yazalim...


        System.out.println(sumAll(2, 5, 6, 34, 55, 66, 99, 88, 2, 22, 55, 33, 6, 10, 5, 55, 5, 55, 58, 51, 5, 151));


    }

        private static double sumAll(double ...i) {
        double toplam=0;
            for (double w:i) {
                toplam+=w;
            }
            return toplam;
        }


    }
