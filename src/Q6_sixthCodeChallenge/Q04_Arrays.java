    package Q6_sixthCodeChallenge;

    import java.util.Arrays;

    public class Q04_Arrays {
    public static void main(String[] args) {
        /*  Find the middle element in an integer array
        Example:  (10, 5, 6) ==> (5, 6, 10) ==> Output=6
        (16, 5, 8, 10) ==> (5, 8, 10, 16) ==> Output=(8+10)/2 = 9
                */


        int[] arr = {10, 5, 6};
        int [] arr2 ={5, 8, 10, 16};
//to do arr2 icin de yap
        for (int i = 0; i < arr.length; i++) {
            if (arr.length % 2 != 0) {
                System.out.println(arr[arr.length / 2 ]);

            } else if (arr.length % 2 == 0) {
                System.out.println(arr[arr.length / 2] + arr[arr.length - 1] / 2);


            }


        }
    }
    }
