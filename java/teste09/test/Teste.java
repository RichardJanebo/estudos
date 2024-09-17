package teste09.test;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Teste {

  public static void main(String[] args) {

    int arreyTeste [] = new int[]{10,20,30};

    for (int i : arreyTeste) {
      System.out.println(i);
    }


    LocalDate localDate = LocalDate.now();

    System.out.println(localDate);


    ChronoUnit chronoUnit = ChronoUnit.DAYS;

    System.out.println(chronoUnit.between(localDate, localDate.plusDays(10)));


    LocalTime localTime = LocalTime.now();

    System.out.println("Local Time" + localTime);

    LocalDateTime localDateTime = LocalDateTime.now();
    System.out.println(localDateTime);


  




    // try{
    //   throw new ArrayIndexOutOfBoundsException();
    // }catch(ArrayIndexOutOfBoundsException e){
    //   e.printStackTrace();
    // }catch(IndexOutOfBoundsException e){
    //   e.printStackTrace();
    // }catch(RuntimeException e){
    //   e.printStackTrace();
    //   System.out.println("Dentro do Runtime");
    // }finally{
    //   System.out.println("Dentro do finaly");
    // }





  }
}