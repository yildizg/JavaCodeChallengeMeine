    package Q6_sixthCodeChallenge;

    import java.util.ArrayList;
    import java.util.Arrays;
    import java.util.List;
    import java.util.Scanner;

    public class Q09_ArrayList {
    public static void main(String[] args) {
                /*
        A list has elements "H", "G" and "E"
        Ask user to enter a letter
        If the letter exists in list convert it to "Got it"
        otherwise add it to the list.
        Example : [H, G, E]
                        Enter a letter :  h
                        [Got It, G, E]
                        Enter a letter :  a
                        [H, G, E, A]
              */

     List<String> list=new ArrayList<>(Arrays.asList("H","G","E"));
        System.out.println(list);
        Scanner input =new Scanner(System.in);
        System.out.println("bir harf giriniz");
        String str= input.next().trim().substring(0,1).toUpperCase();
        if (list.contains(str)){
            list.set(list.indexOf(str),"Got it");
        }else list.add(str);

    }

}
