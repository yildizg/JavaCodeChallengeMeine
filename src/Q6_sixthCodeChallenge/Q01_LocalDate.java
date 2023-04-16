    package Q6_sixthCodeChallenge;

    import java.time.LocalDate;

    public class Q01_LocalDate {
    public static void main(String[] args) {
        LocalDate  str=LocalDate.now();
        System.out.println(str);
        System.out.println(str.plusYears(1).plusMonths(1).plusDays(1));
        System.out.println(str);
        LocalDate  str1=    str.plusYears(1).plusMonths(1).plusDays(1);
        System.out.println(str1);
        System.out.println(str1.minusYears(5).minusMonths(2).minusDays(3));


    }

}
