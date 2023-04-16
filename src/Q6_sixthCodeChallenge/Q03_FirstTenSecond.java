    package Q6_sixthCodeChallenge;

    import java.time.LocalDateTime;

    public class Q03_FirstTenSecond {
    public static void main(String[] args) {
    //LocalDate time ile (// her dakikanın ilk 10  saniyesi icinde ise sanslisin yazdir
        //süreyya
        LocalDateTime now = LocalDateTime.now();
        int second = now.getSecond();
        if (second < 10) {
            System.out.println("Şanslısın!");
        } else {
            System.out.println("Şanslı değilsin.");
        }


        //ahmet

        LocalDateTime time=LocalDateTime.now();

        int saniye=time.getSecond();

        if (saniye<10){
            System.out.println("sanslisin");
        }else System.out.println("sansin yok");




    }
    }
