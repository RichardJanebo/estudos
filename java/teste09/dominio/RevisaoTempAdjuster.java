package teste09.dominio;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RevisaoTempAdjuster {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        TemporalAdjuster temporalAdjusters = TemporalAdjusters.next(DayOfWeek.SATURDAY);
        System.out.println(localDate.with(temporalAdjusters));


        String pesquisa = "\\s";
        String teste = "adgfg ads55455g as5418d";

        Pattern pattern = Pattern.compile(pesquisa);
        Matcher matcher = pattern.matcher(teste);

        while(matcher.find()){
            System.out.println(matcher.start());
            System.out.println(matcher.group());
        }

    }
}
