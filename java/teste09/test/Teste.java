package teste09.test;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Scanner;


import teste09.dominio.FinalRevisão01;
import teste09.dominio.MinhaExcecaoCustomizada;

public class Teste extends FinalRevisão01 {
  public static void main(String[] args) {
    LocalTime localTime = LocalTime.now();
    LocalTime localTime2 = LocalTime.of(20, 23, 20);

    System.out.println(localTime);
    System.out.println(localTime2);

    System.out.println(localTime.getHour());

    LocalDate localDate = LocalDate.now();

    System.out.println(localDate.getYear());

    byte nByte = 10;
    int nInt = nByte;

    System.out.println(nInt);

    long nLong = 305084515;

    nInt = (int) nLong;

    System.out.println(nInt);

    Duration duration = Duration.between(localTime, localTime2);
    System.out.println(duration);

    // Wrappers
    Integer newInteger = 10;
    nInt = newInteger;

    System.out.println(nInt);

    Instant instant = Instant.now();
    System.out.println(instant + " cas");

    try (Scanner scanner = new Scanner(System.in)) {
      System.out.println("Digite seu nome");
      String nome = scanner.nextLine();
      if(nome.equalsIgnoreCase("Richard")){
        throw new MinhaExcecaoCustomizada();
      }
      System.out.println("Bom dia " + nome);
    } catch (MinhaExcecaoCustomizada e) {
      e.printStackTrace();
    }

    Calendar calendar = Calendar.getInstance();

    System.out.println(calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));

    System.out.println(localDate.getMonthValue());

  }

}
