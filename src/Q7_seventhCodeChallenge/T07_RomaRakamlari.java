package Q7_seventhCodeChallenge;

    public class T07_RomaRakamlari {
    public static void main(String[] args) {
         /*  TASK :
		 	Create a method to convert Roman numerals to numbers
		 	Romen rakamlarını sayılara dönüştürmek için bir method create ediniz
		 	Input:
		 		System.out.println(romanNumbers(805));
		   		System.out.println(fromRomans("DCCCV"));
		   	Output: DCCCV   805
                I: 1
                V: 5
                X: 10
                L: 50
                C: 100
                D: 500
                M: 1000

		   		M + [C M] + [X L] + V   ---->   1945
		   		The chars in the brackets are in ascending order.
		   		 Parantez içindeki karakterler artan sıradadır (C-100, M-1000) ---> [C M]=900

		   		 //CHATGPT
		   		 public static int fromRomans(String romanNum) {
                Map<Character, Integer> romanToNum = new HashMap<Character, Integer>();
                romanToNum.put('I', 1);
                romanToNum.put('V', 5);
                romanToNum.put('X', 10);
                romanToNum.put('L', 50);
                romanToNum.put('C', 100);
                romanToNum.put('D', 500);
                romanToNum.put('M', 1000);

                int result = 0;
                int prevNum = 0;

                for (int i = romanNum.length() - 1; i >= 0; i--) {
                    char ch = romanNum.charAt(i);
                    int currNum = romanToNum.get(ch);
                    if (currNum < prevNum) {
                        result -= currNum;
                    } else {
                        result += currNum;
                    }
                    prevNum = currNum;
                }

                return result;
            }
            System.out.println(fromRomans("DCCCV")); // Output: 805


		*/
        String roma="DCCCV";
        //convertToRoman();

        //👩‍💻

    }

        private static void convertToRoman(String roma) {//DCCCV
        
        int sum=0;
            for (int i = 0; i <roma.length(); i++) {
                
            }
        }
        static int valueOf(char a){
        if (a=='I')return 1;
        if (a=='V')return 5;
        if (a=='X')return 10;
        if (a=='L')return 50;
        if (a=='C')return 100;
        if (a=='D')return 500;
        if (a=='M')return 1000;
        return 0;

        }
    }
