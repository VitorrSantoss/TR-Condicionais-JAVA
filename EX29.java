import java.util.Scanner;

public class EX29 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite um número (3 dígitos)");
    int num = sc.nextInt();
    sc.close();

    int centena = num / 100 % 10;
    int dezena = num / 10 % 10;
    int unidade = num / 1 % 10;

    System.out.printf("Soma -> %d + %d + %d = %d",centena, dezena, unidade, centena+dezena+unidade );

  }
}
