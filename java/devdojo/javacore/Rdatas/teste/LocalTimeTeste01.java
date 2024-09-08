package devdojo.javacore.Rdatas.teste;

import java.time.LocalTime;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class LocalTimeTeste01 {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime.getHour());
        System.out.println(localTime.getMinute());

        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);

        Timer timer = new Timer();

        timer.schedule(new TimerTask() {
            @Override
            public void run(){
                System.out.println(localTime.getSecond());

            }
            
        }, 2000);

        scheduledExecutorService.scheduleAtFixedRate(() -> {
            System.out.println("Executado a cada 2 segundos");
        }, 0, 2, TimeUnit.SECONDS);
    
    }
}
