import java.util.Scanner;

public class SimulacaoBancaria {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double saldo = 0;
    boolean continuar = true;

    while (continuar) {
      int opcao = scanner.nextInt();

      switch (opcao) {
        case 1:
          double deposito = scanner.nextDouble();
          saldo += deposito;
          System.out.println("Saldo atual: " + saldo);
          break;
        case 2:
          double saque = scanner.nextDouble();
          fazerSaque(saldo, saque);
          break;
        case 3:
          System.out.println("Saldo atual: " + saldo);
          break;
        case 0:
          System.out.println("Programa encerrado.");
          continuar = false;
          break;
        default:
          System.out.println("Opção inválida. Tente novamente.");
      }
    }
    scanner.close();
  }

  public static void fazerSaque(double saldo, double saque) {
    if (saque > saldo) {
      System.out.println("Saldo insuficiente.");
    } else {
      saldo -= saque;
      System.out.println("Saldo atual: " + saldo);
      
    }

  }

}