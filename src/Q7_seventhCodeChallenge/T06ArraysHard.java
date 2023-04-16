package Q7_seventhCodeChallenge;

import java.util.Arrays;

public class T06ArraysHard {
    public static void main(String[] args) {
            /* TASK :
         kullanıcıdan alınan bir  String'deki herbir  karakterin adedini bir array içinde yazdıran bir java programı yazın.
         String  "Javacilar cook afilli" ise cevap şöyle olmalıdır:
         { =2, a=3, r=1, c=1, v=1, o=2, f=1, l=2, J=1, i=2}
              CHATGPT
                 import java.util.HashMap;
        import java.util.Map;
        import java.util.Scanner;

        public class CharacterCounter {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Bir metin girin: ");
                String text = scanner.nextLine();
                scanner.close();

                // boşlukları dikkate almamak için metindeki tüm boşlukları kaldır
                text = text.replaceAll("\\s+", "");

                // karakterleri saymak için bir Harita (Map) kullan
                Map<Character, Integer> charCountMap = new HashMap<>();

                // her bir karakterin sayısını hesapla
                for (int i = 0; i < text.length(); i++) {
                    char c = text.charAt(i);
                    if (charCountMap.containsKey(c)) {
                        int count = charCountMap.get(c);
                        charCountMap.put(c, count + 1);
                    } else {
                        charCountMap.put(c, 1);
                    }
                }

                // sonucu yazdır
                System.out.println(charCountMap);
            }
        }

                 */
        String str = "Javacilar cook afilli";
//        int count[] = new int[255];
//        for (int i = 0; i < str.length(); i++) {
//            count[i] = str.charAt(i);
//            count[str.charAt(i)]++;
//            int a = count[str.charAt(i)];
//        }
//        char ch[] = new char[str.length()];
//        for (int i = 0; i < str.length(); i++) {
//            ch[i] = str.charAt(i);
//            int find = 0;
//            for (int j = 0; j <= i; j++) {
//                if (str.charAt(i) == ch[j]) {
//                    find++;
//                }
//
//            }}
        String[] arr = str.split("");
        //System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        Arrays.sort(arr);


        //     Arrays.toString(str1) = [J, a, v, a, c, i, l, a, r,  , c, o, o, k,  , a, f, i, l, l, i]

        //gülhan
//        Scanner input = new Scanner(System.in);
//        System.out.print("Bir metin girin : ");
//        String str = input.nextLine();
//        String [] strArr = str.replaceAll("\\s", "").split("");
//        Arrays.sort(strArr);
//        List<Integer> harfSayisi = new ArrayList<>();
//        for (int i = 0; i < strArr.length ; i++) {
//            int count =1;
//            for (int j = i+1; j < strArr.length ; j++) {
//                if (strArr[i].equalsIgnoreCase(strArr[j]))
//                    count++;
//            }
//            i+= count-1;
//            harfSayisi.add(count);
//        }
//        List<String> tekrarsiz = new ArrayList<>(Arrays.asList(strArr));
//        for (int i = 0; i < strArr.length ; i++) {
//            for (int j = i+1; j < strArr.length ; j++) {
//                if (strArr[i].equalsIgnoreCase(strArr[j]))
//                    tekrarsiz.remove(strArr[j]);
//                if (strArr[i].equalsIgnoreCase(strArr[j]) && !tekrarsiz.contains(strArr[i]))
//                    tekrarsiz.add(strArr[i]);

        //fethiye
//        Scanner input=new Scanner(System.in);
//        System.out.println("string bir ifade gir");
//        String str= input.nextLine();
//        int [] karakterCount= new int[256];//Bu dizinin elemanları, karakterlerin ASCII kodlarını temsil eden 0-255 arasındaki tamsayılardan oluyor.
//        for (int i = 0; i < str.length(); i++) {
//            char karakter=str.charAt(i);
//            karakterCount[karakter]++;
//        }
//        for (int i = 0; i < karakterCount.length; i++) {
//            if (karakterCount[i]>0){
//                System.out.print((char) i+ "= " + karakterCount[i] + ",");
//            }
//        }
//            for (int i = 0; i < str1.length; i++) {
//
//                if (str[i] == str[i]) {
//
//                }
//
//
//            }
//
//
//        }
//    }}
    }}