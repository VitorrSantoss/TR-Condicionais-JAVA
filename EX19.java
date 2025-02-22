import java.util.Scanner;

public class EX19 {

  public static void main(String[] args) {
    System.out.println("Digite um número:");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    sc.close();

    int milhao = num / 100000 % 10;
    int milhar = num / 1000 % 10;
    int centena = num / 100 % 10;
    int dezena = num / 10 % 10;
    int unidade = num / 1 % 10;

    System.out.printf("Milhão: %d\nMilhar: %d\nCentena: %d\nDezena: %d\nUnidade: %d", milhao, milhar, centena, dezena, unidade);
  }
}
