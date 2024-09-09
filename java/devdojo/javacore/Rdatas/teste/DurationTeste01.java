package devdojo.javacore.Rdatas.teste;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationTeste01 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime timeNow = LocalDateTime.now().plusYears(2);

        LocalTime localTime = LocalTime.now();
        LocalTime localTime2 = LocalTime.now().plusHours(2);

    

        System.out.println("Local Time 2" + localTime2);

        System.out.println(localTime.getNano());



        Duration duration = Duration.ofDays(20);
        System.out.println(duration);
        Duration duration2 = Duration.between(localTime, localTime2);

        System.out.println(duration2);
    }
}
