package devdojo.javacore.Rdatas.teste;

import java.util.Date;

public class DateTeste01 {
    public static void main(String[] args) {
        Date date = new Date(1725530023617L);
        date.setTime(date.getTime() + 3_600_000);
        System.out.println(date);
        
    }
}
