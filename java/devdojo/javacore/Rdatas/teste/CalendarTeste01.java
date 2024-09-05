package devdojo.javacore.Rdatas.teste;

import java.util.Calendar;

public class CalendarTeste01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        

        if(calendar.getFirstDayOfWeek() == calendar.SUNDAY){
            System.out.println("Domingão sagrado é o primeiro dia da semana");
        }
        calendar.add(Calendar.DAY_OF_MONTH, 0);

        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
    }
}
