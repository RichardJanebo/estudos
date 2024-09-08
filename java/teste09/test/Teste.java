package teste09.test;

import java.text.DateFormat;
import java.util.Calendar;

public class Teste {
  public static void main(String[] args) {
    Calendar calendar = Calendar.getInstance();
    System.out.println(calendar.get(Calendar.YEAR));

    DateFormat dateFormat = DateFormat.getInstance();
    System.out.println(dateFormat.format(calendar.YEAR));
  }    

}
