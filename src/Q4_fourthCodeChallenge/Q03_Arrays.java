package Q4_fourthCodeChallenge;

public class Q03_Arrays {
    public static void main(String[] args) {
        /*MEDIUM
         * verilen Arrayde toplamlari istenen degere esit olan sayi ciftlerini //
         * yazdiran bir method yaziniz
         * int[] arr= {5,7,-6,4,2,15,3,8,1};
         * int istenenToplam = 9;
         * count = ?
         */
        int [] arr= {5,7,-6,4,2,15,3,8,1} ;
        int istenenToplam = 9;

        toplamDokuz(arr,istenenToplam);
    }

    private static void toplamDokuz(int[] arr, int istenenToplam) {
        int count=0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i]+arr[j]==istenenToplam){
                    count++;
                    System.out.println(arr[i]+" ve "+arr[j]+" "+istenenToplam+" "+count+" tane var");

                }
            }

        }

    }
}
