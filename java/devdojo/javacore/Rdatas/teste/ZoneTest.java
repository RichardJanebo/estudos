package devdojo.javacore.Rdatas.teste;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Map;

public class ZoneTest {
    public static void main(String[] args) {
        Map<String, String> shorids = ZoneId.SHORT_IDS;

        System.out.println(ZoneId.systemDefault().getRules());


        ZoneId tokio = ZoneId.of("Asia/Tokyo");
        LocalDateTime localDateTime = LocalDateTime.now();
        ZonedDateTime zonedDateTime = localDateTime.atZone(tokio);
        System.out.println(zonedDateTime);

    }
}
