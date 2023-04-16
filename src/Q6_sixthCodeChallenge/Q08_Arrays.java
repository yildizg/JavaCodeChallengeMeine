    package Q6_sixthCodeChallenge;

    import java.util.ArrayList;
    import java.util.Arrays;

    public class Q08_Arrays {
    public static void main(String[] args) {
                 /*
            aşağıdaki örnekte olduğu gibi 1 den 10 a kadar sayılar
            oluşan dizide eksik olan sayıyı döndüren metodu oluşturunuz.

             ([1, 2, 3, 5, 6, 7, 8, 10,9]) ➞ 4
            ([7, 2, 3, 10, 5, 9, 1, 4, 8]) ➞ 6
            ([7, 5, 1, 2, 4, 6, 8, 3, 9]) ➞ 10



                       public static int eksikSayiyiBul(int[] arr) {
                int n = arr.length + 1; // Dizide n adet sayı var (1'den n'e kadar)
                int toplam = n * (n + 1) / 2; // 1'den n'e kadar sayıların toplamı
                int diziToplami = 0; // Dizideki sayıların toplamı

                for (int i = 0; i < arr.length; i++) {
                    diziToplami += arr[i];
                }

                return toplam - diziToplami; // Eksik sayıyı hesapla ve geri döndür
            }
            Bu metodun mantığı şöyledir: Verilen dizideki sayılar bir aralık içinde olduğu için, 1'den n'e kadar sayıların toplamını hesaplamak mümkündür (n, dizideki sayı adedinden bir fazladır). Bu toplamdan, dizideki sayıların toplamını çıkararak eksik sayıyı bulabilirsiniz. Bu yöntem matematiksel olarak doğrudur, çünkü 1'den n'e kadar sayıların toplamı, aralıktaki tüm sayıların toplamına eşittir.

            Örnek kullanım:

            java
            Copy code
            int[] arr1 = {1, 2, 3, 5, 6, 7, 8, 10, 9};
            int eksikSayi1 = eksikSayiyiBul(arr1);
            System.out.println(eksikSayi1); // Çıktı: 4

            int[] arr2 = {7, 2, 3, 10, 5, 9, 1, 4, 8};
            int eksikSayi2 = eksikSayiyiBul(arr2);
            System.out.println(eksikSayi2); // Çıktı: 6

            int[] arr3 = {7, 5, 1, 2, 4, 6, 8, 3, 9};
            int eksikSayi3 = eksikSayiyiBul(arr3);
            System.out.println(eksikSayi3); // Çıktı: 10
             */










        missingNumber();





        int [] arr1= {1, 2, 3, 5, 6, 7, 8, 10,9};
        int [] arr2= {7, 2, 3, 10, 5, 9, 1, 4, 8};
        int [] arr3= {7, 5, 1, 2, 4, 6, 8, 3, 9};
        int [] arr4= {1, 2, 3, 5, 6, 8, 10,9};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));
        Arrays.sort(arr4);
        System.out.println(Arrays.toString(arr4));
        for (int i = 0; i < arr1.length ; i++) {
            if (arr1[i]==arr1[i]-1)
                System.out.println(arr1[i] + 1);

        }

    }

        private static int missingNumber() {
        int missingNumber=0;



        return missingNumber;
        }
    }
