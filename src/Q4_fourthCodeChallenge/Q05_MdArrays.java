package Q4_fourthCodeChallenge;

public class Q05_MdArrays {
    public static void main(String[] args) {
        /*
         * {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}} int 2D arrayini  olustur
         *  2D arrayinden min number print et
         */

        int [][] arr={   {1  ,2 ,  3,8},   {2,   3,   1} ,   {5,   5,   5,6,77} , {2,  1,   -3}    };

   //    int min = 0 ;
        int min = arr[1][2];//3 rastgele bir minimum  deger atandi

//Ahmet bey
//        for (int i = 0; i < arr.length ; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                if (arr[i][j] < min) {
//                    min = arr[i][j];
//                    min = Math.min(min, arr[i][j]);
//                }
//            }
//        }
        //diger yol
        for (int i = 0; i <arr.length ; i++) {
            System.out.println("arr ["+ i +" ] length => " +arr[i].length);
            for (int j = 0; j <arr[i].length ; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }

            }
        }

        System.out.println("min = " + min);

    }
}
